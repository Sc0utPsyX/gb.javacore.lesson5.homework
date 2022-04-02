public class HomeWorkApp {
    public static void main(String[] args) {
        Employee[] Employee = new Employee[5];
        Employee[0] = new Employee("Ivanov Ivan Ivanovich", "Director", "best@email.org",
                "+7(777)123-45-67", 2147483647, 77);
        Employee[1] = new Employee("Petrov Petr Petrovich", "Deputy director", "second@email.org",
                "+7 (111) 123-45-67", 1073741823, 66);
        Employee[2] = new Employee("Vladimirov Vladimir Vladimirovich", "Chef researcher", "science@email.org",
                "+7 (999) 123-45-67", 536870911, 55);
        Employee[3] = new Employee("Pavlov Pavel Pavlovich", "Junior researcher", "sciencesecond@email.org",
                "+7 (888) 123-45-67", 268435455, 39);
        Employee[4] = new Employee("Sergeev Sergey Sergeevich", "Lead Engineer", "bestengineer@email.org",
                "+7 (444) 123-45-67", 134217727, 33);
        System.out.println(Employee[4].toString());
        System.out.println("Employees over 40:");
        for (int i = 0; i < Employee.length; i++) {
            if (Employee[i].getAge() > 40){
                System.out.println(Employee[i].toString());
            }
        }
    }
}
