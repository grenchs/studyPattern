package ch08_abstractFactory.tableFactory;

import java.util.Iterator;

import ch08_abstractFactory.factory.Item;
import ch08_abstractFactory.factory.Tray;

public class TableTray extends Tray{

	public TableTray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<td>");
		sb.append("<table width=\"100%\" border=\"1\"><tr>");
		sb.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"");
		sb.append(tray.size());
		sb.append("\"><b>");
		sb.append(caption);
		sb.append("</b></td></tr>\n");
		sb.append("<tr>\n");
		Iterator it = tray.iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			sb.append(item.makeHTML());
		}
		sb.append("</tr></table>");
		sb.append("</td>");
		return sb.toString();
	}


}
