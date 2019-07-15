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
    static final SessionFactory sessionFactory = buildSessionFactory();
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento();
        pagamento.setValor((float) 22.50);
        pagamento.setParcelamento(3);

        pagamento.salvar(sessionFactory);
        Pagamento pagamento1 = Pagamento.buscar(sessionFactory,1);
        System.out.println("Valor recuperado: "+pagamento1.getValor()+"\n");


        Motorista motorista = new Motorista();
        motorista.setNome("natalinda amorDaMinha vida");
        motorista.salvar(sessionFactory);
        Motorista motoristaDoBanco = Motorista.buscarPorNome(sessionFactory, "natalinda amorDaMinha vida");

        System.out.println("Nome do Motorista Do Banco:" + motoristaDoBanco.getNome());


    }

    private static SessionFactory buildSessionFactory(){
        return new Configuration()
                .configure()
                .buildSessionFactory();
    }
}



