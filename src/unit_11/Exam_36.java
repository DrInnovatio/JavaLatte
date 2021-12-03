package unit_11;

import java.awt.*;

class Exam_36_sub extends Frame{

    private BorderLayout bl = new BorderLayout(10, 10);

    private Label lb = new Label("The whole List");
    private Button bt = new Button("Display");
    private TextArea ta = new TextArea();
    private Button bt_0 = new Button("Add");
    private Button bt_1 = new Button("Edit");
    private Button bt_2 = new Button("Delete");
    private Button bt_3 = new Button("Clear");
    private Button bt_4 = new Button("Save");
    private Button bt_5 = new Button("Open");
    private Button bt_6 = new Button("Quit");

    private Label lb2 = new Label("Enter the next information.");
    private Label lb2_1 = new Label("Name: ", Label.RIGHT);
    private Label lb2_2 = new Label("ID number: ", Label.RIGHT);
    private Label lb2_3 = new Label("Phone : ", Label.RIGHT);
    private Label lb2_4 = new Label("Address : ", Label.RIGHT);

    private TextField tf2_1 = new TextField(20);
    private TextField tf2_2_1 = new TextField(10);
    private TextField tf2_2_2 = new TextField(10);
    private TextField tf2_3 = new TextField(20);
    private TextField tf2_4 = new TextField(20);

    private Label lb3 = new Label("Search : ", Label.RIGHT);
    private TextField tf3 = new TextField(5);
    private Button bt3 = new Button("Search");
    private TextArea ta3 = new TextArea(5, 20);
    private Button bt3_1 = new Button("<<");
    private Button bt3_2 = new Button(">>");


    public Exam_36_sub(String str){
        super(str);
        this.init();
        //this.setSize(500, 400);
        this.pack();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        Dimension di1 = this.getSize();
        this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), (int)(di.getHeight() / 2 - di1.getHeight() / 2));
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(bl);
        Panel p3 = new Panel(new GridLayout(2, 1, 5, 5 ));
        Panel p4 = new Panel(new BorderLayout());
        p4.add("North", lb2);
        Panel p6 = new Panel (new GridLayout(4, 1));
        p6.add(lb2_1);
        p6.add(lb2_2);
        p6.add(lb2_3);
        p6.add(lb2_4);
        p4.add("West", p6);
        Panel p7 = new Panel (new GridLayout(4, 1));
        p7.add(tf2_1);
        Panel p8 = new Panel(new GridLayout(1,2,5,5));
        p7.add(tf2_2_1);
        p7.add(tf2_2_2);
        p7.add(p8);
        p8.add(tf2_3);
        p8.add(tf2_4);
        p4.add("Center", p7);
        p4.add("North", lb2);
        p3.add(p4);
        Panel p5 = new Panel(new BorderLayout());
        Panel p9 = new Panel(new BorderLayout());
        p9.add("West", lb3);
        p9.add("Center", tf3);
        p9.add("East", bt3);
        p5.add("North", p9);
        p5.add("Center", ta3);
        Panel p10 = new Panel(new FlowLayout());
        p10.add(bt3_1);
        p10.add(bt3_2);
        p5.add("South", p10);
        p3.add(p5);
        this.add("West", p3);
        Panel p = new Panel(new BorderLayout());
        Panel p1 = new Panel(new FlowLayout(FlowLayout.LEFT));
        p1.add(lb);
        p1.add(bt);
        p.add("North", p1);
        p.add("Center", ta);
        Panel p2 = new Panel(new GridLayout(1,7,2,2));
        p2.add(bt_0);
        p2.add(bt_1);
        p2.add(bt_2);
        p2.add(bt_3);
        p2.add(bt_4);
        p2.add(bt_5);
        p2.add(bt_6);
        p.add("South", p2);
        this.add("Center", p);


    }
}

public class Exam_36 {

    public static void main(String[] args) {
        Exam_36_sub exe = new Exam_36_sub("User Management");
    }
}
