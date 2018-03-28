package ch08_abstractFactory.factory;

import java.util.ArrayList;

public abstract class Tray extends Item {
	protected ArrayList tray = new ArrayList<>();

	public Tray(String caption) {
		super(caption);
	}

	public void add(Item item) {
		this.tray.add(item);
	}
}
