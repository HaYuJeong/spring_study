package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * packageName : hello.hello_spring.repository
 * fileName : SpringDataJpaMemberRepository
 * author : hayj6
 * date : 2024-06-11(011)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-11(011)         hayj6          최초 생성
 */
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
//    interface가 interface 상속받을떄는 extends
    @Override
    Optional<Member> findByName(String name);
}
