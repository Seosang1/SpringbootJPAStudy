package jpabook.jpashop.domin;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {
	
	@Id @GeneratedValue
	@Column(name= "u_id")
	private Long id;
	
	private String name;
	
	@Embedded
	private Address addr;

	@OneToMany(mappedBy = "member")
	private List<Order> orders = new ArrayList<>();
			
}
