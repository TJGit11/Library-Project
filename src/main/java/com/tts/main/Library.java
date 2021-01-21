package com.tts.main;

import java.util.ArrayList;


public class Library {

    String address;
    ArrayList<Book> list;




    public Library(String address) {
        this.address = address;
        list = new ArrayList<>();
    }

    public void addBook(Book addbook) {
        this.list.add(addbook);
    }

    public void printAvailableBooks() {
        if(list.isEmpty()) {
            System.out.println("No book in the catalog");
        }else{
            for (Book book : list){
                if(!book.isBorrowed()) {
                    System.out.println(book.getTitle());
                }
            }
//                System.out.println(book.getTitle());
            }
        }


    public void returnBook(String title) {
        for (Book book : this.list){
            if(book.getTitle().equalsIgnoreCase(title)){
                book.returned();
                System.out.print("You have successfully returned " + book.getTitle());
            }
        }
    }

    public void printAddress() {
        System.out.println(this.address);

    }

    public void printOpeningHours(){
        System.out.println("Libraries are open daily from 9AM to 5PM");
    }

    public void borrowBook(String title) {
        for (Book book : this.list){
            if (title.equals(book.getTitle())){
                if (book.isBorrowed()) {
                    System.out.println("This book is already checked out");
                }else{
                    book.borrowed();
                    System.out.println("You have borrowed " + book.getTitle());
                }
                return;
            }
        }
//        System.out.println("Sorry, this book is not in our catalog");
    }


}