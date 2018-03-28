package factory.idcard;

import java.util.Random;

import factory.framework.Product;

public class IDCard extends Product {
	private String owner;
	private String cardNumber;

	IDCard(String owner) {
		System.out.println(owner + "의 카드를 만듭니다.");
		this.owner = owner;
		Random  ran = new Random();
		this.cardNumber = ran.nextInt()+"";
	}

	public String getOwner() {
		return this.owner;
	}
	public String getCardNumber() {
		return this.cardNumber;
	}

	@Override
	public void use() {
		System.out.println(owner + "의 카드를 사용합니다");
	}

}
