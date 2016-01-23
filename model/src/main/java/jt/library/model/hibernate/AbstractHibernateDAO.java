package jt.library.model.hibernate;

import jt.library.model.dao.Dao;
import jt.library.model.entity.Persisten;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by sergey on 17.01.16.
 */
public abstract class AbstractHibernateDAO<T extends Persisten> implements Dao<T> {
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
