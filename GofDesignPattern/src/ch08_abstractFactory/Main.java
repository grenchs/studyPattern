package ch08_abstractFactory;

import java.util.Scanner;

import ch08_abstractFactory.factory.Factory;
import ch08_abstractFactory.factory.Link;
import ch08_abstractFactory.factory.Page;
import ch08_abstractFactory.factory.Tray;

public class Main {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String check = sc.nextLine();
			if (check.length() != 1) {
				System.out.println("Usage: java Main class.name.of.ConcreteFctory");
				System.out.println("Exmaple 1: java Main listfactory.ListFactory");
				System.out.println("Exmaple 2: java Main tablefactory.TableFactory");
				System.exit(0);
			}
			Factory facotry = Factory.getFactory(check);

			Link naver = facotry.createLink("naver", "http://www.naver.com/");
			Link daum = facotry.createLink("daum", "http://www.daum.net/");
			Link google = facotry.createLink("google", "http://www.google.com/");
			Link us_yahoo = facotry.createLink("us_yahoo", "http://www.yahoo.com/");

			Link ogn = facotry.createLink("ogn", "https://www.youtube.com/channel/UCKDkGnyeib7mcU7LdD3x0jQ");
			Link twitch = facotry.createLink("twitch", "https://www.twitch.tv/");

			Tray traySearch = facotry.createTray("searchSite");
			traySearch.add(naver);
			traySearch.add(daum);
			traySearch.add(google);
			traySearch.add(us_yahoo);

			Tray trayGame = facotry.createTray("gameSite");
			trayGame.add(ogn);
			trayGame.add(twitch);

			Page page = facotry.createPage("LinkPage", "won");
			page.add(traySearch);
			page.add(trayGame);
			page.output();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
