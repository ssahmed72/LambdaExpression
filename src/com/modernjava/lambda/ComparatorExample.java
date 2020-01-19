package com.modernjava.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        Book book1 =  new Book ("Java Programming", 32.50f);
        Book book2 = new Book ("Java Multithreading" , 42.75f);
        Book book3 = new Book ("Python Programming" , 50.75f);
        Book book4 = new Book ("C++ Programming", 25.25f);

        List<Book> listBooks = Arrays.asList(book1, book2,book3,book4);

        //Comparator using traditional way
        Comparator<Book> priceComparator = new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return (int) (book2.getPrice() - book1.getPrice());
            }
        };


        System.out.println(listBooks);
        //Collections.sort(listBooks, priceComparator);
        Collections.sort(listBooks, (Book b1, Book b2) -> (int) (b2.getPrice() - b1.getPrice()));
        System.out.println("After sorting the books");
        System.out.println(listBooks);
    }
}

class Book {
    private String title;
    private float price;

    public Book (String title, float price){
        this.title=title;
        this.price=price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
