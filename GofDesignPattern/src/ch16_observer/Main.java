package ch16_observer;

public class Main {

    public static void main(String[] args) {
//        NumberGenerator generator = new RandomNumberGenerator();
        NumberGenerator generator = new IncrementalNumberGenerator(10,50,5);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        
        generator.addObsver(observer1);
        generator.addObsver(observer2);
        
        generator.execute();

    }

}
