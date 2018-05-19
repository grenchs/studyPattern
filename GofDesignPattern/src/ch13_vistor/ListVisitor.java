package ch13_vistor;

import java.util.Iterator;

public class ListVisitor extends Vistor{
    
    private String currentdir = "";
    
    @Override
    public void visit(File file) {
        System.out.println(currentdir+ "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
    
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        
        Iterator it = directory.iterator();
        
        while(it.hasNext()) {
            Entry entry = (Entry) it.next();
            
            entry.accept(this);
        }
        currentdir = savedir;
    }

}
