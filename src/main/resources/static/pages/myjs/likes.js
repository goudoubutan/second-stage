function allLikesProducts(){
    $.ajax({
        url: "/allLikes",
        method: "get",
        success: function (res){
            if(res.code == 200){
                var content = "";
                for (i = 0;i < res.data.length;i++){
                    content += "<tr>";
                    content += "<td class='align-middle'><img src='"+res.data[i].psrc+"' alt='' style='width: 50px;'>"+res.data[i].productEntity.pname+"</td>";
                    content += "<td class='align-middle'>$"+res.data[i].productEntity.pprice+"</td>";
                    // content += "<td class='align-middle'>";
                    // content += "<div class='input-group quantity mx-auto' style='width: 100px;'>";
                    // content += "<input type='text' class='form-control form-control-sm bg-secondary border-0 text-center'value='"+res.data[i].cnum+"' readonly='readonly'>";
                    // content += "</div>";
                    // content += "</td>";
                    // content += "<td class='align-middle'>$"+res.data[i].ctotal+"</td>";
                    content += "<td class='align-middle'><button class='btn btn-sm btn-danger' onclick='delLike("+res.data[i].pid+")'><i class='fa fa-times'></i></button></td>";
                    content += "</tr>";
                }
                // payTotals = cartsTotal+10;
                // console.log(cartsTotal)
                $("#likestbody").append(content);
            }
            complete: {

            }
        }
    })
}

function delLike(id){
    $.ajax({
        url: "/delLike",
        method: "post",
        data: {
            pid: id
        },
        success: function (res){
            if(res.code == 200){
                // alert("Successfully deleted!")
                window.location.reload();
            }
        }
    })
}