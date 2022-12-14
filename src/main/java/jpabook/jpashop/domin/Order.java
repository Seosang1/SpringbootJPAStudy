package jpabook.jpashop.domin;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*; 

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {
	 
	@Id @GeneratedValue
	@Column(name = "order_id")
	private Long id;
	
	@ManyToOne // 다대일
	@JoinColumn(name = "u_id")	// FK
	private Member member;

	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItems = new ArrayList<>();
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "delivery_id") private Delivery delivery;
	 */
	
	private LocalDateTime orderDate;
	/*
	 * @Enumerated(EnumType.STRING) private OrderStatus status; // 주문상태 [ORDER ,
	 * CANCEL]
	 */}
