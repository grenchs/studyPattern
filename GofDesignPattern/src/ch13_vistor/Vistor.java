package ch13_vistor;

public abstract class Vistor {
    public abstract void visit(File file);
    public abstract void visit(Directory);
}
