package Assignment3_Ver2;

public class Student {
    String ID;
    String name;
    int age;

    public Student(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
