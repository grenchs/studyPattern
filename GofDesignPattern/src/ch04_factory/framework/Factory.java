package ch04_factory.framework;

public abstract class Factory {

	public final Product create(String ownser) {
		Product p = createProduct(ownser);
		registerProduct(p);
		return p;

	}

	protected abstract Product createProduct(String owner);

	protected abstract void registerProduct(Product product);
}
