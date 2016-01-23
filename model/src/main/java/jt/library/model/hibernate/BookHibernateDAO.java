package jt.library.model.hibernate;

import jt.library.model.entity.Book;
import org.hibernate.Query;

import java.util.List;

/**
 * Created by sergey on 17.01.16.
 */
public class BookHibernateDAO extends AbstractHibernateDAO<Book> {

    public void saveOrUpdate(Book persistent) {
        getSession().save(persistent);
    }

    public void delete(Long id) {
        Query query = getSession().createQuery("delete Book where id= :bookId");
        query.setLong("bookId", id);
        query.executeUpdate();
    }

    public void delete(Book persistent) {
        getSession().delete(persistent);
    }

    public Book get(Long id) {
        return (Book)getSession().load(Book.class, id);

    }


    @SuppressWarnings({"unchecked"})
    public List<Book> getAll() {
        return getSession().createQuery("from Book").list();
    }
}
