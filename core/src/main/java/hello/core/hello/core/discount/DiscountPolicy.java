package hello.core.hello.core.discount;

import hello.core.hello.core.member.Member;

/**
 * packageName : hello.core.hello.core.discount
 * fileName : DiscountPolicy
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
public interface DiscountPolicy {
    int discount(Member member, int price);
}
