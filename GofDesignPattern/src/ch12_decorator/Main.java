package ch12_decorator;

public class Main {

    public static void main(String[] args) {
        
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new Sideborder(b1,'#');
        Display b3 = new FullBorder(b2);
        
        b1.show();
        b2.show();
        b3.show();
        
        Display b4 = new Sideborder(
                new FullBorder(
                        new FullBorder(
                                new Sideborder(
                                        new FullBorder(
                                                new StringDisplay(
                                                        "good to see you!")), '*'))), '/');
        
        b4.show();
    }

}
