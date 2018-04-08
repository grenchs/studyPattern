package ch08_abstractFactory.tableFactory;

import ch08_abstractFactory.factory.*;

public class TableFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		return new TableLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String caption, String author) {
		return new TablePage(caption, author);
	}

}
