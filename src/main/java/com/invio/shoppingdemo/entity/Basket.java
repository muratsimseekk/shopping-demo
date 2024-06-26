package com.invio.shoppingdemo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "basket" , schema = "shopping")
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double totalPrice;

    @JsonBackReference
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE , CascadeType.REFRESH , CascadeType.DETACH}, mappedBy = "basket")
    private List<Product> productList  =new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "orderEn_id")
    private OrderEn orderEn;

}
