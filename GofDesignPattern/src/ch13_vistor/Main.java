package ch13_vistor;

public class Main {

    public static void main(String[] args) {

        System.out.println("Making root entries...");

        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");

        rootdir.add(bindir);
        rootdir.add(tmpdir);
        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));
        tmpdir.add(usrdir);
        rootdir.accept(new ListVisitor());

        System.out.println();
        System.out.println("Making user entries...");
        Directory kim = new Directory("Kim");
        Directory lee = new Directory("Lee");
        Directory park = new Directory("Park");
        usrdir.add(kim);
        usrdir.add(lee);
        usrdir.add(park);

        kim.add(new File("diary.html", 100));
        kim.add(new File("Composit.java", 200));
        lee.add(new File("memo.tex", 300));
        park.add(new File("game.doc", 400));
        park.add(new File("junk", 500));

        rootdir.accept(new ListVisitor());
        
        FilefinderVisitor ffv = new FilefinderVisitor(".html");
        rootdir.accept(ffv);

    }

}
