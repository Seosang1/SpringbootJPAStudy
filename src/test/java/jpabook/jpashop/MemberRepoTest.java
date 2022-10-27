package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import jpabook.jpashop.domin.Member;
import jpabook.jpashop.domin.MemberRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
public class MemberRepoTest {

	@Autowired MemberRepo memberRepo;
	
	@Test
	@Transactional
	public void testMember() throws Exception {
		// given
		Member member = new Member();
		member.setUsername("memberA");
		
		// when
		Long savedId = memberRepo.save(member);
		Member findMember = memberRepo.find(savedId);
		
		// then
		Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
		Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
		Assertions.assertThat(findMember).isEqualTo(member); 
		System.out.println("findMember == member: " + (findMember == member));
	}
}
