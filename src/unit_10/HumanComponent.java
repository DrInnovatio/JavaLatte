package unit_10;
import java.awt.*;

class HumanComponentSub extends Frame{

    private FlowLayout fl = new FlowLayout();
    private CheckboxGroup cg = new CheckboxGroup();
    private Checkbox cb = new Checkbox("CheckBox");
    private Checkbox cb1 = new Checkbox("CheckBox", false, cg);
    private Checkbox cb2 = new Checkbox("CheckBox", true, cg);

    public HumanComponentSub(){
        super("CheckBox");
        this.init();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(fl);
        this.add(cb);
        this.add(cb1);
        this.add(cb2);
    }
}

public class HumanComponent {

    public static void main(String[] args) {
        HumanComponentSub humanComponentSub = new HumanComponentSub();
    }

}
