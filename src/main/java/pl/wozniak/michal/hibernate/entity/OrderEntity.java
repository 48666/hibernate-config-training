package pl.wozniak.michal.hibernate.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ORDERS")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal total;



    public OrderEntity() {
    }

    public Long getId() {
        return id;
    }


    public BigDecimal getTotal() {
        return total;
    }



    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "id=" + id +
                ", total=" + total +
                '}';
    }
}
