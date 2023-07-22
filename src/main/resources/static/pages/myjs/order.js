
function getOrders(){
    $.ajax({
        url: "/getOrders",
        method: "get",
        success: function (res){
            if (res.code == 200){
                var content = "";
                for (i=0;i<res.data.length;i++){
                    content += "<tr>";
                    // content += "<td class='align-middle'><img src='"+res.data[i].psrc+"'  style='width: 50px;'>"+res.data[i].pname+"</td>";
                    content += "<td class='align-middle'>"+res.data[i].oid+"</td>";
                    content += "<td class='align-middle'>$"+res.data[i].omoney+"</td>";
                    content +=  ''+checkostatus(res.data[i].ostatus)+'';
                    content += "<td class='align-middle'>"+dateformat(res.data[i].createdtime)+"</td>";
                    content += "<td class='align-middle'>"+dateformat(res.data[i].canceltime)+"</td>";
                    content += '<td>'+checkBtn(res.data[i].ostatus,res.data[i].oid)+'</td>'
                   // content+='<td ><button class="btn btn-primary" id="payBtn" onclick="pay(\''+res.data[i].oid+'\')">立即支付</button> <button class="btn btn-danger" onclick="delOrder(\''+res.data[i].oid+'\')">取消订单</button></td>';
                    content += "</tr>";
                }
                $("#ordertbody").append(content);
            }
        }
    })
}



function pay(oid){
    window.location.href = "/pages/checkout.html?oid="+oid;
}

function checkBtn(status,oid) {
    if (status == 1 ) {
        return '<td ><button class="btn btn-primary"  disabled>已支付</button> <button class="btn btn-danger" onclick="delOrder(\''+oid+'\')">删除订单</button></td>';
    }else if(status == 2){
        return '<td ><button class="btn btn-primary"  disabled>已取消</button> <button class="btn btn-danger" onclick="delOrder(\''+oid+'\')">删除订单</button></td>';
    }else if (status == 0){
        return '<td ><button class="btn btn-primary"  onclick="pay(\''+oid+'\')">立即支付</button> <button class="btn btn-danger" onclick="cancelOrder(\''+oid+'\')">取消订单</button></td>';
    }
}
function delOrder(oid){
    // console.log(oid);
    $.ajax({
        url: "/delOrder",
        method: "post",
        data: {
            oid: oid
        },
        success: function (res){
            if (res.code == 200){
                // alert("取消成功");
                window.location.reload();
            }
        }
    })
}

function cancelOrder(oid){
    $.ajax({
        url: "/cancelOrder",
        method: "post",
        data: {
            oid: oid
        },
        success: function (res){
            if (res.code == 200){
                // alert("取消成功");
                window.location.reload();
            }
        }
    })
}

function checkostatus(status){
    if (status == 0){
        return '<td className="align-middle" style="color: red">未支付</td>';
    }else if (status == 1){
        return  '<td className="align-middle" style="color: limegreen">已支付</td>';
    }else if (status == 2){
        return  '<td className="align-middle" style="color: black">已取消</td>';
    }
}

function dateformat(date) {
    var date = new Date(date);
    var year = date.getFullYear();
    var month = date.getMonth()+1;
    var day = date.getDate();
    var hour=date.getHours();
    var minute=date.getMinutes();
    var second=date.getSeconds();
    return year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒";
}