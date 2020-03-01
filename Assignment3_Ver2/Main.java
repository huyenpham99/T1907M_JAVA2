package Assignment3_Ver2;

public class Main {
    public static void main(String[] args) {
        PersonModel<Student> studentList = new PersonModel<>();
        studentList.addNewPerson(new Student("01", "Huyen", 18));
        studentList.addNewPerson(new Student("02", "Linh", 18));
        studentList.showInfo();
        PersonModel<Employee> employeeList = new PersonModel<>();
        employeeList.addNewPerson(new Employee("01" , "Nguyen Thanh Tuan", 1500000));
        employeeList.addNewPerson(new Employee("01" , "Nguyen Thanh Tuan", 1500000));
        employeeList.showInfo();
    }
}
