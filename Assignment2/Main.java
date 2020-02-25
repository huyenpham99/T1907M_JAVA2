package Assignment2;

public class Main   {
    public static void main(String[] args) {
        News news = new News();
        news.setID(1);
        news.setTitle("Rừng xà nu");
        news.setPublishDate("12/1/1999");
        news.setAuthor("John");
        news.setContent("Great");
        news.Calculate();
        news.getAverageRate();
        news.Display();

    }
}
