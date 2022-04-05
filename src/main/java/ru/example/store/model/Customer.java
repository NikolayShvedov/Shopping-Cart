package ru.example.store.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private String name;
    @NonNull
    private String address;
    @NonNull
    private String email;
    @NonNull
    private String phone;
}


