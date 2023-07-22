function checkColor(cid){
    if (cid == 0){
        $("#pcolor").append("");
    }else if (cid == 1){
        $("#pcolor").append(' <strong class="text-dark mr-3" >颜色:</strong>\n' +
            '                        <form>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="color-1" name="color">\n' +
            '                                <label class="custom-control-label" for="color-1">白色</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="color-2" name="color">\n' +
            '                                <label class="custom-control-label" for="color-2">黑色</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="color-3" name="color">\n' +
            '                                <label class="custom-control-label" for="color-3">红色</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="color-4" name="color">\n' +
            '                                <label class="custom-control-label" for="color-4">蓝色</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="color-5" name="color">\n' +
            '                                <label class="custom-control-label" for="color-5">绿色</label>\n' +
            '                            </div>\n' +
            '                        </form>')
    }else if (cid == 2){
        $("#pcolor").append(' <strong class="text-dark mr-3" >颜色:</strong>\n' +
            '                        <form>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="color-1" name="color">\n' +
            '                                <label class="custom-control-label" for="color-1">暗夜紫</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="color-2" name="color">\n' +
            '                                <label class="custom-control-label" for="color-2">深空黑色</label>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="color-3" name="color">\n' +
            '                                <label class="custom-control-label" for="color-3">银色</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="color-4" name="color">\n' +
            '                                <label class="custom-control-label" for="color-4">金色</label>\n' +
            '                            </div></form>')
    }
}


function checkSize(sid){
    if (sid == 0){
        $("#psize").append("");
    }else if (sid == 1){
        $("#psize").append(' <strong class="text-dark mr-3" id="psize">尺寸:</strong>\n' +
            '                        <form>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-1" name="size">\n' +
            '                                <label class="custom-control-label" for="size-1">XS</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-2" name="size">\n' +
            '                                <label class="custom-control-label" for="size-2">S</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-3" name="size">\n' +
            '                                <label class="custom-control-label" for="size-3">M</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-4" name="size">\n' +
            '                                <label class="custom-control-label" for="size-4">L</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-5" name="size">\n' +
            '                                <label class="custom-control-label" for="size-5">XL</label>\n' +
            '                            </div>\n' +
            '                        </form>')
    }else if (sid == 2){
        $("#psize").append(' <strong class="text-dark mr-3" id="psize">内存:</strong>\n' +
            '                        <form>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-1" name="size">\n' +
            '                                <label class="custom-control-label" for="size-1">128G</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-2" name="size">\n' +
            '                                <label class="custom-control-label" for="size-2">256G</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-3" name="size">\n' +
            '                                <label class="custom-control-label" for="size-3">512G</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-4" name="size">\n' +
            '                                <label class="custom-control-label" for="size-4">1TB</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-5" name="size">\n' +
            '                                <label class="custom-control-label" for="size-5">2TB</label>\n' +
            '                            </div>\n' +
            '                        </form>')
    }else if (sid == 3){
        $("#psize").append(' <strong class="text-dark mr-3" id="psize">码数:</strong>\n' +
            '                        <form>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-1" name="size">\n' +
            '                                <label class="custom-control-label" for="size-1">38</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-2" name="size">\n' +
            '                                <label class="custom-control-label" for="size-2">39</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-3" name="size">\n' +
            '                                <label class="custom-control-label" for="size-3">40</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-4" name="size">\n' +
            '                                <label class="custom-control-label" for="size-4">40.5</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-5" name="size">\n' +
            '                                <label class="custom-control-label" for="size-5">41</label>\n' +
            '                            </div>\n' +
            '                        </form>')
    }else if (sid == 4){
        $("#psize").append(' <strong class="text-dark mr-3" id="psize">款式:</strong>\n' +
            '                        <form>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-1" name="size">\n' +
            '                                <label class="custom-control-label" for="size-1">有线</label>\n' +
            '                            </div>\n' +
            '                            <div class="custom-control custom-radio custom-control-inline">\n' +
            '                                <input type="radio" class="custom-control-input" id="size-2" name="size">\n' +
            '                                <label class="custom-control-label" for="size-2">无线(蓝牙)</label>\n' +
            '                            </div></form>')
    }
}

