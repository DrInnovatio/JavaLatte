package unit_10;
import javax.tools.Tool;
import java.awt.*;

class BostonSub extends Frame {
    private Button bt1 = new Button("1");
    private Button bt2 = new Button("2");
    private Button bt3 = new Button("3");
    private Button bt4 = new Button("4");
    private Button bt5 = new Button("5");
    private Button bt6 = new Button("6");
    private Button bt7 = new Button("7");
    private Button bt8 = new Button("8");
    private Button bt9 = new Button("9");
    private Button bt10 = new Button("*");
    private Button bt11 = new Button("0");
    private Button bt12 = new Button("#");

    private GridLayout gl = new GridLayout(4, 3, 5, 5);

    public BostonSub(String str) {
        super(str);
        this.init();
        this.setSize(300, 200);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        Dimension di1 = this.getSize();
        this.setLocation((int)(di.getWidth() / 2 - di1.getHeight() / 2), (int)(di.getHeight() / 2 - di1.getHeight() /2));
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(gl);
        this.add(bt1);
        this.add(bt2);
        this.add(bt3);
        this.add(bt4);
        this.add(bt5);
        this.add(bt6);
        this.add(bt7);
        this.add(bt8);
        this.add(bt9);
        this.add(bt10);
        this.add(bt11);
        this.add(bt12);
    }

}

public class Boston {

    public static void main(String[] args) {
        BostonSub bostonSub = new BostonSub("Telephone");
    }
}
