package com.firm.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "defect")
@EntityListeners(AuditingEntityListener.class)
public class Defect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    private Product product;

    @Column(name = "time")
    private LocalDate time;

    public Defect() {
    }


    public Defect(Product product, LocalDate time) {
        this.product = product;
        this.time = time;
    }

    public Defect(int anInt, String string, Product product, java.sql.Date date) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }
}
