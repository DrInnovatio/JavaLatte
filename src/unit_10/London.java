package unit_10;

import java.awt.*;

class LondonSub extends Frame{

    private BorderLayout bl = new BorderLayout();
    private CardLayout cl = new CardLayout();

    private Panel p = new Panel(cl);
    private Panel p1 = new Panel(cl);
    private Panel p2 = new Panel(cl);
    private Panel p3 = new Panel(cl);


    public LondonSub(){
        super("Lisa");
        this.init();
        this.setSize(300, 200);
        this.setVisible(true);

        try {
            Thread.sleep(2000);
        }catch(InterruptedException e){}
        //cl.next(p);
        cl.show(p, "Third");


        try {
            Thread.sleep(2000);
        }catch(InterruptedException e){}
        //cl.next(p);
        cl.show(p, "First");
    }

    public void init(){
        this.setLayout(bl);
        p1.setBackground(Color.RED);
        p2.setBackground(Color.GREEN);
        p3.setBackground(Color.BLUE);
        p.add("First", p1);
        p.add("Second", p2);
        p.add("Third", p3);
        this.add("Center", p);
    }
}

public class London {

    public static void main(String[] args) {
        LondonSub londonSub = new LondonSub();
    }
}
