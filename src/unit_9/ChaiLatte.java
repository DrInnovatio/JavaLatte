package unit_9;

import java.awt.*;

class ChaiLatteSub extends Frame{

    private Color cc;

    public ChaiLatteSub(){
        super("Test");
        cc = new Color(147, 77, 134);
        this.setBackground(cc);
        this.setCursor(Cursor.HAND_CURSOR);
        this.setBackground(new Color(200, 212, 250));
        this.setSize(300, 200);
        this.setVisible(true);
    }
}

public class ChaiLatte {

    public static void main(String[] args) {
        ChaiLatteSub chai = new ChaiLatteSub();
    }
}
