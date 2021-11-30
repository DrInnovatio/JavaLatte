package unit_7;

import java.io.*;
import java.net.*;

public class Network  {

    public static void main(String[] args) throws Exception {

        InetAddress ia = null;
        InetAddress ia1 = null;
        InetAddress[] ia2 = null;

        try{
            ia = InetAddress.getLocalHost();
            ia1 = InetAddress.getByName("www.naver.com");
            ia2 = InetAddress.getAllByName("www.google.com");
        } catch (UnknownHostException ignored){}

        System.out.println("ia.hostAddress = " + ia.getHostAddress());
        System.out.println("ia.hostName = " + ia.getHostName());
        System.out.println();
        System.out.println("ia1.hostAddress = " + ia1.getHostAddress());
        System.out.println("ia1.hostName = " + ia1.getHostName());
        System.out.println();

        for(int i = 0; i < ia2.length; i++){
            System.out.println("ia2[" + i + "].hostAddress = " + ia2[i].getHostAddress());
            System.out.println("ia2[" + i + "].hostName = " + ia2[i].getHostName());
        }
    }
}

/**
 * 2. TCP 통신
 *
 * TPC 통신의 장점과 단점
 *
 * TPC 구현을 위한 클래스들.
 *- InetAddress class 어디서든 사용가능.
 * -Socket class
 * -ServerSocket class
 *
 * **/
