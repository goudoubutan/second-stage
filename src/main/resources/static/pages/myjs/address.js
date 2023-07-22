$(function(){
    $.ajax({
        url:"/provinces",
        type:"get",
        success:function (res){
            $("#provinces").empty()
            $("#provinces").append("<option value=''>请选择</option>")
            for (const x in res){
            $("#provinces").append("<option value='"+res[x].provinceid+"'>"+res[x].provinceName+"</option>")
                                }
                             }
         })

    $("#provinces").change(function (){
          $.ajax({
             url:"/city",
             type:"get",
             data:{
             provinceid:$("#provinces").val()
                   },
                    success:function (res){
                       $("#city").empty()
                       $("#city").append("<option value=''>请选择</option>")
                       for (const x in res){
                        $("#city").append("<option value='"+res[x].cityid+"'>"+res[x].cityName+"</option>")
                                         }
                                }
                    })
    })

    $("#city").change(function (){
                $.ajax({
                    url:"/area",
                    type:"get",
                    data:{
                    cityid:$("#city").val()
                        },
                    success:function (res){
                    $("#area").empty()
                    $("#area").append("<option value=''>请选择</option>")
                        for (const x in res){
                        $("#area").append("<option value='"+res[x].areaid+"'>"+res[x].areaName+"</option>")
                                            }
                                         }
                        })
    })
})
