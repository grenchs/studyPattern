package ch15_facade.pagemaker;

import java.io.FileWriter;
import java.util.Enumeration;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    private static final String filePath = "C:\\Users\\grenc\\Desktop\\";

    public static void makeWelcomPage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata", filePath);
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filePath + filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "의 호메이지에 오신 걸 환영합니다.");
            writer.paragraph("메일을 기다리고 있습니다.");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkePage(String fileName) {
        try {
            HtmlWriter writer = null;

            Properties mailprop = Database.getProperties("maildata", filePath);
            if (mailprop.isEmpty()) {
                System.out.println("file read fail");
                return;
            }
            System.out.println("start make file " + fileName);
            writer = new HtmlWriter(new FileWriter(filePath + fileName));
            writer.title("Link page");
            Enumeration nameEnumlist = mailprop.propertyNames();
            while (nameEnumlist.hasMoreElements()) {
                String mailadr = (String) nameEnumlist.nextElement();
                String userName = mailprop.getProperty(mailadr);
                writer.link(mailadr, userName);
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
