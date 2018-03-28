package ch04_factory.idcard;

import java.util.ArrayList;
import java.util.List;

import ch04_factory.framework.Factory;
import ch04_factory.framework.Product;

public class IDCardFactory extends Factory {

	private List owners = new ArrayList<>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		this.owners.add(((IDCard)product).getOwner());
	}

	public List getOwners() {
		return this.owners;
	}

}
