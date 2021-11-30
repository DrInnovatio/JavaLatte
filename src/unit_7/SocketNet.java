package unit_7;

import java.io.*;
import java.net.*;

public class SocketNet {

    public static void main(String[] args) throws IOException {
        Socket soc = null;
        InetAddress ia = null;

        try {
            ia = InetAddress.getByName("www.daum.net");
        }catch(UnknownHostException e){}

        try {
            soc = new Socket(ia, 80);
            String request = "GET http://www.daum.net/index.html HPPT1/0\r\n\n";
            //Output
            OutputStreamWriter osw = new OutputStreamWriter(soc.getOutputStream());
            BufferedWriter bos = new BufferedWriter(osw, 512);
            PrintWriter pw = new PrintWriter(bos);
            pw.println(request);
            pw.flush();
            //input
            InputStreamReader isr = new InputStreamReader(soc.getInputStream());
            BufferedReader br = new BufferedReader(isr, 512);

            while(true){
                String str = br.readLine();
                if(str == null)
                    break;
                System.out.println(str);
            }

            pw.close();
            br.close();

        } catch (IOException e){}
    }// main
}//class

//must memory this page.
//must memory this page.
//must memory this page.
//must memory this page.
//must memory this page.
