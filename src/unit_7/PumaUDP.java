package unit_7;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PumaUDP {

    public static void main(String[] args) throws IOException {
        byte[] by = new byte[65508];
        DatagramPacket dp = new DatagramPacket(by, by.length);
        DatagramSocket soc = new DatagramSocket(7777);
        System.out.println("Server is ready....");
        soc.receive(dp);
        soc.close();

        System.out.println("Sender is  " + dp.getAddress().getHostAddress());
        System.out.println("Content is  " + new String(dp.getData()).trim());

    }
}
