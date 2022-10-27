package jpabook.jpashop.domin.item;

import java.util.*;

import javax.persistence.*;

import jpabook.jpashop.domin.Category;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)	// 한 테이블에 포함
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public class Item {
	
	@Id @GeneratedValue
	@Column(name = "item_id")
	private Long id;
	
	private String name;
	private int price;
	private int quantity;
	
	@ManyToMany(mappedBy = "items")
	private List<Category> categories = new ArrayList<>();
	

}
