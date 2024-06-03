package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

/**
 * packageName : hello.hello_spring
 * fileName : MemberRepository
 * author : hayj6
 * date : 2024-06-03(003)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-03(003)         hayj6          최초 생성
 '*/
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
