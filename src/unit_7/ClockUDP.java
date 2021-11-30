package unit_7;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClockUDP {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Option {Time: time, Date: date, Date&Time: datetime} = ");
        String option = scan.next();

        InetAddress ia = InetAddress.getByName("192.168.1.110");
        DatagramPacket dp = new DatagramPacket(option.getBytes(), option.getBytes().length, ia, 8888);

        DatagramSocket ds = new DatagramSocket(9999);
        ds.send(dp);

        byte[] by = new byte[65508];
        dp = new DatagramPacket(by, by.length);
        ds.receive(dp);

        String ss = new String(dp.getData());
        System.out.println("The contents form the server : " + ss);

    }
}
