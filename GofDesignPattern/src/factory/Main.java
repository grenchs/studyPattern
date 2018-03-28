package factory;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IDCard;
import factory.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("testOwner1");
		Product card2 = factory.create("testOwner2");
		Product card3 = factory.create("testOwner3");

		card1.use();
		card2.use();
		card3.use(); 
	}

}
