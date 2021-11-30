package unit_7;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NetworkUDP {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("The Data being sent.");
        String data = scan.next();

        InetAddress ia = InetAddress.getByName("192.168.1.110");
        DatagramPacket dp = new DatagramPacket(data.getBytes(), data.getBytes().length,ia,7777);
        DatagramSocket soc = new DatagramSocket();
        soc.send(dp);
        soc.close();
        System.out.println("Connecting...");
    }

}

// User Datagram Protocol
// UDP is like sending a letter but cannot receive the response immediately.