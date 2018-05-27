package ch15_facade.pagemaker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    
    private Database() {
    }
    
    public static Properties getProperties(String dbname,String path) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        
        try {
            prop.load(new FileInputStream(new File(path+filename)));
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Warning: ");
            sb.append(filename);
            sb.append(" is not found.");
            System.out.println(sb.toString());
        }
        
        return prop;
    }

}
