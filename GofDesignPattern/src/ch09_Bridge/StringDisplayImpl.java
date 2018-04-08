package ch09_Bridge;

public class StringDisplayImpl extends DisplayImpl {
	private String string;

	private int width;

	public StringDisplayImpl(String string) {
		this.string = string;
		this.width = string.length();
	}

	@Override
	public void rawOpen() {
		StringLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|"+string+ "|");
	}

	@Override
	public void rawClose() {
		StringLine();
	}

	private void StringLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
