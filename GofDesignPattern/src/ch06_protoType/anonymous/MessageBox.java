package ch06_protoType.anonymous;

import ch06_protoType.framework.Product;

public class MessageBox implements Product {

	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	public void setDecochar(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar +  " " + s + " " + decochar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}


	@Override
	public Product CreateClone() {
		Product p = null;
		
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
