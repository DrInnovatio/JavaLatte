package unit_9;

import java.awt.*;

public class ExamCafe {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension di = toolkit.getScreenSize();

        System.out.println("Width of the screen : " + di.getWidth());
        System.out.println("Height of the screen : " + di.getHeight());
    }
}
