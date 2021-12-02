package unit_10;
import java.awt.*;

class Exam_24_sub extends Frame{

    private FlowLayout fl = new FlowLayout();
    private List list = new List(6, false);

    public Exam_24_sub(){
        super();
        this.init();
        this.setSize(300, 200);
        this.setVisible(true);

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }//list.removeAll();
        list.replaceItem("Mitchel", 1);
    }

    public void init(){
        this.setLayout(fl);
        list.add("Harry");
        list.add("Kate");
        list.add("christie");
        this.add(list);
    }
}

public class Exam_24 {

    public static void main(String[] args) {
        Exam_24_sub ex = new Exam_24_sub();
    }
}
