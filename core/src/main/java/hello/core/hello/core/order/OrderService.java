package hello.core.hello.core.order;

/**
 * packageName : hello.core.hello.core.order
 * fileName : OrderService
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
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
