package unit_11;

import java.awt.*;

class Exam_31_subsub extends Canvas{
    public void paint(Graphics g){
        g.drawLine(10, 10, 15, 15);
    }
}

class Exam_31_sub extends Frame{

    private GridLayout gl = new GridLayout(2,2,5,5);
    private Button bt1 = new Button("1");
    private Button bt2 = new Button("2");
    private Button bt3 = new Button("3");
    private Button bt4 = new Button("4");

    private Button bt11 = new Button("1-1");
    private Button bt12 = new Button("1-2");
    private Panel panel = new Panel(new FlowLayout());

    private Exam_31_subsub ess = new Exam_31_subsub();

    public Exam_31_sub(){
        super("Text AREA");
        this.init();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void init(){

        this.setLayout(gl);
        panel.add(bt11);
        panel.add(bt12);

        this.add(panel);
        this.add(bt2);
        this.add(bt3);
        this.add(ess);
    }
}

public class Exam_31 {

    public static void main(String[] args) {
        Exam_31_sub exe = new Exam_31_sub();
    }
}
