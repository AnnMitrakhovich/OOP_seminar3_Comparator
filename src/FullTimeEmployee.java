public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String surname, String name, int age, double salary) {
        super(surname, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
    public String toString() {
        return String.format("%s %s возраст %d уровень зарплаты в месяц %.2f ",
                super.surname, super.name, super.age, calculateSalary());
    }
}
