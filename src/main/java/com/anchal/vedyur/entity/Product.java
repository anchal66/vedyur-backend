package com.anchal.vedyur.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private  String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit-price")
    private BigDecimal unitPrice;

    @Column(name = "imgUrl")
    private String imgUrl;

    @Column(name = "active")
    private boolean active;

    @Column(name = "unitsInStock")
    private int unitsInStock;

    @Column(name = "dateCreated")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "lastUpdated")
    @UpdateTimestamp
    private Date lastUpdated;
}
