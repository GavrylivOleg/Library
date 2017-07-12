package com.demo.entity;

import com.demo.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.*;

public class Library  implements com.demo.Library{
    Scanner scanner = new Scanner(System.in);

    public void addBook() {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            System.out.println("enter name of author: ");
            String nameOfAuthor = scanner.next();
            System.out.println("enter name of book: ");
            String nameOfBook = scanner.next();
            Author  author = new Author(nameOfAuthor);
            session.save(author);
            Book book = new Book(nameOfBook);
            book.setAuthor(author);
            session.save(book);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("can't add book");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public void removebookByName() {
        Session session = null;

        try {
            System.out.println("enter name of book: ");
            String nameOfBook = scanner.next();
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("delete Book where name=:name");
            query.setParameter("name",nameOfBook);
            query.executeUpdate();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("can't add book");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public void editBook() {
        Session session = null;

        try {
            System.out.println("enter name of book: ");
            String bookName = scanner.next();
            System.out.println("enter new name of book: ");
            String newBookName = scanner.next();
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("update Book set name=:newName where name=:oldName");
            query.setParameter("oldName",bookName);
            query.setParameter("newName",newBookName);
            query.executeUpdate();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("can't add book");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public List<Book> allBooks() {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("select name, author from Book ");
            List list = query.list();
            for(int i=0; i<list.size(); i++){
                System.out.println(list);
            }
            session.getTransaction().commit();
            return list;
        } catch (Exception e) {
            System.out.println("can't add book");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return null;
    }
	
}
