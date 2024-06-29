package hello.core.order;

import hello.core.hello.core.member.Grade;
import hello.core.hello.core.member.Member;
import hello.core.hello.core.member.MemberService;
import hello.core.hello.core.member.MemberServiceImpl;
import hello.core.hello.core.order.Order;
import hello.core.hello.core.order.OrderService;
import hello.core.hello.core.order.OrderServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : hello.core.order
 * fileName : OrderServiceTest
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
public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        org.assertj.core.api.Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}

