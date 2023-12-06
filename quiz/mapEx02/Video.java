package quiz.mapEx02;

public class Video {
    String title;
    String category;
    Boolean lend;
    String lendName;
    String lendDate;

    public Video() {
        lend = false;
    }

    public Video(String title, String category) {
        this.title = title;
        this.category = category;
        lend = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getLend() {
        return lend;
    }

    public void setLend(Boolean lend) {
        this.lend = lend;
    }

    public String getLendName() {
        return lendName;
    }

    public void setLendName(String lendName) {
        this.lendName = lendName;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }


}
