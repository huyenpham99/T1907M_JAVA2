package Assignment3;

public class Main {
    public static void main(String[] args) {
        PersonModel<Student> studenList = new PersonModel<>();
        studenList.addNewPerson(new Student("1", "Huyen", 18));
        studenList.addNewPerson(new Student("2", "Linh", 18));
        studenList.disPlay();
        PersonModel<Employee> employeeList = new PersonModel<>();
        employeeList.addNewPerson(new Employee("1", "Nhan vien 1", 1500000));
        employeeList.addNewPerson(new Employee("2", "Nhan vien 2", 2300000));
        employeeList.disPlay();
    }
}
