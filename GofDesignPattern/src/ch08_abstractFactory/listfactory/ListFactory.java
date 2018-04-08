package ch08_abstractFactory.listfactory;

import ch08_abstractFactory.factory.Factory;
import ch08_abstractFactory.factory.Link;
import ch08_abstractFactory.factory.Page;
import ch08_abstractFactory.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String caption, String author) {
		return new ListPage(caption, author);
	}
}
