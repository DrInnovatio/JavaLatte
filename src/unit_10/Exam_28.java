package unit_10;

import java.awt.*;

class Exam_28_sub extends Frame{

    private MenuBar menuBar = new MenuBar();
    private  Menu file = new Menu("FILE");
    private  MenuItem newFile = new MenuItem("New File");
    private  MenuItem exit = new MenuItem("EXIT");
    private  Menu edit = new Menu("EDIT");
    private CheckboxMenuItem checkboxMenuItem = new CheckboxMenuItem("COLOUR");
    private Menu esize = new Menu("Size");
    private  MenuItem bigger = new MenuItem("Bigger");
    private CheckboxMenuItem es10 = new CheckboxMenuItem("10");
    private CheckboxMenuItem es20 = new CheckboxMenuItem("20");
    private CheckboxMenuItem es30 = new CheckboxMenuItem("30");
    private Menu help = new Menu("HELP");

    public Exam_28_sub(){
        super("Menubar");
        this.init();
        this.setSize(800, 200);
        this.setVisible(true);
        System.out.println(menuBar.getMenuCount());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }menuBar.remove(1);
    }

    public void init(){
        this.setMenuBar(menuBar);
        file.setName("JAMES");
        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
        file.setFont(font);
        menuBar.add(file);
        file.add(newFile);
        file.addSeparator();
        //exit.setEnabled(false);
        file.add(exit);
        menuBar.add(edit );
        edit.add(checkboxMenuItem);
        edit.add(esize);
        esize.add(bigger);
        esize.add(es10);
        esize.add(es20);
        esize.add(es30);
        menuBar.setHelpMenu(help);
    }
}

public class Exam_28 {

    public static void main(String[] args) {
        Exam_28_sub exe = new Exam_28_sub();
    }
}
