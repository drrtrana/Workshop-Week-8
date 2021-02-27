public class Movie extends Video{
    private int length;
    private String director;

    public Movie(String title, int awardsWon, int length, String director) {
        super(title, awardsWon);
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLength: " + length + "\nDirector: " + director;
    }
}
