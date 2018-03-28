package ch07_builder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
		if (check.isEmpty()) {
			usage();
			System.exit(0);
		}
		if (check.equals("plain")) {
			TextBuilder textbuilder = new TextBuilder();
			Director director = new Director(textbuilder);
			director.construct();
			String result = textbuilder.getResult();
			System.out.println(result);
		} else if (check.equals("html")) {
			HTMLBuilder htmlbuilder = new HTMLBuilder();
			Director director = new Director(htmlbuilder);
			director.construct();
			String filename = htmlbuilder.getResult();
			System.out.println("make file success :" + filename);
		} else {
			usage();
			System.exit(0);
		}

	}

	public static void usage() {
		System.out.println("usage: java Main plain make to general text document");
		System.out.println("usage: java Main html make to HTML file document");
	}

}
