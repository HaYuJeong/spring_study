package hello.core.hello.core.discount;

import hello.core.hello.core.member.Grade;
import hello.core.hello.core.member.Member;

/**
 * packageName : hello.core.hello.core.discount
 * fileName : FixDiscountPolicy
 * author : hayj6
 * date : 2024-06-17(017)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-17(017)         hayj6          최초 생성
 */
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;   // 1000원 할인
    @Override
    public int discount(Member member, int price) {
        if ( member.getGrade() == Grade.VIP){
            return discountFixAmount;
        } else {
            return 0;

        }
    }
}
