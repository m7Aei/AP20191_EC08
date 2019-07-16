/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.model;

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

        pagamento.salvar(sessionFactory);
        Pagamento pagamento1 = Pagamento.buscar(sessionFactory,1);
        System.out.println("Valor recuperado: "+pagamento1.getValor());
    }

    private static SessionFactory buildSessionFactory(){
        return new Configuration()
                .configure()
                .buildSessionFactory();
    }
}



