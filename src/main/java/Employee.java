public class Employee {
    String firstName;
    String lastName;
    char gender;
    int age;
    String department;

    public Employee(){
        this("Patrick", "Lee",55, 'M');
        System.out.println("Constructor is called....");
    }

    public Employee(String firstName, String lastNAME, int age, char gender){
        this.firstName = firstName;
        this.lastName = lastNAME;
        this.age = age;
        this.gender = gender;

    }

    public static void main(String[] args){
        Employee employee1 = new Employee("Nana"," Asante",55, 'F');
        Employee employee2 = new Employee("Paul", "Kyrios", 66, 'M');
        Employee employee13 = new Employee();
        /*|employee1.firstName = "Perry";
        employee1.lastName = "Colt";
        employee1.gender = "Female";
        employee1.age = 22;
        employee1.department = "Tech"; */

        System.out.println(employee1.firstName);
        System.out.println(employee1.department);
    }

}
