package unit_11;

import javafx.scene.layout.Pane;

import java.awt.*;

class Exam_34_sub extends Frame{

    private MenuBar mb = new MenuBar();
    private Menu edit = new Menu("Edit");

    private MenuItem ecopy = new MenuItem("Copy");
    private MenuItem epaste = new MenuItem("Paste");

    private Menu view = new Menu("View");
    private CheckboxMenuItem vmorn = new CheckboxMenuItem("General");
    private CheckboxMenuItem velec = new CheckboxMenuItem("Professional");

    private MenuItem vdist = new MenuItem("Digits");
    private Menu help = new Menu("Help");

    private MenuItem hindex = new MenuItem("Support");
    private MenuItem hinfo = new MenuItem("Information");

    private BorderLayout bl = new BorderLayout(10, 10);
    private Label viewlb = new Label("0.", Label.RIGHT);

    private Button bsbt = new Button("Back Space");
    private Button cebt = new Button("CE");
    private Button cbt = new Button("C");

    private Button mcbt = new Button("MC");
    private Button mrbt = new Button("MR");
    private Button msbt = new Button("MS");
    private Button mpbt = new Button("M+");

    private Button su0bt = new Button("0");
    private Button su1bt = new Button("1");
    private Button su2bt = new Button("2");
    private Button su3bt = new Button("3");
    private Button su4bt = new Button("4");
    private Button su5bt = new Button("5");
    private Button su6bt = new Button("6");
    private Button su7bt = new Button("7");
    private Button su8bt = new Button("8");
    private Button su9bt = new Button("9");
    private Button jumbt = new Button(".");
    private Button signbt = new Button("+/-");

    private Button divbt = new Button("/");
    private Button mulbt = new Button("*");
    private Button minbt = new Button("-");
    private Button plubt = new Button("+");
    private Button equbt = new Button("=");
    private Button sqrtbt = new Button("sqrt");
    private Button perbt = new Button("%");
    private Button nabt = new Button("l/x");

    public Exam_34_sub(String str){
        super(str);
        this.init();
        this.pack();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        Dimension di1 = this.getSize();
        //this.setSize(400, 400);
        this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), (int)(di.getHeight() / 2 - di1.getHeight() / 2));
        this.setVisible(true);
    }

    public void init(){
        this.setMenuBar(mb);
        mb.add(edit);
        edit.add(ecopy);
        edit.add(epaste);
        mb.add(view);
        view.add(vmorn);
        view.add(velec);
        view.addSeparator();
        view.add(vdist);
        mb.setHelpMenu(help);
        help.add(hindex);
        help.add(hinfo);
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(bl);
        viewlb.setBackground(Color.WHITE);

        this.add("North", viewlb);
        Panel p = new Panel (new BorderLayout(5,5));
        Panel p1 = new Panel(new GridLayout(1,3,4,4));
        p1.add(bsbt);
        p1.add(cebt);
        p1.add(cbt);
        p.add("North", p1 );
        Panel p2 = new Panel(new GridLayout(4,1,4,4));
        p2.add(mcbt);
        p2.add(mrbt);
        p2.add(msbt);
        p2.add(mpbt);
        p.add("West", p2);
        Panel p3 = new Panel(new BorderLayout(3,3));
        Panel p4 = new Panel(new GridLayout(4,3,3,3));
        p4.add(su7bt);
        p4.add(su8bt);
        p4.add(su9bt);
        p4.add(su4bt);
        p4.add(su5bt);
        p4.add(su6bt);
        p4.add(su1bt);
        p4.add(su2bt);
        p4.add(su3bt);
        p4.add(su0bt);
        p4.add(signbt);
        p4.add(jumbt);
        p3.add("Center", p4);
        Panel p5 = new Panel(new GridLayout(4,2,3,3));
        p5.add(divbt);
        p5.add(sqrtbt);
        p5.add(mulbt);
        p5.add(perbt);
        p5.add(minbt);
        p5.add(nabt);
        p5.add(plubt);
        p5.add(equbt);
        p3.add("East", p5);
        p.add("Center", p3);
        this.add("Center", p);

    }
}

public class Exam_34 {

    public static void main(String[] args) {
        Exam_34_sub exe = new Exam_34_sub("Calculator");
    }
}
