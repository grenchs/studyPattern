package ch02_adapter.extendsPattern;

public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWriteParen();
	}

	@Override
	public void printStong() {
		showWithAster();
	}

}
