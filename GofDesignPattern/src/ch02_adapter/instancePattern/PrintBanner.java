package ch02_adapter.instancePattern;

public class PrintBanner extends Print {
	private Banner banner;
	
	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeak() {
		this.banner.showWriteParen();
	}

	@Override
	public void printStong() {
		this.banner.showWithAster();
	}

}
