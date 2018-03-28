package ch03_templateMethod;

public class StringDisplay extends AbstractDisplay {
	private String string;
	private int width;

	public StringDisplay(String string) {
		this.string = string;
		this.width = string.length();
	}
	
	@Override
	public void open() {

		printLine();
	}

	@Override
	public void print() {
		StringBuilder sb = new StringBuilder("|");
		sb.append(string);
		sb.append("|");
		System.out.println(sb);
	}

	@Override
	public void close() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
