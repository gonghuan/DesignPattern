package ����ģʽ;

import java.math.BigDecimal;

public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public BigDecimal calPrice(BigDecimal bigDecimal) {
		// TODO Auto-generated method stub
		return bigDecimal.multiply(new BigDecimal(0.8));
	}

}
