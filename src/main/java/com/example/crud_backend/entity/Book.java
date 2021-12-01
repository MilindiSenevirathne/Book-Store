package com.example.crud_backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
//@Data
@NoArgsConstructor
@Entity
public class Book {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String bookName;
    private String authorName;
    private int quantity;
    private Double price;
    private String invoicePath;

    public Book(String bookName, String authorName, int quantity,Double price,String invoicePath) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.quantity=quantity;
        this.price = price;
        this.invoicePath=invoicePath;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + bookName + '\'' +
                ", author='" + authorName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", invoice='" + invoicePath + '\'' +
                '}';
    }
}