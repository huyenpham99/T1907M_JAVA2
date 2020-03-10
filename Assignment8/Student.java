package Assignment8;

import java.util.UUID;

public class Student {
    private UUID id;
    private String name;
    private Integer age;
    private Integer mark;

    public Student() {
    }

    public Student(String name, Integer age, Integer mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public Student(UUID id, String name, Integer age, Integer mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark;
    }
}
