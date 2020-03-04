package com.javalimos;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
public class SocketServer {
    public static void main(String[] args){
        boolean active = true;
        try {
            ServerSocket serverSocket = new ServerSocket (40000);
            while (active){
                System.out.println("Listening...");
                Socket entry = serverSocket.accept();
                BufferedReader read = new BufferedReader(
                        new InputStreamReader (entry.getInputStream()));
                String mensaje = read.readLine();
                System.out.println("Message received: "+mensaje);
                entry.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
