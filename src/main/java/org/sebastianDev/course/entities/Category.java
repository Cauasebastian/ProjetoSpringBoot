package org.sebastianDev.course.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_category")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
@ManyToMany(mappedBy = "categories") //mappedBy is a JPA annotation that indicates that the categories field in the Product class is the "inverse" side of the relationship. This means that the categories field in the Product class is the "owner" of the relationship, and it is responsible for managing the relationship between the
   @Transient
    private Set<Product> product = new HashSet<>(); //Set is a collection that allows duplicate elements. HashSet is a concrete implementation of Set that uses a hash table to store the elements. HashSet is a thread-safe class, meaning that it can be safely accessed from multiple threads concurrently.

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Set<Product> getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        return getId().equals(category.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}