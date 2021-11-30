package Restaurant;

public class ChildRestaurnat extends FatherRestaurant {

    int since = 2000;

    public void getOpeningYear(){
        System.out.println("Father's opening year is in " + super.since);
        System.out.println("Son's opening year is in " + this.since);
    }

    public static void main(String[] args) {
        ChildRestaurnat child = new ChildRestaurnat();
        child.getOpeningYear();
    }
}
