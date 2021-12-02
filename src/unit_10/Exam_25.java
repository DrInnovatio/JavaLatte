package unit_10;
import java.awt.*;

class Exam_25_sub extends  Frame{

    private FlowLayout flow = new FlowLayout();
    private Label label = new Label("Birthday : ", Label.RIGHT);
    private Choice year = new Choice();
    private Label label1 = new Label("year", Label.LEFT );
    private Choice month = new Choice();
    private Label label2 = new Label("month", Label.LEFT);
    private Choice date = new Choice();
    private Label label3 = new Label("date", Label.LEFT);


    public Exam_25_sub(){
        super("Birthday");
        this.init();
        this.pack();
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(flow);
        this.add(label);
        for(int i = 1900; i <= 2050; i++){
            year.addItem(String.valueOf(i));
        }
        this.add(year);
        this.add(label1);
        for(int i = 1; i <= 12; i++){
            month.addItem(String.valueOf(i));
        }
        this.add(month);
        this.add(label2);
        for(int i = 1; i <= 31; i++){
            date.addItem(String.valueOf(i));
        }
        this.add(date);
        this.add(label3);

    }


}

public class Exam_25 {
    public static void main(String[] args) {
        Exam_25_sub ex = new Exam_25_sub();
    }
}
