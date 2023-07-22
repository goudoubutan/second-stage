function getAccount(){
    $.ajax({
        url: "/allTypes",
        method: "GET",
        success: function (res){
            if (res.code == 200){
                // console.log(res);
                var content = "";
                for (i = 0; i < res.data.length; i++){
                    content += "<div class='col-lg-3 col-md-4 col-sm-6 pb-1'>";
                    content += "<a class='text-decoration-none' href='/products?tid= "+ res.data[i].tid +"'>";
                    content += "<div class='cat-item d-flex align-items-center mb-4'>";
                    content += "<div class='overflow-hidden' style='width: 100px; height: 100px;'>";
                    content += "<img class='img-fluid' src=' "+ res.data[i].tsrc + "' alt=''>";
                    content += "</div>";
                    content += "<div class='flex-fill pl-3'>";
                    content += "<h6>" + res.data[i].tname + "</h6>";
                    content += "<small class='text-body'>"+res.data[i].tnum+"</small>";
                    content += "</div>";
                    content += "</div>";
                    content += "</a>";
                    content += "</div>";
                }
                $("#result").append(content);
            }
        }
    })
}


function getProducts(){
    $.ajax({
        url: "/product",
        method: "get",
        success: function (res){
            if (res.code == 200){
                var content = "";
                for (i = 0; i < res.data.length; i++){
                    content += "<div class='col-lg-3 col-md-4 col-sm-6 pb-1'>";
                    content += "<div class='product-item bg-light mb-4'>";
                    content += "<div class='product-img position-relative overflow-hidden'>";
                    content += "<img class='img-fluid w-100' src=' "+ res.data[i].psrc + "' alt=''>";
                    content += "<div class='product-action'>";
                    content += "<a class='btn btn-outline-dark btn-square' href='/pages/detail.html?pid="+res.data[i].pid+"'><i class='fa fa-shopping-cart'></i></a>"; //前往物品详情页
                    content += "<a class='btn btn-outline-dark btn-square' onclick='likes("+res.data[i].pid+")'><i class='far fa-heart'></i></a>"; //收藏
                    content += "<a class='btn btn-outline-dark btn-square' href=''><i class='fa fa-sync-alt'></i></a>"; //刷新
                    content += "<a class='btn btn-outline-dark btn-square' href=''><i class='fa fa-search'></i></a>"; // 搜索
                    content += "</div>";
                    content += "</div>";
                    content += "<div class='text-center py-4'>";
                    content += "<a class='h6 text-decoration-none text-truncate' href=''>"+ res.data[i].pname +"</a>";
                    content += "<div class='d-flex align-items-center justify-content-center mt-2'>";
                    content += "<h5>$"+ res.data[i].pprice +"</h5><h6 class='text-muted ml-2'><del>$"+ res.data[i].oprice +"</del></h6>";
                    content += "</div>";
                    content += "<div class='d-flex align-items-center justify-content-center mb-1'>";
                    content += "<small class='fa fa-star text-primary mr-1'></small>";
                    content += "<small class='fa fa-star text-primary mr-1'></small>";
                    content += "<small class='fa fa-star text-primary mr-1'></small>";
                    content += "<small class='fa fa-star text-primary mr-1'></small>";
                    content += "<small class='fa fa-star text-primary mr-1'></small>";
                    content += "<small>"+res.data[i].pstar+"</small>";
                    content += "</div>";
                    content += "</div>";
                    content += "</div>";
                    content += "</div>";
                }
                $("#products").append(content);
                $("#products1").append(content);
            }
        }
    })
}

function getShopCenter(){
    $.ajax({
        url: "/product",
        method: "get",
        success: function (res){
            if (res.code == 200){
                var content = "";
                for (i = 0; i < res.data.length; i++){
                    content += "<div class='col-lg-4 col-md-6 col-sm-6 pb-1'>";
                    content += "<div class='product-item bg-light mb-4'>";
                    content += "<div class='product-img position-relative overflow-hidden'>";
                    content += "<img class='img-fluid w-100' src=' "+ res.data[i].psrc + "' alt=''>";
                    content += "<div class='product-action'>";
                    content += "<a class='btn btn-outline-dark btn-square' href='/pages/detail.html?pid="+res.data[i].pid+"'><i class='fa fa-shopping-cart'></i></a>"; //前往物品详情页
                    content += "<a class='btn btn-outline-dark btn-square' onclick='likes("+res.data[i].pid+")'><i class='far fa-heart'></i></a>"; //收藏
                    content += "<a class='btn btn-outline-dark btn-square' href=''><i class='fa fa-sync-alt'></i></a>"; //刷新
                    content += "<a class='btn btn-outline-dark btn-square' href=''><i class='fa fa-search'></i></a>"; // 搜索
                    content += "</div>";
                    content += "</div>";
                    content += "<div class='text-center py-4'>";
                    content += "<a class='h6 text-decoration-none text-truncate' href=''>"+ res.data[i].pname +"</a>";
                    content += "<div class='d-flex align-items-center justify-content-center mt-2'>";
                    content += "<h5>$"+ res.data[i].pprice +"</h5><h6 class='text-muted ml-2'><del>$"+ res.data[i].oprice +"</del></h6>";
                    content += "</div>";
                    content += "<div class='d-flex align-items-center justify-content-center mb-1'>";
                    content += "<small class='fa fa-star text-primary mr-1'></small>";
                    content += "<small class='fa fa-star text-primary mr-1'></small>";
                    content += "<small class='fa fa-star text-primary mr-1'></small>";
                    content += "<small class='fa fa-star text-primary mr-1'></small>";
                    content += "<small class='fa fa-star text-primary mr-1'></small>";
                    content += "<small>"+res.data[i].pstar+"</small>";
                    content += "</div>";
                    content += "</div>";
                    content += "</div>";
                    content += "</div>";
                }
                $("#shopCenter").html(content);
            }
        }
    })
}

function getLoginUser (){
    $.ajax({
        url: "/getLoginUser",
        method: "get",
        success: function (res){
            if (res.code == 200){
                $("#loginUser").html(res.data.username);
                $("#my").html("<button class='dropdown-item' type='button' >余额:￥"+res.data.money+"元</button><button class='dropdown-item' onclick='toSelf("+res.data.username+")' type='button'>前往个人中心</button>");
            }
        }
    })
}

function likes(pid){
    $.ajax({
        url: "/likes",
        method: "post",
        data: {
            pid: pid
        },
        success: function (){
            updLikes();
        }
    })
}

function updLikes(){
    $.ajax({
        url: "/selectLikes",
        method: "get",
        success: function (res){
            $("#likes").html(res.data);
        }
    })
}
function updCart(){
    $.ajax({
        url: "/selectCart",
        method: "get",
        success: function (res){
            $("#carts").html(res.data);
        }
    })
}
function clickcarts(){
    window.location.href = "/pages/cart.html";
}