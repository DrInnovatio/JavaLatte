package unit_10;
import javafx.scene.layout.Pane;

import javax.swing.border.Border;
import java.awt.*;

class GoldCoastSub extends Frame{
    private GridLayout A = new GridLayout(2,2, 5, 5);
    private Label ll1 = new Label("1");
    private Label ll11 = new Label("1-1");
    private Label ll12 = new Label("1-2");

    private Label ll2 = new Label("2");
    private Label ll3 = new Label("8");
    private Label ll4 = new Label("4");


    public GoldCoastSub(){
        super("ThisTest");
        this.init();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(A);
        ll1.setBackground(Color.RED);
        ll11.setBackground(Color.GREEN);
        ll12.setBackground(Color.CYAN);
        ll2.setBackground(Color.RED);
        ll3.setBackground(Color.RED);
        ll4.setBackground(Color.RED);

        Panel p1 = new Panel(new GridLayout(1,2));
        this.add(ll1);
        Panel p2 = new Panel(new GridLayout(2,1));
        this.add(ll11);
        this.add(ll12);
        this.add(p1);
        this.add(ll2);
        this.add(ll3);
        Panel panel = new Panel();
        BorderLayout bl = new BorderLayout();
        panel.setLayout(bl);
        panel.add("North", ll4);
        this.add(panel);

    }
}

public class GoldCoast {

    public static void main(String[] args) {
        GoldCoastSub goldCoastSub = new GoldCoastSub();

    }
}
