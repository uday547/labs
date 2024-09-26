package com.deloitte.Lab04;

abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(int id, String title, int copies, String author) {
        super(id, title, copies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}


class Book extends WrittenItem {
    public Book(int id, String title, int copies, String author) {
        super(id, title, copies, author);
    }
}

class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int id, String title, int copies, String author, int year) {
        super(id, title, copies, author);
        this.yearPublished = year;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year Published: " + yearPublished;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}

