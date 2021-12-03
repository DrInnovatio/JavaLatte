package unit_11;

import javafx.scene.layout.Pane;
import org.ietf.jgss.ChannelBinding;

import java.awt.*;

class Exam_35_sub extends Frame{

    private BorderLayout bl = new BorderLayout(5,5);
    private Label lb = new Label("NickName : ", Label.RIGHT);
    private TextField tf = new TextField();
    private Button bt = new Button("Connected");
    private TextArea ta = new TextArea();
    private Label lb1 = new Label("Talking : ", Label.RIGHT);
    private TextField tf1 = new TextField();
    private Button bt1 = new Button("Send");

    private Label lb2 = new Label("People : ", Label.RIGHT);
    private TextField tf2 = new TextField("0");
    private Label lb2_1 = new Label("num of people : ", Label.LEFT);
    private Button bt2 = new Button("LogOut");

    private Label lb3 = new Label("Member List");
    private List li3 = new List(5, false );
    private CheckboxGroup cg3 = new CheckboxGroup();
    private Checkbox cb3 = new Checkbox("quit Direct", cg3, true);
    private Checkbox cb3_1 = new Checkbox("set Direct", cg3, false);
    private Button bt3 = new Button("Disconnected");


    public Exam_35_sub(String str){
        super(str);
        this.init();
        this.setSize(500, 400);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        Dimension di1 = this.getSize();
        this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), (int)(di.getHeight() / 2 - di1.getHeight() / 2));
        //this.pack();
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(bl);
        Panel p = new Panel(new BorderLayout(2,2));
        Panel p1 = new Panel(new BorderLayout());
        p1.add("West", lb);
        p1.add("Center", tf);
        p1.add("East", bt);
        p.add("North", p1);
        p.add("Center", ta);
        Panel p2 = new Panel(new BorderLayout());
        p2.add("West", lb1);
        p2.add("West", tf1);
        p2.add("East", bt1);
        p.add("South", p2);
        this.add("Center", p);
        Panel p3 = new Panel(new BorderLayout(2,2));
        Panel p4 = new Panel(new BorderLayout());
        p4.add(lb2);
        p4.add(tf2);
        p4.add(lb2_1);
        p3.add("North", p4 );
        Panel p6 = new Panel(new BorderLayout());
        p6.add("North", lb3);
        p6.add("Center", li3);
        Panel p7 = new Panel(new GridLayout(3,1 ));
        p7.add(cb3);
        p7.add(cb3_1);
        p7.add(bt3);
        p6.add("South", p7);
        p3.add("Center", p6);
        Panel p5 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        p5.add(bt2);
        p3.add("South", p5);
        this.add("East", p3);
    }
}

public class Exam_35 {

    public static void main(String[] args) {
        Exam_35_sub exe = new Exam_35_sub("KakaoTook");
    }
}
