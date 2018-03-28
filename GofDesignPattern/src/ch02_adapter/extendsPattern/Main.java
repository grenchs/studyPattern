package ch02_adapter.extendsPattern;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("hello");
		p.printWeak();
		p.printStong();
	}
}
