package developer.remarks.services;

import developer.remarks.dao.MediaDao;
import developer.remarks.models.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("storageService")
public class MediaServiceImpl implements MediaService {

    @Autowired
    private MediaDao dao;

    @Transactional
    @Override
    public void save(Content content) {
        dao.save(content);
    }
}
