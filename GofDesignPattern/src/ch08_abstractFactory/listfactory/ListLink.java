package ch08_abstractFactory.listfactory;

import ch08_abstractFactory.factory.Link;

public class ListLink extends Link{

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append(" <li><a href= \"");
		sb.append(url);
		sb.append("\">");
		sb.append(caption);
		sb.append("</a></li>\n");
		return sb.toString();
	}

}
