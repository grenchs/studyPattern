package ch08_abstractFactory.tableFactory;

import java.util.Iterator;

import ch08_abstractFactory.factory.Item;
import ch08_abstractFactory.factory.Page;

public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head><title>");
		sb.append(title);
		sb.append("</title></head>\n");
		sb.append("<body>\n");
		sb.append("<h1>");
		sb.append(title);
		sb.append("</h1>\n");
		sb.append("<table width=\"80%\" border = \"3\">\n");
		Iterator it = content.iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			sb.append("<tr>");
			sb.append(item.makeHTML());
			sb.append("</tr>");
		}
		sb.append("</table>\n");
		sb.append("<hr><address>");
		sb.append(author);
		sb.append("</address>");
		sb.append("<body></html>\n");
		return sb.toString();
	}

}
