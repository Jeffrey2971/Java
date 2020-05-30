# 今日内容
- AJAX：
- JSON： 

## AJAX
- 概念：Asynchronous JavaScript And XML    异步的JavaScript 和 XML
    - 异步和同步：客户端和服务器端通信的基础上
        - 同步：客户端必须等待服务器端的响应，在等待的期间客户端不能做其他的操作
        - 异步：客户端不需要等待服务器端的操作，在服务器处理请求的过程中，客户端可以进行其他的操作
    - ajax是一种无需重新加载整个网页的情况下，能够更新网页部分内容的技术
        - 通过在后台与服务器进行少量的数据交换，ajax可以使网页实现异步更新，这就意味着可以再不重新加载整个网页的情况下，对网页的某部分内容进行更新过
        传统的网页(不使用ajax)如果需要更新内容，必须重新载入整个网页页面
    - 作用：提升用户体验

- 实现方式
    - 原生JS实现方式
         //1.创建核心对象
            var xmlhttp;
            if (window.XMLHttpRequest)
            {// code for IE7+, Firefox, Chrome, Opera, Safari
                xmlhttp=new XMLHttpRequest();
            }
            else
            {// code for IE6, IE5
                xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
            }
    
            //2. 建立连接
            /*
                参数：
                    1. 请求方式：GET、POST
                        * get方式，请求参数在URL后边拼接。send方法为空参
                        * post方式，请求参数在send方法中定义
                    2. 请求的URL：
                    3. 同步或异步请求：true（异步）或 false（同步）
    
             */
            xmlhttp.open("GET","ajaxServlet?username=tom",true);
    
            //3.发送请求
            xmlhttp.send();
    
            //4.接受并处理来自服务器的响应结果
            //获取方式 ：xmlhttp.responseText
            //什么时候获取？当服务器响应成功后再获取
    
            //当xmlhttp对象的就绪状态改变时，触发事件onreadystatechange。
            xmlhttp.onreadystatechange=function()
            {
                //判断readyState就绪状态是否为4，判断status响应状态码是否为200
                if (xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                   //获取服务器的响应结果
                    var responseText = xmlhttp.responseText;
                    alert(responseText);
                }
            }
    - JQuery框架实现方式
        - $.ajax()
            - 语法：$.ajax({键值对});
                $.ajax({
                    url:"ajaxServlet", // 请求的路径
                    type:"POST", // 请求方式
                    // data:"username=mable&age=23", // 请求参数
                    data:{"username":"mable", "age":23},
                    success:function(data){ // 响应成功后的回调函数
                        alert(data)
                    },
                    error:function () {
                        alert("出错啦")
    
                    }, // 表示如果请求响应出现异常，会执行的回调函数
                    dataType:"text" //设置接收到的相应数据的格式
                })
        - $.get()：发送get请求
            - 语法$.get(url, [data], [callback], [type])
                - 参数
                    - url：请求路径
                    - data：请求参数
                    - callback：回调函数
                    - type：响应结果的类型
        - $.post()：发送post请求