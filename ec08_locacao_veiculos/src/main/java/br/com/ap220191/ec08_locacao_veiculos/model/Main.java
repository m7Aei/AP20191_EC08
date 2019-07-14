/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author T-Gamer
 */
public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento();
        pagamento.setValor((float) 22.50);
        pagamento.setParcelamento(3);

        final SessionFactory sessionFactory = buildSessionFactory();

        final Session session = sessionFactory.openSession();
        session.save(pagamento);
        Pagamento pagamento1 = session.get(Pagamento.class, 1);

        System.out.println("Pagamento1, valor: " + pagamento1.getValor() + "\n parcelamento: " + pagamento1.getParcelamento());
        session.close();
        sessionFactory.close();

    }

    private static SessionFactory buildSessionFactory(){

        return new Configuration()
                .configure()
                .buildSessionFactory();
    }
}



