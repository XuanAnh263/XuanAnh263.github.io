package home_work_day08.model;

public class Serial extends Movie {
    private int episodes;
    private int avgTime;

    public Serial() {
    }

    public Serial(int id, String title, String category, String director, int premiereDate, int time, int episodes, int avgTime) {
        super(id, title, category, director, premiereDate, time);
        this.episodes = episodes;
        this.avgTime = avgTime;
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
