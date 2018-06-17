package ch18_memento.game;

public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("현상:" + gamer);

            gamer.bet();

            System.out.println("소지금은 :" + gamer.getMoney());

            if (gamer.getMoney() > memento.getMoney()) {

                System.out.println("save memento");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("restore before");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }

    }

}
