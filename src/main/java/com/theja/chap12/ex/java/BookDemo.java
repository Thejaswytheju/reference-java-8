package com.theja.chap12.ex.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Book{
     String author;
     String publisher;
     int id;

     public Book(String author, String publisher, int id) {
         this.author = author;
         this.publisher = publisher;
         this.id = id;
     }
 }
 public class BookDemo {
     public static void main(String args[]) {
         Book b1 = new Book("harish", "yeswanth kaur", 124);
         Book b2 = new Book("theja", "albert", 142);
         Book b3 = new Book("vidip", "sanjay", 121);

         LinkedList<Book> al = new LinkedList<Book>();
         al.add(b1);
         al.add(b2);
         al.add(b3);

         for(Book b:al){
         System.out.println(b.id + "" + b.author + "" + b.publisher);
         }
         }
     }




