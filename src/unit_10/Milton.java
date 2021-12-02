package unit_10;

import java.awt.*;

class MiltonSub extends Frame{

    private GridLayout gl = new GridLayout(4,3,5,5);
    private Button[] bt = new Button[12];
    private String[] name = {"*", "0", "#"};

    public MiltonSub(){
        super("TelePhone");
        this.init();
        this.setSize(200, 500);
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(gl);
        for(int i=0; i<12; i++){
            if(i < 9){
                bt[i] = new Button(String.valueOf(i+1));
            }
             else{
                bt[i] = new Button(name[i - 9]);
            }
             this.add(bt[i]);
        }
    }
}


public class Milton {
    public static void main(String[] args) {
        MiltonSub miltonSub = new MiltonSub();

    }
}
