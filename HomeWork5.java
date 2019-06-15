/**
 * Java. Level 1. Lesson 5
 *
 * @author Artem Belsky
 * @version dated June 15, 2019
 */

class HomeWork5 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeeArray[1] = new Employee("Petrov Andrew", "Manager", "petrov@mailbox.com", "892023798", 70000, 25);
        employeeArray[2] = new Employee("Pushkova Svetlana", "Top Manager", "pushkova@mailbox.com", "892321507", 100000, 41);
        employeeArray[3] = new Employee("Klykova Anastacia", "Engineer", "klykova@mailbox.com", "899870165", 35000, 48);
        employeeArray[4] = new Employee("Lodka Pavel", "Engineer", "lodka@mailbox.com", "899850021", 45000, 44);

        System.out.println(employeeArray[0].getName() + ", " + employeeArray[0].position + ", " + employeeArray[0].age);

    }
}

class Employee {
    // поля
    private String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    // методы
    Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    String getName() {
        return name;
    }
}