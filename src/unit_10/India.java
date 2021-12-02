package unit_10;
import java.awt.*;

class IndiaSub extends Frame {

    private FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 50, 50);

    Label label = new Label();
    Label label1 = new Label("Test");
    Label label2 = new Label("Forever", Label.CENTER);

    public IndiaSub(){
        super("Test-2");
        this.init();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(fl);
        label.setBackground(Color.YELLOW);
        label1.setBackground(Color.YELLOW);
        label2.setBackground(Color.YELLOW);
        this.add(label);
        this.add(label1);
        this.add(label2);
    }
}

public class India {

    public static void main(String[] args) {
        IndiaSub indiaSub = new IndiaSub();
    }
}
