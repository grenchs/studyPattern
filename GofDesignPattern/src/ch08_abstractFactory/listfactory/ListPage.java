package ch08_abstractFactory.listfactory;

import java.util.Iterator;

import ch08_abstractFactory.factory.Item;
import ch08_abstractFactory.factory.Page;

public class ListPage extends Page {

	public ListPage(String title, String author) {
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
		sb.append("<ul>\n");
		Iterator it = content.iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			sb.append(item.makeHTML());
		}
		sb.append("</ul>\n");
		sb.append("<hr><address>");
		sb.append(author);
		sb.append("</address>");
		sb.append("<body></html>\n");
		return sb.toString();
	}

}
