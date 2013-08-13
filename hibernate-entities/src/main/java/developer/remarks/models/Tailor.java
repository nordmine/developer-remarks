package developer.remarks.models;

import javax.persistence.Entity;

@Entity
public class Tailor extends Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
