/**
 * An echo server listening on port 6007. This server reads from the client
 * and echoes back the result.
 */

import java.net.*;
import java.io.*;

public class  EchoServer
{public static void main(String []args) {
    try (
            ServerSocket echoserver = new ServerSocket(6007);
            Socket clientSocket = echoserver.accept();


            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
            )

}
}
