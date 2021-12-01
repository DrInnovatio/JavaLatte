package unit_9;

import java.awt.*;

class EspressoSub extends Frame{

    private Button button = new Button("Test");
    private Button button2 = new Button("Butt1");


    public EspressoSub() throws InterruptedException {
        this.add("North", button2);
        this.add("South", button);
        this.setSize(300, 300);
        //this.pack();
        this.setVisible(true);

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){}
        this.remove(button2);

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        this.dispose();


    }
}

public class EspressoJava {

    public static void main(String[] args) throws InterruptedException {
        EspressoSub nana = new EspressoSub();
        System.out.println("Count : " + nana.getComponentCount());
        Component[] sana = nana.getComponents();

        for(int i=0; i<sana.length; i++){
            System.out.println(sana[i]);
        }
    }
}
