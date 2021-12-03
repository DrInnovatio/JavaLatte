package unit_11;

import java.awt.*;

class Exam_30_sub extends Frame{

    private FileDialog fd = new FileDialog(this, "Open my folder", FileDialog.LOAD);


    public Exam_30_sub(){
        super("Text AREA");
        this.init();
        this.setSize(300, 200);
        this.setVisible(true);
        fd.setVisible(true);
        System.out.println("Directory = " + fd.getDirectory());
        System.out.println("FileName = " + fd.getFile());
    }

    public void init(){

        fd.setVisible(true);
    }
}

public class Exam_30 {

    public static void main(String[] args) {
        Exam_30_sub exe = new Exam_30_sub();
    }
}
