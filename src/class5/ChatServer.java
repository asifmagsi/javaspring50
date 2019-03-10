/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author shahzad
 */
public class ChatServer {

    public static void main(String[] args) {
        try {
            // a. Start the Server (Listening)
            ServerSocket server = new ServerSocket(9999);
            System.out.println("--> Server is up and running ... ");

            // b. Listen to New Clients
            Socket client = server.accept();
            System.out.println("--> New Client: " + client);

            // c. Input/Output Stream Object
            InputStream clientIn
                    = new BufferedInputStream(
                            client.getInputStream());
            OutputStream clientOut
                   = new BufferedOutputStream (
                            client.getOutputStream()) ;
                           

            // d. Data Read / Write
            byte[] b = new byte[1024];
            while (true) {
                // d.1 - Read from client
                int readBytes = clientIn.read(b);
                System.out.print(
                        "--->"
                        + new Date(System.currentTimeMillis())
                        + new String(b, 0, readBytes)
                );
                
                // d.2 - Write back to client
                clientOut.write(b, 0, readBytes);
                clientOut.flush(); // immeidate transfer
            }
        } catch (Exception e) {

        }
    }
    
    /**
     * 
     */
}
