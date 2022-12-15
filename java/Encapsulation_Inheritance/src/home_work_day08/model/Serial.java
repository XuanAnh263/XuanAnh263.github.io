package home_work_day08.model;

public class Serial extends Film {
    private int episodes;
    private int avgTime;

    public Serial() {
    }

    public Serial(int id, String title, String category, String director, int premiereDate, int episodes, int avgTime) {
        super(id, title, category, director, premiereDate,);
        this.episodes = episodes;
        this.avgTime = avgTime;
    }
    
    public void display() {
        System.out.println("ID " + this.getId());
        System.out.println("TITLE " + this.getTitle());
        System.out.println("CATEGORY " + this.getCategory());
        System.out.println("DIRECTOR " + this.getDirector());
        System.out.println("PREMIEREDATE " + this.getPremiereDate());
        System.out.println("EPISODES " + this.getEpisodes());
        System.out.println("AVETIME " + this.getAvgTime());
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(int avgTime) {
        this.avgTime = avgTime;
    }

    @Override
    public String toString() {
        return "Serial{" +
                "id = " + getId() +
                ", title = '" + getTitle() + '\'' +
                ", category = '" + getCategory() + '\'' +
                ", derector = '" + getDirector() + '\'' +
                ", premiereDate = " + getPremiereDate() +
                ", episodes = " + episodes +
                ", avgTime = " + avgTime +
                "} ";
    }
}
