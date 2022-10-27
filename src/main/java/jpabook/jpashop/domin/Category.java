package jpabook.jpashop.domin;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import jpabook.jpashop.domin.item.Item;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Category {

	@Id @GeneratedValue
	@Column(name = "category_id")
	private Long Id; 
	
	private String name; 
	
	@ManyToMany
	@JoinTable(name = "category_item",
		joinColumns = @JoinColumn(name = "category_id"),
		inverseJoinColumns = @JoinColumn(name = "item_id")
	)
	private List<Item> items = new ArrayList<>(); 

}
