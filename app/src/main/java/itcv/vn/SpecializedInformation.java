package itcv.vn;

import java.util.List;

public class SpecializedInformation {
    private String durationStart;
    private String durationEnd;
    private String title;
    private String location;
    private String description;

    public SpecializedInformation(String durationStart, String durationEnd, String title, String location, String description) {
        this.durationStart = durationStart;
        this.durationEnd = durationEnd;
        this.title = title;
        this.location = location;
        this.description = description;
    }

    public String getDurationStart() {
        return durationStart;
    }

    public void setDurationStart(String durationStart) {
        this.durationStart = durationStart;
    }

    public String getDurationEnd() {
        return durationEnd;
    }

    public void setDurationEnd(String durationEnd) {
        this.durationEnd = durationEnd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
