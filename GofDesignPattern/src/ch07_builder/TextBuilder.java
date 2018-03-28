package ch07_builder;

public class TextBuilder extends Builder {

	private StringBuilder builder = new StringBuilder();

	@Override
	public void makeTitle(String title) {
		builder.append("===================================\n");
		builder.append("『");
		builder.append(title);
		builder.append("』");
		builder.append("\n\n");
	}

	@Override
	public void makeString(String str) {
		builder.append('■');
		builder.append(str);
		builder.append("\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			builder.append(" ・");
			builder.append(items[i]);
			builder.append("\n");
		}
		builder.append("\n");
	}

	@Override
	public void close() {
		builder.append("===================================\n");
	}

	public String getResult() {
		return builder.toString();
	}
}
