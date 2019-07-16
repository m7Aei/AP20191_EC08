package br.com.ap220191.ec08_locacao_veiculos.model.dao;

import br.com.ap220191.ec08_locacao_veiculos.model.Motorista;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class MotoristaDAO  extends CRUD{
    public static Motorista buscar(SessionFactory sessionFactory, int id) {
        Session session = sessionFactory.openSession();
        Motorista resultado = session.get(Motorista.class, id);
        session.close();
        return resultado;
    }

    public static Motorista buscarPorNome(SessionFactory sessionFactory, String nome) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Motorista.class);
        Object result = criteria.add(Restrictions.eq("nome", nome))
                .uniqueResult();
        session.close();
        return (Motorista) result;
    }

    public static List<Motorista> buscarTodosOsMotorista(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Motorista.class);
        return session.createQuery("SELECT a FROM Motorista a", Motorista.class).getResultList();
    }

}
