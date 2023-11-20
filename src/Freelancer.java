public class Freelancer extends Employee{
    int hours;
    double stavka;
    public Freelancer(String surname, String name, int age, double stavka, int hours) {
        super(surname, name, age, 0);
        this.stavka=stavka;
        this.hours = hours;
    }

    public int setHours(int hours) {
        this.hours = hours;
        return hours;
    }

    @Override
    public double calculateSalary() {
        return hours*stavka;
    }
    public String toString() {
        return String.format("%s %s возраст %d ставка: %.2f, уровень зарплаты в месяц %.2f ",
                super.surname, super.name, super.age, stavka, calculateSalary());
    }
}
