package unit_8;

public class Bicycle {

    public String color;
    public String gear;
    public int price;

    public Bicycle() {
        System.out.println("Bicycle Constructor-1.");
    }

    public Bicycle(String c, int p){
        System.out.println("Bicycle Constructor-2.");
        this.color = c;
        this.price = p;
    }

    public void info(){
        System.out.println("--Info--");
        System.out.println("Color : " + color);
        System.out.println("gear : " + gear);
        System.out.println("Price : " + price);
    }
}//Bycycle class
