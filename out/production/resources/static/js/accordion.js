layui.use('jquery', function () {
    var $ = layui.jquery;
    var $data ;
    $.ajax({
        // url: '/accordion.json',
        url: '/module/listModule',
        type: "post",
        dataType: "JSON",
        success: function (data) {
            $data =data;
            initNav($data);
        }
    })

    var firstChildren;

    function initNav(data) {
        initAccordion(data, null);
        $.each(data, function (index) {
            var obj = $(this);
            if (obj != null && obj.length > 0) {
                $("#topNav").append("<li class=\"layui-nav-item layui-nav-lft\" value='"+obj[0].id+"'><a href=\"javascript:void(0);\"><i class=\"layui-icon\">" + obj[0].layuiIcon + "</i>" + obj[0].text + "</a></li>");
            }
        })
    }
    $(document).on("click",".layui-nav-lft",function(){
        var id = $(this).attr("value");
        initAccordion($data,id);
    })
    //第一个参数是集合对象，第二个参数是点击的菜单编号
    function initAccordion(data, index) {
        $("#leftNav").html("");

        if (data == null) {
            return;
        }
        var children;
        //如果index菜单编号为null,则获取集合中数据的第一个数据
        if (index == null) {
            children = data[0].children;
        }else{//index不为null,则从传入的集合数据中判断找到的编号，获取子级集合
            $.each(data, function () {
                if($(this)[0].id==index){
                    children=$(this)[0].children;
                }
            })
        }
        $.each(children, function () {
            var obj = $(this);
            if (obj != null && obj.length > 0) {
                var nav = "<li class=\"layui-nav-item site-demo-active\" id=\""+obj[0].id+"\" options='"+JSON.stringify(obj[0])+"'>\n" +
                    "<a class=\"layui-nav-fold\" href=\"javascript:void(0);\"><i class=\"layui-icon\">" + obj[0].layuiIcon + "</i>" + obj[0].text + "</a>\n";
                if (obj[0].children != null && obj[0].children.length > 0) {
                    nav += "<dl class=\"layui-nav-child\">";
                    $.each(obj[0].children, function () {
                        nav += "<dd class=\"site-demo-active\"  options='"+JSON.stringify($(this)[0])+"'><a href=\"javascript:void(0);\" ><i class=\"layui-icon\">" + $(this)[0].layuiIcon + "</i>\"+$(this)[0].text+\"</a></dd>";

                    })
                    nav += "</dl>"
                }
                nav += "</li>"
            }
            $("#leftNav").append(nav);
        })
    }



})