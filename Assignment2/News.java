package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    int ID;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;

    public News() {
    }

    public News(int ID, String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }
    @Override
    public void Display() {
            System.out.println(getID());
            System.out.println(getTitle());
            System.out.println(getPublishDate());
            System.out.println(getAuthor());
            System.out.println(getContent());
            System.out.println(AverageRate);
    }
    public float Calculate() {
        int[] RateList = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < RateList.length; i++) {
            System.out.printf("Nhập RateList[%d] :", +i);
            RateList[i] = sc.nextInt();

        }
        int sum = 0;
        float AverageRate1 = 0;
        for (int i = 0; i < RateList.length; i++) {
            sum += RateList[i];
            AverageRate1 = sum / (RateList.length);
        }
        return AverageRate = AverageRate1;
    }
}
