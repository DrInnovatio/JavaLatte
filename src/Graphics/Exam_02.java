package Graphics;

import java.awt.*;

class Exam_02_sub extends Frame{
    private Image image;
    public Exam_02_sub(){

        super("Google");
        this.init();
        this.setSize(500, 500);
        this.setVisible(true);
    }
    public void init(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        image = toolkit.getImage("winter.png");
    }

    public void paint(Graphics g){
        g.clearRect(5,5,490,490);
        g.drawArc(50, 50, 100, 100, 30, 300);
        g.drawImage(image, 70, 70, this);
        g.drawImage(image, 150, 150, 50, 50, this);
    }

}

public class Exam_02 {

    public static void main(String[] args) {
        Exam_02_sub exe = new Exam_02_sub();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ignored){
        }exe.repaint();
    }
}
