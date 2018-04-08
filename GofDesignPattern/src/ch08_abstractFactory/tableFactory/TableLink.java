package ch08_abstractFactory.tableFactory;

import ch08_abstractFactory.factory.*;

public class TableLink extends Link {

	public TableLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append(" <td><a href= \"");
		sb.append(url);
		sb.append("\">");
		sb.append(caption);
		sb.append("</a></td>\n");
		return sb.toString();
	}
}
