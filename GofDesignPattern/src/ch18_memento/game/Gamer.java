package ch18_memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsname = { "リンゴ", "ふとう", "バナナ", "みっかん" };

    public Gamer(int meony) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;

        if (dice == 1) {
            money += 100;
            System.out.println("increace of money");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("half money");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("I'got a " + f);
            fruits.add(f);
        } else {
            System.out.println("Nothing happened");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();

        while (it.hasNext()) {
            String f = (String) it.next();
            if (f.startsWith("good tasty")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.fruits;
    }

    public String toString() {
        return "[Money = " + money + ", frutits = " + fruits + "]";
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "good tasty";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

}
