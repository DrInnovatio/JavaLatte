package unit_11;

import javafx.scene.layout.Pane;

import java.awt.*;

class Exam_32_sub extends Frame{

    private Label idlb = new Label("ID");
    private Label passlb = new Label("Password");

    private TextField idtf = new TextField();
    private TextField passtf = new TextField();
    private Button loginbt = new Button("Log In");
    private Button regbt = new Button("Sign Up");

    private BorderLayout bl = new BorderLayout(5, 5);

    public Exam_32_sub(String str){
        super(str);
        this.init();
        this.setSize(400, 200);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        Dimension di1 = this.getSize();
        this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), (int)(di.getHeight() / 2 - di.getHeight() / 2));
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(bl);

        Panel p = new Panel(new GridLayout(3, 1, 5, 5));
        p.add(idlb);
        p.add(passlb);
        p.add(new Label());
        this.add("West", p);

        Panel p1 = new Panel(new GridLayout(3,1,5,5));
        p1.add(idtf);
        passtf.setEchoChar('*');
        p1.add(passtf);
        Panel p2 = new Panel(new GridLayout(1,2,3,3));
        p2.add(loginbt);
        p2.add(regbt);

        p1.add(p2);
        this.add("Center", p1);
    }
}

public class Exam_32 {

    public static void main(String[] args) {
        Exam_32_sub exe = new Exam_32_sub("Log In");
    }
}
