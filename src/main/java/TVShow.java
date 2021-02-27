public class TVShow extends Video{
    private int numEpisodes;
    private int startYear;

    public TVShow(String title, int awardsWon, int numEpisodes, int startYear) {
        super(title, awardsWon);
        this.numEpisodes = numEpisodes;
        this.startYear = startYear;
    }

    public int getNumEpisodes() {
        return numEpisodes;
    }

    public int getStartYear() {
        return startYear;
    }

    public void printInfo() {
        System.out.println(super.toString() + "\nNum Episodes: " + numEpisodes + "\nStart Year: " + startYear);
    }
}
