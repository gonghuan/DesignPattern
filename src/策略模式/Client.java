package ����ģʽ;

import java.math.BigDecimal;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Price primaryPrice = new Price(new PrimaryMemberStrategy());
		Price intermediatePrice = new Price(new IntermediateMemberStrategy());
		Price advancedPrice = new Price(new AdvancedMemberStrategy());
		
		BigDecimal bigDecimal = new BigDecimal(100);
		System.out.println("������Ա�ļ۸�" + primaryPrice.quote(bigDecimal).setScale(2, BigDecimal.ROUND_HALF_UP));
		System.out.println("�м���Ա�ļ۸�" + intermediatePrice.quote(bigDecimal).setScale(2, BigDecimal.ROUND_HALF_UP));
		System.out.println("�߼���Ա�ļ۸�" + advancedPrice.quote(bigDecimal).setScale(2, BigDecimal.ROUND_HALF_UP));
	}

}
