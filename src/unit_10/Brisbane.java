package unit_10;

import java.awt.*;

class BrisbaneSub extends Frame {

    private Label label = new Label("Test");

    public BrisbaneSub(){
        super("TestTest");
        this.init();
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(null);
        label.setBounds(50, 50, 100, 50);
        label.setBackground(Color.red );
        this.add(label);
    }

}

public class Brisbane {
    public static void main(String[] args) {
        BrisbaneSub brisbaneSub = new BrisbaneSub();
    }
}
