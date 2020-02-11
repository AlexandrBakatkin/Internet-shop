package Bakatkin.Internetshop.persist.model;

import javax.persistence.*;

@Entity
@Table (name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @Column
    private String status;

    public Order() {
    }

    public Order(User user, Address address, String status) {
        this.user = user;
        this.address = address;
        this.status = status;
    }
}