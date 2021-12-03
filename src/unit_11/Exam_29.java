package unit_11;

import java.awt.*;

class Exam_29_sub extends Frame{

    private Dialog dg = new Dialog(this, "Dialog", false);

    public Exam_29_sub(){
        super("Text ");
        this.init();
        this.setSize(300   , 200);
        this.setVisible(true);
        dg.setVisible(true);
    }

    public void init(){
        dg.setSize(100, 100);
        dg.setUndecorated(true);
    }
}

public class Exam_29 {

    public static void main(String[] args) {
        Exam_29_sub exe = new Exam_29_sub();
    }
}
