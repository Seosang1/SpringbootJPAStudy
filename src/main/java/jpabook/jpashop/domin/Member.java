package jpabook.jpashop.domin;

import java.util.*;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {
	
	@Id @GeneratedValue
	private Long id;
	
	@Column(nullable = true)
	private String name;

	@Column(nullable = true)
	private Integer age;
	
	@Embedded
	@Column(nullable = true)
	private Address addr;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = true)
	private RoleType roleType;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updDate;
	
	@Lob
	private String desc;

	@OneToMany(mappedBy = "member")
	private List<Order> orders = new ArrayList<>();
			
}
