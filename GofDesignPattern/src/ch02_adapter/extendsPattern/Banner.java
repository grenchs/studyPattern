package ch02_adapter.extendsPattern;

public class Banner {

	private String string;

	public Banner(String string) {
		this.string = string;
	}

	public void showWriteParen() {
		System.out.println("(" + string + ")");
	}

	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
