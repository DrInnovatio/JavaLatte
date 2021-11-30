package unit_9;
import java.awt.*;

class Paper extends Frame{
    public Paper(int x, int y, int a, int b,  String title){
        this.setSize(x, y);
        this.setVisible(true);
        this.setTitle(title);
        this.setLocation(a, b);

    }
}

public class JavaMocha_2 {

    public static void main(String[] args) {

        Paper mud = new Paper(200, 200, 400, 670, "FooBar");
        Paper lolly = new Paper(400, 300, 800, 100, "Google");
        Paper hotdog = new Paper(100, 700, 1100, 500, "Amazon");

    }
}
