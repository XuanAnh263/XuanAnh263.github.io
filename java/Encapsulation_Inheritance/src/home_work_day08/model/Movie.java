package home_work_day08.model;

public class Movie extends Film{
    private int time;

    public Movie() {
    }

    public Movie(int id, String title, String category, String director, int premiereDate, int time) {
        super(id, title, category, director, premiereDate);
        this.time = time;
    }
    
    public void display() {
        System.out.println("ID " + this.getId());
        System.out.println("TITLE " + this.getTitle());
        System.out.println("CATEGORY " + this.getCategory());
        System.out.println("DIRECTOR " + this.getDirector());
        System.out.println("PREMIEREDATE " + this.getPremiereDate());
        System.out.println("TIME " + this.getTime());
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id = " + getId() +
                ", title = '" + getTitle() + '\'' +
                ", category = '" + getCategory() + '\'' +
                ", director = '" + getDirector() + '\'' +
                ", premiereDate = " + getPremiereDate() +
                ", time = " + time +
                "} ";
    }
}
