package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import java.util.List;

/**
 * packageName : hello.hello_spring.repository
 * fileName : MemoryMemberRepositoryTest
 * author : hayj6
 * date : 2024-06-03(003)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-03(003)         hayj6          최초 생성
 */
public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

//    테스트는 순서에 상관없이 본인들이 알아서 잡기때문에 순서에 의존하면 안됨.
//    테스트 하나 끝날때마다 repository를 깔끔하게 지우도록 하는 작업
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();   // 멤버 저장 되는지 테스트
        member.setName("spring");   // 이름 세팅

        repository.save(member);    // member 저장

        Member result = repository.findById(member.getId()).get();  // 아이디저장. 옵셔널에서 꺼낼때는 get으로 꺼내기
//        System.out.println("result = " + (result ==member));
//        Assertions.assertEquals(member, result);   // 기대값, 결과값
        org.assertj.core.api.Assertions.assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        Assertions.assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        //given
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        //when
        List<Member> result = repository.findAll();
        //then
        Assertions.assertThat(result.size()).isEqualTo(2);
    }
}

