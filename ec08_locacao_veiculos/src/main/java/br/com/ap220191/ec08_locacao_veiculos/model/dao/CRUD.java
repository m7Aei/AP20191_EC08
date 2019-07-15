package br.com.ap220191.ec08_locacao_veiculos.model.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public interface CRUD {

    void save();
    static Object load(){return null;}

    static SessionFactory buildSessionFactory(Class classe){
        return new Configuration()
                .configure()
                .addAnnotatedClass(classe)
                .buildSessionFactory();
    }
}
