package developer.remarks.models;

import javax.persistence.Entity;

@Entity(name = "music_track")
public class Music extends Content {

    private int bitRate;

    public int getBitRate() {
        return bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }

    @Override
    public String toString() {
        return super.toStringHelper()
                .add("bitRate", bitRate)
                .toString();
    }
}
