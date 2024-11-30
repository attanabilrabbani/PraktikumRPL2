/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.attanabil.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Attanabil Rabbani
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    
    static{
        try{
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex){
            System.err.println("Initial SessionFactory creation failed."+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static void testConnection(){
        try (Session session = sessionFactory.openSession()){
            System.out.println("Initial SessionFactory creation successful.");
            
        } catch (Exception e){
            System.err.println("Failed to connect to database");
            e.printStackTrace();
        }
    }
}