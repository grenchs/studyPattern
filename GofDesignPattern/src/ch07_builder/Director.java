package ch07_builder;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("morning and afternoon");
		builder.makeItems(new String[] { "good morning", "hello" });
		builder.makeString("at the night");
		builder.makeItems(new String[] { "hello", "good night", "see you againg" });
		builder.close();
	}

}
