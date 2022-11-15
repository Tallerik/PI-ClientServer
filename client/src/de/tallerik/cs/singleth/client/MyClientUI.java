package de.tallerik.cs.singleth.client;

import java.io.IOException;

public class MyClientUI {
    public static void main(String[] args) throws IOException {
        MyClient m = new MyClient("10.140.241.85", 2000);
//        MyClient m = new MyClient("localhost", 2000);
        m.verbinden();
        m.schreiben("a");
        while (true) {

            m.abfragen('a');
        }
    }
}
