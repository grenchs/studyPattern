package ch13_vistor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> dir = new ArrayList<Entry>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void accept(Vistor v) {
        v.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator it = dir.iterator();

        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    public Iterator iterator() {
        return dir.iterator();
    }

}
