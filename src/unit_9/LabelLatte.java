package unit_9;

import java.awt.*;

class LabelLatteSub extends Frame{

    private Label lb = new Label("What ", Label.RIGHT);
    private Label lb1 = new Label("345 ", Label.CENTER);
    private Font font = new Font(Font.MONOSPACED, Font.BOLD, 15);

    public LabelLatteSub(){
        super("Answer");
        this.setLayout(null);
        this.init();

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void init(){
        // Building the form.
        this.setLayout(null);
        this.setBackground(Color.black);

        lb.setBounds(100, 100, 100, 100);
        lb.setFont(font);
        lb.setForeground(Color.WHITE);
        lb.setBackground(Color.PINK);

        lb1.setBounds(100, 30, 70, 70);
        lb1.setFont(font);
        lb1.setForeground(Color.WHITE);
        lb1.setBackground(Color.GREEN);

        this.add(lb);
        this.add(lb1);

        lb.setText("Google");
    }
}

public class LabelLatte {

    public static void main(String[] args) {
        LabelLatteSub lls = new LabelLatteSub();

    }
}
