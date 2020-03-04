package com.javalimos;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws IOException{
        Socket client = new Socket("127.0.0.1", 60000);
        OutputStreamWriter writer= new OutputStreamWriter(client.getOutputStream());
        writer.write("Hola\n");
        writer.flush();
        client.close();

    }


}

