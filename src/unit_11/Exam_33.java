package unit_11;

import javafx.scene.layout.Pane;

import javax.swing.border.Border;
import java.awt.*;

class Exam_33_sub extends Frame{

    private BorderLayout bl = new BorderLayout();
    private Label namelb = new Label("Name", Label.CENTER );
    private Label titlelb = new Label("Title", Label.CENTER);
    private Label memolb = new Label("Contents", Label.CENTER);
    private TextField nametf = new TextField();
    private TextField titletf = new TextField();
    private TextArea memota = new TextArea();
    private Button regbt = new Button("Sign Up");
    private Button cancelbt = new Button("Cancel");


    public Exam_33_sub(String str){
        super(str);
        this.init();
        this.setSize( 500, 400);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        Dimension di1 = this.getSize();
        this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), (int)(di.getHeight() / 2 - di1.getHeight() / 2));
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(bl);
        Panel p =new Panel(new BorderLayout());
        Panel p1 =new Panel(new GridLayout(2,1));

        p1.add(namelb);
        p1.add(titlelb);

        p.add("West", p1);
        Panel p2 = new Panel(new GridLayout(2,1));
        p2.add(nametf);
        p2.add(titletf);
        p.add("Center", p2);
        this.add("North", p);
        Panel p3 = new Panel(new BorderLayout());
        p3.add("West", memolb);
        p3.add("Center", memota);

        this.add("Center", p3);
        Panel p4 = new Panel(new FlowLayout());
        p4.add(regbt);
        p4.add(cancelbt);
        this.add("South", p4 );

    }
}

public class Exam_33 {

    public static void main(String[] args) {
        Exam_33_sub exe = new Exam_33_sub("The Board");
    }
}
