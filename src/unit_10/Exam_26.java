package unit_10;

import java.awt.*;

class Exam_26_sub extends Frame {

    private FlowLayout flow = new FlowLayout();
    private TextField textField = new TextField("www.", 15);

    public Exam_26_sub(){
        super("Yahoo");
        this.init();
        this.setSize(300, 200);
        this.setVisible(true);
        //textField.setCaretPosition(6);
        System.out.println(textField.getText());
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        textField.setSelectionStart(2);
        textField.setSelectionEnd(6);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        textField.setText("Winter");

    }

    public void init(){
        this.setLayout(flow);
        textField.setBackground(Color.red);
        textField.setEditable(true);
        this.add(textField);

    }

}

public class Exam_26 {

    public static void main(String[] args) {
        Exam_26_sub ex = new Exam_26_sub();
    }
}
