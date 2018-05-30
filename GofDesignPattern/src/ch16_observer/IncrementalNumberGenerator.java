package ch16_observer;

public class IncrementalNumberGenerator extends NumberGenerator{
    private int startNum;
    private int endNum;
    private int incrementNum;
    
    public IncrementalNumberGenerator(int startNum,int endNum,int incrementNum) {
        this.startNum = startNum;
        this.endNum = endNum;
        this.incrementNum = incrementNum; NumberGenerator generator = new RandomNumberGenerator();
    }
    
    @Override
    public int getNumber() {
        return startNum;
    }

    @Override
    public void execute() {
        for (int i = startNum; i < endNum; i += incrementNum) {
            startNum += incrementNum;
            notifyObserver();
        }
    }

}
