package com.example.crud_backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "bookName")
    private String bookName;
    @Column(name = "author")
    private String author;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private double price;
}
