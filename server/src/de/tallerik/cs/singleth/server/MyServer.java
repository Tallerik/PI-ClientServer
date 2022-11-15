package de.tallerik.cs.singleth.server;

import de.tallerik.cs.singleth.server.lib.ServerSocket;
import de.tallerik.cs.singleth.server.lib.Socket;

import java.io.IOException;

public class MyServer {

    private int port;
    private ServerSocket ss;

    public MyServer(int port) {
        this.port = port;
        try {
            this.ss = new ServerSocket(this.port);
            runServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void runServer() throws IOException {

        while (true) {
            Socket s = ss.accept();
            int empfang;
            do {
                empfang = s.read();
                if (empfang == 'a') {
                    s.write("Hallo\n");
                }

            } while (empfang != (int)'b');
            s.close();
        }
    }

    public void beendeServer() {

    }





}
