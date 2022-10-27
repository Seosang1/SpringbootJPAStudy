package jpabook.jpashop.domin;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepo {
	
	@PersistenceContext
	private EntityManager em;
	
	public Long save(Member member) {
		em.persist(member);
		return member.getId();
	}
	
	// 멤버 찾기
	public Member find(Long id) {
		return em.find(Member.class, id);
	}

}
