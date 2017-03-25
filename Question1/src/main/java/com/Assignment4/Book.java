package com.Assignment4;

/**
 * Hello world!
 *
 */
public class Book
{
    private String isbn;
    private String author;
    private String title;
    private String genre;

    public Book()
    {

    }

    public Book(String isbn, String author, String title, String genre)
    {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    public String getGenre()
    {
        return genre;
    }

    public String toString()
    {
        return ("ISBN: " + isbn + " Author: " + author + " Title: " + title + " Genre: " + genre);
    }
}
