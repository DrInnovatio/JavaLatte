package unit_10;
import java.awt.*;

class SydneySub extends Frame{

    private BorderLayout borderLayout = new BorderLayout(10, 10);

    private Label label1 = new Label("1");
    private Label label2 = new Label("2");
    private Label label3 = new Label("3");
    private Label label4 = new Label("4");
    private Label label5 = new Label("5");

    public SydneySub(){
        super();
        init();
        this.setSize(300, 200);
        this.setVisible(true);
    }
    public void init(){
        this.setLayout(borderLayout);
        this.setBackground(Color.black);
        label1.setBackground(Color.red);
        label2.setBackground(Color.YELLOW);
        label3.setBackground(Color.BLUE);
        label4.setBackground(Color.PINK);
        label5.setBackground(Color.GREEN);

        this.add("Center", label1);
        this.add("South", label2);
        this.add("North", label3);
        this.add("West", label4);
        this.add("East", label5);
    }
}

public class Sydney {

    public static void main(String[] args) {
        SydneySub sydneySub = new SydneySub();
    }
}
