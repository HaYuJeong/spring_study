package hello.core.hello.core.order;

import hello.core.hello.core.discount.DiscountPolicy;
import hello.core.hello.core.discount.FixDiscountPolicy;
import hello.core.hello.core.member.Member;
import hello.core.hello.core.member.MemberRepository;
import hello.core.hello.core.member.MemberService;
import hello.core.hello.core.member.MemoryMemberRepository;

/**
 * packageName : hello.core.hello.core.order
 * fileName : OrderServiceImpl
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
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
