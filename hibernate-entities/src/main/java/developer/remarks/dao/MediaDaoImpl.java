package developer.remarks.dao;

import developer.remarks.models.Content;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MediaDaoImpl implements MediaDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Content content) {
        sessionFactory.getCurrentSession().save(content);
    }
}
