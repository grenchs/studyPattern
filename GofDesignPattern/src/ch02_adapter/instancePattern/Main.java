package ch02_adapter.instancePattern;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("hello");
		p.printWeak();
		p.printStong();
	}
}
