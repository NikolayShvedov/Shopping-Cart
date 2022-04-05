package ru.example.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
@Entity
@Table(name = "orderDetail")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long order_id;
    private long product_id;
    private double price;
    private long quantity;

}
