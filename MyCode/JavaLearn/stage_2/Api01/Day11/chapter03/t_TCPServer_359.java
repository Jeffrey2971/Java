package Api01.Day11.chapter03;

/*
    创建BS版本的服务器
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class t_TCPServer_359 {
    public static void main(String[] args) throws IOException {
        // 创建一个服务器ServiceSocket对象，和系统要指定的端口号
        ServerSocket server = new ServerSocket(8080);
        // 使用accept方法获取到请求的客户端对象（浏览器）
        Socket socket = server.accept();
        // 使用socket对象中的方法getInputStream获取到网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        // 使用网络字节输入流InputStream对象中的方法read读取客户端的请求信息
        /*byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read())!=-1) {
            System.out.println(new String(bytes, 0,len));
        }*/

        // 把网络字节输入流对象，转换为字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        // 把客户端请求信息的第一行读取出来
        String line = br.readLine();
        // 把读取的信息进行切割，只要中间的部分
        String[] array = line.split(" ");
        // 把路径前面的/去掉，进行截取
        String htmlpath = array[1].substring(1);
        // 创建本地字节输入流，构造方法中绑定要读取的HTML路径
        FileInputStream fis = new FileInputStream(htmlpath);
        // 使用socket中的方法getOutputStream获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        // 写入HTTP协议响应头,固定写法
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content‐Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        os.write("\r\n".getBytes());
        // 一读一写复制文件，把服务器读取的HTML文件回写到客户端
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        // 释放资源
        fis.close();
        socket.close();
        server.close();
    }
}
