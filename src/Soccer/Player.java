package Soccer;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Player {

    public String name;
    public String team;
    public String country;
    public int backNumber;
    public int income;

    public Player(String name, String team, String country, int backNumber, int income) {
        this.name = name;
        this.team = team;
        this.country = country;
        this.backNumber = backNumber;
        this.income = income;
    }

    public Player(String name, String team, String country) {
        System.out.println("Constructor-1");
        this.name = name;
        this.team = team;
        this.country = country;

    }

    public Player(int backNumber, int income) {
        System.out.println("Constructor-2");
        this.backNumber = backNumber;
        this.income = income;
        punching();


    }

    public void playerInfo(){
        System.out.println("Player's name : " + name);
        System.out.println("Player's team : " + team);
        System.out.println("Player's country : " + country);
        System.out.println("Player's Back Number : " + backNumber);
        System.out.println("Player's income : " + income);

        punching();

    }

    private void punching(){
        System.out.println("Private Punching");
    }
}
