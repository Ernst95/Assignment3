package com.Assignment4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/03/25.
 */
public class BookTest {

    Book book;

    @Before
    public void setUp() throws Exception {
        System.out.println("In Before Class");
    }

    @Test
    public void testSetIsbn() throws Exception {
        book = new Book();

        book.setIsbn("1111111111111");
        assertEquals("1111111111111", book.getIsbn());
    }

    @Test
    public void testSetAuthor() throws Exception {
        book = new Book();

        book.setIsbn("J K Rowling");
        assertEquals("J K Rowling", book.getAuthor());
    }

    @Test
    public void testSetTitle() throws Exception {
        book = new Book();

        book.setIsbn("Harry Potter 1");
        assertEquals("Harry Potter 1", book.getTitle());
    }

    @Test
    public void testSetGenre() throws Exception {
        book = new Book();

        book.setIsbn("Fantasy");
        assertEquals("Fantasy", book.getGenre());
    }

    @Test
    public void testGetIsbn() throws Exception {
        book = new Book();

        book.setIsbn("1111111111111");
        assertEquals("1111111111111", book.getIsbn());
    }

    @Test
    public void testGetAuthor() throws Exception {
        book = new Book();

        book.setIsbn("J K Rowling");
        assertEquals("J K Rowling", book.getAuthor());
    }

    @Test
    public void testGetTitle() throws Exception {
        book = new Book();

        book.setIsbn("Harry Potter 1");
        assertEquals("Harry Potter 1", book.getTitle());
    }

    @Test
    public void testGetGenre() throws Exception {
        book = new Book();

        book.setIsbn("Fantasy");
        assertEquals("Fantasy", book.getGenre());
    }

    @Test
    public void testToString() throws Exception {
        book = new Book("1111111111111","J K Rowling","Harry Potter 1","Fantasy");

        assertEquals("ISBN: 1111111111111 Author: J K Rowling Title: Harry Potter 1 Genre: Fantasy", book.toString());
    }

}