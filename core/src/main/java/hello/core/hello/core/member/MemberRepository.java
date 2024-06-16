package hello.core.hello.core.member;

/**
 * packageName : hello.core.hello.core.member
 * fileName : MemberRepository
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
public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
