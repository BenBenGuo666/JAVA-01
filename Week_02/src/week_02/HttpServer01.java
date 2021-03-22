package week_02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Desc 单线程 Socket 程序
 * @Date 2021/3/8
 */
public class HttpServer01 {

    //TODO 1.创建一个 ServerSocket
    //TODO 2.绑定 8801 端口
    //TODO 3.当有客户端请求时通过 accept 方法拿到 Socket, 进而可以进行处理
    //TODO 4.sleep 20ms,模拟业务操作（IO）
    //TODO 5.模拟输出 HTTP 报文头和 hello
    //TODO 6.关闭 socket
    //? 试试用浏览器访问 http://localhost:8081 思考一下有什么问题？+  

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8801);
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                service(socket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private static void service(Socket socket) {

        try {
//            Thread.sleep(20);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Content-Type:text/html;charset=utf-8");
            printWriter.println();
            String body = "hello,nio";
            printWriter.println("Content-Length:" + body.getBytes().length);
            printWriter.println();
            printWriter.write(body);
            printWriter.close();
            socket.close();
        } catch (IOException e) {// | InterruptedException
            e.printStackTrace();
        }


    }

}
