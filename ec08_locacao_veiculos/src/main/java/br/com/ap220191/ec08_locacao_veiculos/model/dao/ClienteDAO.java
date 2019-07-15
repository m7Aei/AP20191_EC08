package br.com.ap220191.ec08_locacao_veiculos.model.dao;

import br.com.ap220191.ec08_locacao_veiculos.model.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ClienteDAO extends CRUD {

    public static Cliente buscar(SessionFactory sessionFactory, int id) {
        Session session = sessionFactory.openSession();
        Cliente resultado = session.get(Cliente.class, id);
        session.close();
        return resultado;
    }
}
