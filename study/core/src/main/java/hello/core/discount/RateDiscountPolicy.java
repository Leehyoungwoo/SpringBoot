package hello.core.discount;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("mainDiscountPolicy")
//@Primary
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {

    private int dicountPercent = 10;

    @Override
    public int discount(Member memeber, int price) {
        if (memeber.getGrade() == Grade.VIP) {
            return price * dicountPercent / 100;
        } else {
            return 0;
        }
    }
}
