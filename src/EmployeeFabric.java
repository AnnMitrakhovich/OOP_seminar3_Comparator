import java.util.Random;

public class EmployeeFabric {
    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] surnames = new String[]
                {"Иванов", "Сидоров", "Мельников", "Студень", "Петров", "Щитень"};
        String[] names = new String[]{"Антон", "Захар", "Ян", "Петр", "Сергей", "Андрей"};
        int ages = random.nextInt(18, 100);
        int salary = random.nextInt(1000);
        int stavka = random.nextInt(100);
        int hour = random.nextInt(5);
        int index = random.nextInt(2);
        if (index == 1) {
            FullTimeEmployee worker = new FullTimeEmployee(surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)], ages, salary);
            return worker;
        } else {
            Freelancer worker = new Freelancer(surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)], ages, stavka, hour);

            return worker;

        }
    }
    public static Employee[] generateEmployees(int count) {
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++) {
            workers[i] = generateEmployee();

        }
        return workers;
    }
}
