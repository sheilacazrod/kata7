package software.ulpgc.kata7;

public class Game {

   private final String Platform;
   private final String Genre;
   private final String Publisher;
   private final String NA_Sales;
   private final String EU_Sales;
   private final String JP_Sales;
   private final String Other_Sales;
   private final String Global_Sales;
   private final String Rating;
   private final String Critic_Score_Class;

    public Game(String platform, String genre, String publisher, String NA_Sales, String EU_Sales, String JP_Sales, String other_Sales, String global_Sales, String rating, String critic_Score_Class) {
        Platform = platform;
        Genre = genre;
        Publisher = publisher;
        this.NA_Sales = NA_Sales;
        this.EU_Sales = EU_Sales;
        this.JP_Sales = JP_Sales;
        Other_Sales = other_Sales;
        Global_Sales = global_Sales;
        Rating = rating;
        Critic_Score_Class = critic_Score_Class;
    }

    public String getPlatform() {
        return Platform;
    }

    public String getGenre() {
        return Genre;
    }

    public String getPublisher() {
        return Publisher;
    }

    public String getNA_Sales() {
        return NA_Sales;
    }

    public String getEU_Sales() {
        return EU_Sales;
    }

    public String getJP_Sales() {
        return JP_Sales;
    }

    public String getOther_Sales() {
        return Other_Sales;
    }

    public String getGlobal_Sales() {
        return Global_Sales;
    }

    public String getRating() {
        return Rating;
    }

    public String getCritic_Score_Class() {
        return Critic_Score_Class;
    }
}
