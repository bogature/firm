package com.firm.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "provider")
@EntityListeners(AuditingEntityListener.class)
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "categorys_id", insertable = false, updatable = false)
    private Category category;

    @Column(name = "categorys_id")
    private long categorys_id;

    public Provider() {
    }

    public Provider(String name, Category category, long categorys_id) {
        this.name = name;
        this.category = category;
        this.categorys_id = categorys_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getCategorys_id() {
        return categorys_id;
    }

    public void setCategorys_id(long categorys_id) {
        this.categorys_id = categorys_id;
    }
}
