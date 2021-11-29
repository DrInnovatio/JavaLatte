import java.io.*;
import java.net.*;

public class Network  {

    public static void main(String[] args) throws Exception {

        InetAddress ia = InetAddress.getByName("www.naver.com");


        System.out.println(ia.getHostAddress());
    }
}
