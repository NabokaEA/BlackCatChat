import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientHandler {
    private Socket socket;
    private InputStream inputStream;
    private OutputStream outputStream;


    public ClientHandler(Socket socket) {
        this.socket = socket;
        try {
            inputStream=socket.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
