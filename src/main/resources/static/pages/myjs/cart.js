function addCart(){
    if (num < 0){
        alert("商品数量不能小于1");
    }else{
    $.ajax({
        url: "/addCart",
        method: "post",
        data: {
            pid: getParameterByName("pid"),
            pname: pname,
            psrc:psrc,
            pprice: money,
            cnum: num,
            ctotal: $("#pmoney").text().substr(1)
        },
        success: function (res){
            if(res.code == 200){
                window.location.href = "/pages/cartsuccess.html";
            }
        }
    })
    }
}

var cartsTotal = 0;
var payTotals = 0;
var cids = [];
function allCartProducts(){
    $.ajax({
        url: "/allCartProducts",
        method: "get",
        success: function (res){
            if(res.code == 200){
                var content = "";
                for (i = 0;i < res.data.length;i++){
                   content += "<tr>";
                   content += "<td class='align-middle'><img src='"+res.data[i].psrc+"'  style='width: 50px;'>"+res.data[i].pname+"</td>";
                   content += "<td class='align-middle'>$"+res.data[i].pprice+"</td>";
                   content += "<td class='align-middle'>";
                   content += "<div class='input-group quantity mx-auto' style='width: 100px;'>";
                   content += "<input type='text' class='form-control form-control-sm bg-secondary border-0 text-center'value='"+res.data[i].cnum+"' readonly='readonly'>";
                   content += "</div>";
                   content += "</td>";
                   content += "<td class='align-middle'>$"+res.data[i].ctotal+"</td>";
                   content += "<td class='align-middle'><button class='btn btn-sm btn-danger' onclick='delCart("+res.data[i].cid+")'><i class='fa fa-times'></i></button></td>";
                   content += "</tr>";
                   cartsTotal+= res.data[i].ctotal;
                   cids.push(res.data[i].cid);
                }
                payTotals = cartsTotal+10;
                // console.log(cartsTotal)
                $("#tbody").append(content);
            }
            complete: {
                updCartsTotal();
                payTotal();
            }
        }
    })
}
function updCartsTotal(){
    // console.log(this.cartsTotal)
    $("#cartsTotal").html("$"+cartsTotal.toFixed(2));
}

function payTotal(){
    $("#payTotal").html("$"+payTotals.toFixed(2));
}
// console.log(cids)
function delCart(id){
    $.ajax({
        url: "/delCart",
        method: "post",
        data: {
            cids: cids,
            cid: id
        },
        success: function (res){
            if(res.code == 200){
                window.location.reload();
            }
        }
    })
}

function generateOrder(){
    $.ajax({
        url: "/generateOrder",
        method: "post",
        data: {
            omoney: payTotals
        },
        success: function (res){
            if(res.code == 200){
                alert("订单生成成功!");
                window.location.href = "/pages/order.html";
            }
        }
    })
}