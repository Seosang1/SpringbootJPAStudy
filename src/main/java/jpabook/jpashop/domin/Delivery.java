/*
 * package jpabook.jpashop.domin;
 * 
 * import javax.persistence.Column; import
 * javax.persistence.DiscriminatorColumn; import javax.persistence.Embedded;
 * import javax.persistence.Entity; import javax.persistence.EnumType; import
 * javax.persistence.Enumerated; import javax.persistence.GeneratedValue; import
 * javax.persistence.Id; import javax.persistence.Inheritance; import
 * javax.persistence.InheritanceType; import javax.persistence.OneToOne;
 * 
 * import lombok.Getter; import lombok.Setter;
 * 
 * @Entity
 * 
 * @Inheritance(strategy = InheritanceType.SINGLE_TABLE) // 한 테이블에 포함
 * 
 * @DiscriminatorColumn(name = "dtype")
 * 
 * @Getter @Setter public class Delivery {
 * 
 * @Id @GeneratedValue
 * 
 * @Column(name = "delivery_id") private Long Id;
 * 
 * @OneToOne(mappedBy = "delivery") private Order order;
 * 
 * @Embedded private Address addr;
 * 
 * @Enumerated(EnumType.STRING) private DeliveryStatus status; // [READY, COMP]
 * 
 * }
 */