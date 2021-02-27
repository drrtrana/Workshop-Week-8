public class Video {
    private String title;
    private int awardsWon;

    public Video(String title, int awardsWon) {
        this.title = title;
        this.awardsWon = awardsWon;
    }

    public int getAwardsWon() {
        return awardsWon;
    }

    public void setAwardsWon(int awardsWon) {
        this.awardsWon = awardsWon;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAwards Won: " + awardsWon;
    }
}
