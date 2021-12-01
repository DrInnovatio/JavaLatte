package unit_9;
import java.awt.*;

class LongBlackSub extends Frame{

    public LongBlackSub(){
        super();
        setUndecorated(true);
        setSize(300, 200);
        setVisible(true);
    }

    public LongBlackSub(String str){
        super(str);
        setUndecorated(false);
        setSize(300, 200);
        setResizable(true);
        setVisible(true);
    }
// Two Constructors
}

public class LongBlack {

    public static void main(String[] args) {

        LongBlackSub lbs = new LongBlackSub();
        LongBlackSub lbs1 = new LongBlackSub("Test Baby");
        lbs.setTitle("What is the test?");
        Rectangle rectangle = lbs.getBounds();
        System.out.println("x = " + rectangle.x);
        System.out.println("y = " + rectangle.y);
        System.out.println("width = " + rectangle.width);
        System.out.println("height = " + rectangle.height);

    } //main
}// class


/**
 Frame frame = new Frame();
 Frame frame1 = new Frame("Test");

 frame.setVisible(true);
 frame1.setVisible(true);
 **/