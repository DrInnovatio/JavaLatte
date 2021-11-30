package Soccer;

public class MainClass {

    public static void main(String[] args) {
        Player messi = new Player("Messi", "Paris Sangermang", "Argentina");
        Player messi2 = new Player(12, 8900);

        messi.playerInfo();
        System.out.println("============");
        messi2.playerInfo();

        System.out.println("============");
        Player Ronaldo = new Player("Ronaldo", "Manchester United", "Portugal", 7, 89990);
        Ronaldo.playerInfo();
    }
}
