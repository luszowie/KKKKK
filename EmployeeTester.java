public class EmployeeTester {
    public static void main(String[] args) {

        Employee employee1 = new Employee("jan", 32, 3000);
        Employee employee2 = new Employee("jan", 32, 3000);

        if (employee1.equals(employee2)) {
            System.out.println("ten sam pracownik");
        }
    }
    public boolean equals(Employee employee) {
        return  true;
    }
}

