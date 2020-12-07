import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EchoServer {
    public EchoServer() {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Клиент подключился c хоста " + socket.getInetAddress().getHostName());
                String str = new String(socket.getInputStream().readNBytes(5), StandardCharsets.UTF_8);
                System.out.println("Клиент прислал сообщение " + str);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
