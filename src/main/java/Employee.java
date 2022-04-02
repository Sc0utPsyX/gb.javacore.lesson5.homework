public class Employee {
    private String fullName;
    private String position;
    private String eMail;
    private String phoneNumber;
    /* поскольку телефоны могут быть больше int
    и для простоты заполнения поля (понимаю что могут быть разные варианты типа +7  (926) или +7926) использую String
    */
    private int salary; // а для зарплаты ограничим пока int ведь мы только учимся :)
    private int age;


    public Employee(String fullName, String position, String eMail, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override /* эту магию видел на уроке и прочитав про неё понял, что она будет на следующих занятиях но
    для выполнения задания 3 буду использовать чтобы не было ошибок при определении с родительским классом*/
    public String toString() {
      return String.format("Full Name: %s\nEmployee posititon: %s\nEmployee e-mail : %s\nPhone number " +
              ": %s\nEmployee salary: %d $\nEmployee age: %d\n", fullName,
              position, eMail, phoneNumber, salary, age); /*  последний \n поставил специльно, чтобы был либо перенос
    строки либо при методе принтлн был разрыв строк для лучшей читаемости текста в консоли*/
    }

}

