package de.tallerik.cs.singleth.client;

import de.tallerik.cs.singleth.client.lib.Socket;

import java.io.IOException;

public class MyClient {
    private String host;
    private int port;

    private Socket s;

    public MyClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void verbinden() {
        try {
            s = new Socket(host,port);
            s.connect();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void abmelden() {
        try {
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean abfragen(char x) {
        try {
            System.out.println(s.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; //TODO: HuH?
    }
    public void schreiben(String text) {
        try {
            s.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
