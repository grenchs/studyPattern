package ch05_protoType.framework;

public interface Product extends Cloneable {
	public abstract void use(String s);

	public abstract Product CreateClone();
}
