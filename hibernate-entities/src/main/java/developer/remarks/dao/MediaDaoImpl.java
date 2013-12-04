package developer.remarks.dao;

import developer.remarks.models.Content;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MediaDaoImpl implements MediaDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Content content) {
        em.persist(content);
    }

    @Override
    public List<Content> getAll() {
        return em.createQuery("from Content", Content.class).getResultList();
    }
}
