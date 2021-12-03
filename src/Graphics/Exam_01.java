package Graphics;

import java.awt.*;

class Exam_01_sub extends Frame{
    public Exam_01_sub(){
        super("Google");
        this.init();
        this.setSize(300, 200);
        this.setVisible(true);

    }
    public void init(){

    }

    /**
    public void update(Graphics g){  // clear the screen.
        paint(g);
    }**/

    public void paint(Graphics g){

    }

}

public class Exam_01 {

    public static void main(String[] args) {
        Exam_01_sub exe = new Exam_01_sub();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ignored){
        }exe.repaint();
    }
}
