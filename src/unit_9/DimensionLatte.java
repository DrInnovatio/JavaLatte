package unit_9;

import java.awt.*;

class DimensionLatteSub extends Frame {
    public DimensionLatteSub(){
        super("London Fog");
        pack();
       // setSize(300, 200);
        setVisible(true);
    }
}

public class DimensionLatte {

    public static void main(String[] args) {
        DimensionLatteSub dls = new DimensionLatteSub();
        Dimension dimension = dls.getSize();
        System.out.println("Width : " + dimension.getWidth() );
        System.out.println("Height : " + dimension.getHeight() );
    }
}
