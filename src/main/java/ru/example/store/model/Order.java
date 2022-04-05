package ru.example.store.model;

import ru.example.store.enams.Order_status;
import ru.example.store.enams.Payment_method;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
@Entity
@Table(name = "order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String order_date;
    @Enumerated(EnumType.ORDINAL)
    private Order_status order_status;
    @Enumerated(EnumType.ORDINAL)
    private Payment_method payment_method;
    private long customer_id;
}
