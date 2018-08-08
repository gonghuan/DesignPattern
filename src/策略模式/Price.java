package ����ģʽ;

import java.math.BigDecimal;

public class Price {
	MemberStrategy memberStrategy;
	
	public Price(MemberStrategy memberStrategy){
		this.memberStrategy = memberStrategy;
	}
	
	public BigDecimal quote(BigDecimal bigDecimal){
		return memberStrategy.calPrice(bigDecimal);
	}
}
