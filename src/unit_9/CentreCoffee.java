package unit_9;

import javax.tools.Tool;
import java.awt.*;

class CentreCoffeeSub extends Frame{
    public CentreCoffeeSub(){
        super("Test");

        this.init();
        this.setSize(300, 200);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        Dimension di1 = this.getSize();
        this.setLocation((int)(di.getWidth() / 2), (int)(di.getHeight() / 2));
        this.setVisible(true);
    }

    public void init(){
        // form

    }
}

public class CentreCoffee {

    public static void main(String[] args) {
        CentreCoffeeSub ccs = new CentreCoffeeSub();
    }
}


// 9. dimension toolkit again.