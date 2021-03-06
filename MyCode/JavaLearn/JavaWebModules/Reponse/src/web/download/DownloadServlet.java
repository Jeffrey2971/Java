package web.download;

import web.util.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downLoadServlet")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求参数，文件名称
        String filename = request.getParameter("filename");
        // 使用字节输入流加载文件进内存
            // 找到文件的服务器路径
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/img/" + filename);
        // 用字节流关联
        FileInputStream fis = new FileInputStream(realPath);

        // 设置response的响应头
            // 设置响应头：content-type
        String mimeType = servletContext.getMimeType(filename); // 获取文件的mime类型
        response.setHeader("content-type", mimeType);
            // 设置响应头打开方式：content-disposition
        // 解决中文文件名问题
            // 获取user-agent请求头
        String agent = request.getHeader("user-agent");
        // 使用工具类方法编码文件名
        String fileName = DownLoadUtils.getFileName(agent, filename);

        response.setHeader("content-disposition", "attachment;filename=" + fileName);

        // 将输入流的数据写出到输出流中
        ServletOutputStream sos = response.getOutputStream();
        byte[] buff = new byte[1024 * 8];
        int len = 0;
        while((len = fis.read(buff)) != -1){
            sos.write(buff, 0, len);
        }

        fis.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doPost(request,response);
    }
}
