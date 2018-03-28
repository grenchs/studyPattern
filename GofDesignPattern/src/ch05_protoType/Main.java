package ch05_protoType;

import java.util.HashMap;

import ch05_protoType.anonymous.MessageBox;
import ch05_protoType.anonymous.UnderlinePen;
import ch05_protoType.framework.Manager;
import ch05_protoType.framework.Product;

public class Main {
	private static final String STRING_MESSAGE = "string message";
	private static final String WARNING_BOX = "warning box";
	private static final String SLASH_BOX = "slash box";
	private static final String OUTPUT_MESSAGE = "Hello, world.";

	public static void main(String[] args) {

		// what difference between ProtoType Pattern and new Something?
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');

		manager.register(STRING_MESSAGE, upen);
		manager.register(WARNING_BOX, mbox);
		manager.register(SLASH_BOX, sbox);
		/*
		manager.create 사용 이전의 인스턴스와 이후의 인스턴스는 서로 다른 객체
		보통 복사를 하게되면 얕은 얕은복사(메모리 주소 복사)가되어 값 변경시 복사원본에 영향이감 , 하지만 protoType사용시 전후에 영향이 가지 않음
		ex) API_A 에서 API_B의 인수가 같다. 하지만 A ⇒ B를 통해서 갈 때 값변형을 피하기 위해 protoType을 사용 API_B를 부르기 직전 복사, 복사한 값을 B에 전해 사용 하면 A에서의 객체에 영향이 없다 
		**/
//		Product p1 = manager.create(STRING_MESSAGE);
		HashMap<String, Product> test = new HashMap<>();
		test.put("qwer", upen);
		Product testqwer = test.get("qwer");
		upen.setUlchar('_');
		testqwer.use(OUTPUT_MESSAGE);
		
		Product p2 = manager.create(WARNING_BOX);
		p2.use(OUTPUT_MESSAGE);
		Product p3 = manager.create(SLASH_BOX);
		p3.use(OUTPUT_MESSAGE);

	}

}
