package ch08_abstractFactory.listfactory;

import ch08_abstractFactory.factory.Factory;
import ch08_abstractFactory.factory.Link;
import ch08_abstractFactory.factory.Page;
import ch08_abstractFactory.factory.Tray;

public class ListFacotry extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		return null;
	}

	@Override
	public Tray createTray(String caption) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page createPage(String caption, String author) {
		// TODO Auto-generated method stub
		return null;
	}

}
