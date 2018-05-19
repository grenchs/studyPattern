package ch13_vistor;

import java.util.Iterator;

public class FilefinderVisitor extends Vistor {

    private String fileType = "";

    public FilefinderVisitor(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(fileType)) {
            System.out.println(file);
        }
    }

    @Override
    public void visit(Directory directory) {

        Iterator it = directory.iterator();

        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }

}
