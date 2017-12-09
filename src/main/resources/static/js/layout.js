layui.use('jquery', function () {
    var $ = layui.jquery;
    $(document).on("click",".layui-main-layout-separator",function () {
        var prev = $(this).prev();
        var next = $(this).next();
        $(document).on("mousemove",".layui-main-layout-separator",function () {
            console.info("yidong");
        })
    })
});