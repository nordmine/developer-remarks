package developer.remarks.models;

import javax.persistence.Entity;

@Entity
public class Music extends Content {

    private int bitRate;

    public int getBitRate() {
        return bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }
}
