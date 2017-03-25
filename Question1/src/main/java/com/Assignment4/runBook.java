package com.Assignment4;

import java.util.*;

/**
 * Created by Ernst on 2017/03/25.
 */
public class runBook {

    public static void main(String[]args)
    {
        ArrayList<String> bookArr = new ArrayList<String>();
        HashSet<String> bookSet = new HashSet<String>();
        HashMap<String, String> bookMap = new HashMap<String, String>();
        Collection<String> bookCollection = new HashSet<String>();

        //ArrayList
        Book romanceBook = new Book("1111111111111", "E L James", "Fifty Shades of Grey", "Romance");
        Book romanceBook2 = new Book("1111111111112", "E L James", "Fifty Shades of White", "Romance");
        Book romanceBook3 = new Book("1111111111113", "E L James", "Fifty Shades of Black", "Romance");
        Book romanceBook4 = new Book("1111111111114", "E L James", "Fifty Shades of Green", "Romance");
        Book romanceBook5 = new Book("1111111111115", "E L James", "Fifty Shades of Red", "Romance");

        bookArr.add(romanceBook.toString());
        bookArr.add(romanceBook2.toString());
        bookArr.add(romanceBook3.toString());
        bookArr.add(romanceBook4.toString());
        bookArr.add(romanceBook5.toString());

        //HashSet
        Book fantasyBook = new Book("2222222222221", "J K Rowling", "Harry Potter 1", "Fantasy");
        Book fantasyBook2 = new Book("2222222222222", "J K Rowling", "Harry Potter 2", "Fantasy");
        Book fantasyBook3 = new Book("2222222222223", "J K Rowling", "Harry Potter 3", "Fantasy");
        Book fantasyBook4 = new Book("2222222222224", "J K Rowling", "Harry Potter 4", "Fantasy");
        Book fantasyBook5 = new Book("2222222222225", "J K Rowling", "Harry Potter 5", "Fantasy");

        bookSet.add(fantasyBook.toString());
        bookSet.add(fantasyBook2.toString());
        bookSet.add(fantasyBook3.toString());
        bookSet.add(fantasyBook4.toString());
        bookSet.add(fantasyBook5.toString());

        //HashMap
        bookMap.put("1", romanceBook.toString());
        bookMap.put("2", fantasyBook.toString());
        bookMap.put("3", romanceBook2.toString());
        bookMap.put("4", fantasyBook2.toString());
        bookMap.put("5", romanceBook3.toString());

        String[] mapElements = new String[5];

        mapElements[0] = (String) bookMap.get("1");
        mapElements[1] = (String) bookMap.get("2");
        mapElements[2] = (String) bookMap.get("3");
        mapElements[3] = (String) bookMap.get("4");
        mapElements[4] = (String) bookMap.get("5");

        //Collection
        bookCollection.add(romanceBook.toString());
        bookCollection.add(fantasyBook.toString());
        bookCollection.add(romanceBook2.toString());
        bookCollection.add(fantasyBook2.toString());
        bookCollection.add(romanceBook3.toString());
        bookCollection.toArray();

        //Display
        System.out.println("ArrayList Collection");
        for(int i = 0; i < bookArr.size(); i++)
        {
            System.out.println(bookArr.get(i));
        }

        System.out.println("\nHashSet Collection");
        for(String s : bookSet)
        {
           System.out.println(s);
        }

        System.out.println("\nHashMap Collection");
        for (String key : bookMap.keySet()) {
            System.out.println(key + " " + bookMap.get(key));
        }

        System.out.println("\nGeneric Collection");
        for(String t : bookCollection)
        {
            System.out.println(t);
        }
    }
}
