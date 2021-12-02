package unit_10;

import java.awt.*;

class PerthSub extends Frame {

    private GridLayout grid = new GridLayout(2,2, 5, 5);
    private Label label1 = new Label("1", Label.CENTER);
    private Label label2 = new Label("2", Label.CENTER);
    private Label label3 = new Label("3", Label.CENTER);
    private Label label4 = new Label("4", Label.CENTER);

    public PerthSub() {
        super("Googol");
        this.init();
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(grid);
        this.setBackground(Color.CYAN);
        label1.setBackground(Color.gray);
        label2.setBackground(Color.yellow);
        label3.setBackground(Color.green);
        label4.setBackground(Color.red);

        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
    }
}

public class Perth  {

    public static void main(String[] args) {
        PerthSub perthSub = new PerthSub();
    }
}
