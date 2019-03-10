/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

import com.sun.xml.internal.stream.writers.XMLStreamWriterImpl;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author shahzad
 */
public class ChatClient {

    public static void main(String[] args) {
        try {
            // a. Connection to server
            Socket server = new Socket("127.0.0.1", 9999);
            System.out.println("--Connection Establish:" + server);

            // b. Input Keyboard/Output Stream
            InputStream keyboard = new BufferedInputStream(System.in);
            OutputStream serverOut = new BufferedOutputStream(
                    server.getOutputStream());
            InputStream serverIn = new BufferedInputStream(
                    server.getInputStream());
            byte[] b = new byte[1024];
            while (true) {
                // c. Take input from keyboard
                System.out.print(">>");
                int readBytes = keyboard.read(b);

                // d. Write to server
                serverOut.write(b, 0, readBytes);
                serverOut.flush(); // send immediately
                
                // Read from Client
                readBytes = serverIn.read(b) ;
                System.out.println(
                        "--->"
                        + new Date(System.currentTimeMillis())
                        + new String(b, 0, readBytes)
                );
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
