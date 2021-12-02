package unit_10;
import java.awt.*;

class Exam_23_sub extends Frame{

    private FlowLayout fl = new FlowLayout();
    private Choice choice = new Choice();

    public Exam_23_sub() throws InterruptedException {
        super("Amazon");
        this.init();
        this.setSize(300, 200);
        this.setVisible(true);
        System.out.println(choice.getItem(0));
        System.out.println(choice.getItemCount());
        System.out.println(choice.getSelectedIndex());
        System.out.println(choice.getSelectedItem());

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        choice.remove(2);
    }

    public void init(){
        this.setLayout(fl);
        choice.add("James");
        choice.add("Paul");
        choice.addItem("Harry");
        choice.insert("Adam",0);
        this.add(choice);
    }
}

public class Exam_23 {
    public static void main(String[] args) throws InterruptedException {
        Exam_23_sub ex = new Exam_23_sub();
    }
}
