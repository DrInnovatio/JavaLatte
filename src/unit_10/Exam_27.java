package unit_10;

import java.awt.*;

class Exam_27_sub extends Frame{

    private FlowLayout flow = new FlowLayout();
    private TextArea textArea = new TextArea("Memo", 5, 10, TextArea.SCROLLBARS_NONE);

    public Exam_27_sub(){
        super("Text AREA");
        this.init();
        this.setSize(800, 200);
        this.setVisible(true);
    }

    public void init(){

        this.setLayout(flow);
        this.add(textArea);

    }
}

public class Exam_27 {

    public static void main(String[] args) {
        Exam_27_sub exe = new Exam_27_sub();
    }
}
