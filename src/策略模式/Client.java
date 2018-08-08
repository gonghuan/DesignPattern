package 策略模式;

import java.math.BigDecimal;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Price primaryPrice = new Price(new PrimaryMemberStrategy());
		Price intermediatePrice = new Price(new IntermediateMemberStrategy());
		Price advancedPrice = new Price(new AdvancedMemberStrategy());
		
		BigDecimal bigDecimal = new BigDecimal(100);
		System.out.println("初级会员的价格：" + primaryPrice.quote(bigDecimal).setScale(2, BigDecimal.ROUND_HALF_UP));
		System.out.println("中级会员的价格：" + intermediatePrice.quote(bigDecimal).setScale(2, BigDecimal.ROUND_HALF_UP));
		System.out.println("高级会员的价格：" + advancedPrice.quote(bigDecimal).setScale(2, BigDecimal.ROUND_HALF_UP));
	}

}
