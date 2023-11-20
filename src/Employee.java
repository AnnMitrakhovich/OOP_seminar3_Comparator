public abstract class Employee implements Comparable<Employee>{
    protected String surname;
    protected String name;
    protected double salary;

    protected int age;

    public Employee(String surname, String name, int age, double salary) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int resOfCompare = surname.compareTo(o.surname);
        if (resOfCompare==0) {
            return name.compareTo(o.name);
        } else {
        return resOfCompare;
        }
    }

    public String toString() {
        return String.format("%s %s ставка: %.2f, уровень зарплаты в месяц %.2f ",
                surname, name, age, salary, calculateSalary());
    }
}
