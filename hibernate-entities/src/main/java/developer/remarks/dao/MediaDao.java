package developer.remarks.dao;

import developer.remarks.models.Content;

import java.util.List;

public interface MediaDao {

    public void save(Content content);
    public List<Content> getAll();

}
