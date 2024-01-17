package com.project.ProductService.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private long productId;

    @Column(name="PRODUCT_NAME")
    private String productName;

    @Column(name="PRICE")
    private long price;

    @Column(name="QUANTITY")
    private long quantity;

}
