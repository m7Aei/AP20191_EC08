package br.com.ap220191.ec08_locacao_veiculos.model.dao;

import br.com.ap220191.ec08_locacao_veiculos.model.Pagamento;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PagamentoDAO  {

    public void salvar(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(this);
        session.getTransaction().commit();
        session.close();

    }

    public static Pagamento buscar(SessionFactory sessionFactory,int id) {
        Session session = sessionFactory.openSession();
        Pagamento resultado = session.get(Pagamento.class, id);
        session.close();
        return resultado;
    }
}
