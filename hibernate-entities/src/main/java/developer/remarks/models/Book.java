package developer.remarks.models;

import javax.persistence.Entity;

@Entity
public class Book extends Content {

    private int pageCount;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return super.toStringHelper()
                .add("pageCount", pageCount)
                .toString();
    }
}
