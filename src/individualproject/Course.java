package individualproject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {

    static int counter = 1;
    private int id;
    private String title;
    private String stream;
    private String type;
    private LocalDate startDate;
    private LocalDate endDate;
    public static List<Course> courses = new ArrayList();

    public Course() {
    }

    public Course(String title, String stream, String type, LocalDate startDate, LocalDate endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        id = counter;
        counter++;
        courses.add(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String x = "ID: " + id
                + "\nTitle: " + title
                + "\nStream: " + stream
                + "\nType: " + type
                + "\nStart Date: " + startDate
                + "\nEnd Date: " + endDate
                + "\n*************************\n";
        return x;
    }

    public static void printList() {

        for (Course c : courses) {

            System.out.println(c);

        }
    }

}
