package com.csqf.zx.controller;

import com.csqf.zx.entity.CartEntity;
import com.csqf.zx.entity.OrderDetailEntity;
import com.csqf.zx.entity.OrdersEntity;
import com.csqf.zx.result.ResponseResult;
import com.csqf.zx.service.CartService;
import com.csqf.zx.service.OrderDetailService;
import com.csqf.zx.service.OrderService;
import com.csqf.zx.utils.DateTimeUtil;
import com.csqf.zx.utils.OrderNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/19 001915:13
 */
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    CartService cartService;

    @Autowired
    OrderDetailService orderDetailService;

    @RequestMapping("/generateOrder")
    public ResponseResult generateOrder(String omoney){
        ResponseResult result =ResponseResult.SUCCESS();
        OrdersEntity ordersEntity = new OrdersEntity();
        String oid = OrderNumberGenerator.generateOrderNumber();

        Date createdtime = new Date();
        Date canceltime = DateTimeUtil.addTime(createdtime, 15);
        List<CartEntity> cids = cartService.selectCid();

        ordersEntity.setCreatedtime(createdtime);
        ordersEntity.setCanceltime(canceltime);

        orderService.generateOrder(omoney,oid,ordersEntity.getCreatedtime(),ordersEntity.getCanceltime());

        for (CartEntity cid : cids) {
            OrderDetailEntity orderDetailEntity = new OrderDetailEntity();

            Integer value = Integer.valueOf(cid.getCid());

            CartEntity byCid = cartService.findByCid(value);

            orderDetailEntity.setOid(oid);
            orderDetailEntity.setOdname(byCid.getPname());
            orderDetailEntity.setOdmoney(byCid.getCtotal());
            orderDetailEntity.setOdnum(byCid.getCnum());

            orderDetailService.saveOrderDetail(orderDetailEntity);
            cartService.deleteCart(value);
        }
        return result;
    }

    @RequestMapping("/getOrders")
    public ResponseResult getOrders(){
        ResponseResult result =ResponseResult.SUCCESS();
        List<OrdersEntity> orders = orderService.getOrders();
        result.setData(orders);
        return result;
    }

    @RequestMapping("/getOrderDetail")
    public ResponseResult<OrderDetailEntity> getOrderDetail(String oid){
        ResponseResult result =ResponseResult.SUCCESS();
        List<OrderDetailEntity> orderDetail = orderDetailService.getOrderDetail(oid);
        System.out.println(orderDetail);
        result.setData(orderDetail);
        return result;
    }

    @RequestMapping("/delOrder")
        public ResponseResult delOrder(String oid){
            ResponseResult result =ResponseResult.SUCCESS();
            orderService.delOrder(oid);
            return result;
    }

    @RequestMapping("/getOrder")
    public ResponseResult getOrder(@RequestParam("oid") String oid){
        ResponseResult result =ResponseResult.SUCCESS();
        OrdersEntity order = orderService.getOrder(oid);
        result.setData(order);
        return result;
    }

    @GetMapping("/paySuccess")
    public ResponseResult paySuccess(HttpServletRequest request){

        String oid = request.getParameter("out_trade_no");

        ResponseResult result =ResponseResult.SUCCESS();
        orderService.updStatus(oid);
        return result;
    }


    @Scheduled(fixedDelay = 2000) // 每分钟执行一次
    public void checkCancelOrder(){
        //查询所有待支付的订单
        //System.out.println("订单是否过期");
        List<OrdersEntity> list = orderService.findUnpay();
        list.forEach(orderEntity -> {
            if(orderEntity.getCanceltime().getTime()<System.currentTimeMillis()){
                cancelOrder(orderEntity.getOid());
            }
        });
    }

    public void cancelOrder(String oid){
        orderService.saveOrderStatus(oid);
    }

}
