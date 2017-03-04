package controller;

import java.util.ArrayList;
import model.Comments;
import model.Posts;
import model.Users;
import model.Votes;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin
 */
public class DataAkses {

    public static SessionFactory factory;

    public DataAkses() {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            System.err.println("error membuat Session factory");
            e.printStackTrace();
        }
    }

    public ArrayList<Users> getUser(String username) {
        Session session = factory.openSession();
        ArrayList<Users> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Users where username = '" + username + "'");
        hasil = (ArrayList<Users>) q.list();

        tx.commit();
        session.close();

        return hasil;
    }

    public ArrayList<Users> getUser(int iduser) {
        Session session = factory.openSession();
        ArrayList<Users> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Users where id_user = '" + iduser + "'");
        hasil = (ArrayList<Users>) q.list();

        tx.commit();
        session.close();

        return hasil;
    }

    public ArrayList<Users> getAllUser() {
        Session session = factory.openSession();
        ArrayList<Users> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Users");
        hasil = (ArrayList<Users>) q.list();

        tx.commit();
        session.close();

        return hasil;
    }

    public boolean insertUser(Users u) {

        Session session = factory.openSession();
        ArrayList<Users> hasil = null;
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(u);
        tx.commit();
        session.close();
        return true;
    }

    public ArrayList<Posts> getAllPost() {
        Session session = factory.openSession();
        ArrayList<Posts> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Posts");
        hasil = (ArrayList<Posts>) q.list();

        tx.commit();
        session.close();

        return hasil;
    }
    
        public ArrayList<Posts> getAllPost(String post_type) {
        Session session = factory.openSession();
        ArrayList<Posts> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Posts where post_type = '"+post_type+"'");
        hasil = (ArrayList<Posts>) q.list();

        tx.commit();
        session.close();

        return hasil;
    }

    public ArrayList<Posts> getPost(int idpost) {
        Session session = factory.openSession();
        ArrayList<Posts> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Posts where id_post = '" + idpost + "'");
        hasil = (ArrayList<Posts>) q.list();

        tx.commit();
        session.close();

        return hasil;
    }

       public ArrayList<Posts> searchPost(String keyword) {
        Session session = factory.openSession();
        ArrayList<Posts> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Posts where title like '%" + keyword + "%' or content like '%" + keyword + "%'or post_type = '" + keyword + "'");
        hasil = (ArrayList<Posts>) q.list();

        tx.commit();
        session.close();

        return hasil;
    }
    public boolean insertPosts(Posts p) {

        Session session = factory.openSession();
        ArrayList<Users> hasil = null;
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(p);
        tx.commit();
        session.close();
        return true;
    }

    public ArrayList<Comments> getComment(int idpost) {
        Session session = factory.openSession();
        ArrayList<Comments> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Comments where id_post= '" + idpost + "'");
        hasil = (ArrayList<Comments>) q.list();

        tx.commit();
        session.close();

        return hasil;
    }
        public ArrayList<Comments> getCommentt(int idcomment) {
        Session session = factory.openSession();
        ArrayList<Comments> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Comments where id_comment= '" + idcomment + "'");
        hasil = (ArrayList<Comments>) q.list();

        tx.commit();
        session.close();

        return hasil;
    }

    public boolean insertComment(Comments c) {

        Session session = factory.openSession();
        ArrayList<Comments> hasil = null;
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(c);
        tx.commit();
        session.close();
        return true;
    }

    public ArrayList<Votes> getVotePost(int idpost) {
        Session session = factory.openSession();
        ArrayList<Votes> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Votes where id_post= '" + idpost + "'");
        hasil = (ArrayList<Votes>) q.list();

        tx.commit();
        session.close();

        return hasil;
    }
    public ArrayList<Votes> getVoteComment(int idcomment) {
        Session session = factory.openSession();
        ArrayList<Votes> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Votes where id_comment= '" + idcomment + "'");
        hasil = (ArrayList<Votes>) q.list();

        tx.commit();
        session.close();

        return hasil;
    }



    public boolean insertVote(Votes v) {

        Session session = factory.openSession();
        ArrayList<Votes> hasil = null;
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(v);
        tx.commit();
        session.close();
        return true;
    }

    public boolean updateVote(int idvote, int vote) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Votes v = (Votes) session.get(Votes.class, idvote);
            v.setVote(vote);
            session.update(v);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
            return true;
        }
    }
}
