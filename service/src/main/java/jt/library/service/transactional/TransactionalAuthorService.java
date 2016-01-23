package jt.library.service.transactional;

import jt.library.model.dao.Dao;
import jt.library.model.entity.Author;
import jt.library.service.AuthorService;

import java.util.List;

/**
 * Created by sergey on 17.01.16.
 */
public class TransactionalAuthorService implements AuthorService {
    private Dao<Author> authorDao;

    public TransactionalAuthorService(Dao<Author> authorDao) {
        this.authorDao = authorDao;
    }

    public void saveOrUpdate(Author persistent) {
        authorDao.saveOrUpdate(persistent);
    }

    public void delete(Long id) {
        authorDao.delete(id);
    }

    public void delete(Author persistent) {
        authorDao.delete(persistent);
    }

    public Author get(Long id) {
        return authorDao.get(id);
    }

    public List<Author> getAll() {
        return authorDao.getAll();
    }


    public void setAuthorDao(Dao<Author> authorDao) {
        this.authorDao = authorDao;
    }


}
