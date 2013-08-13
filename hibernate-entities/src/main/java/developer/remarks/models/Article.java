package developer.remarks.models;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Article extends Content {

    private Date created;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
