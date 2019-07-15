package br.com.ap220191.ec08_locacao_veiculos.model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public abstract class CRUD {

    public void salvar(SessionFactory sessionFactory){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(this);
        session.getTransaction().commit();
        session.close();
    }
    static Object load(){return null;}

    static SessionFactory buildSessionFactory(Class classe){
        return new Configuration()
                .configure()
                .addAnnotatedClass(classe)
                .buildSessionFactory();
    }
}
