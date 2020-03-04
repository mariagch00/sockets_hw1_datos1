package com.javalimos;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
// With this class the server is created
public class SocketServer {
    public static void main(String[] args){
        boolean active = true;
        try {
            ServerSocket serverSocket = new ServerSocket (60000);
            while (active){
                System.out.println("Listening...");
                Socket entry = serverSocket.accept();
                BufferedReader read = new BufferedReader(
                        new InputStreamReader (entry.getInputStream()));
                String message = read.readLine();
                System.out.println("Message received: "+message);
                entry.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
