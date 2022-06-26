public class Main {
    public static void main(String[] args) {


        // Курсовая работа
        //поиск сотрудника с минимальной зарплатой,
        //поиск сотрудника с максимальной зарплатой,
        //подсчет среднего значения зарплат,

        System.out.println("Курсовая Работа");
        List list = new List();
        list.addEmployee(1, "Ivan Petrov", 500);
        list.addEmployee(2, "Ivan Petrov 1", 200000);
        list.addEmployee(3, "Ivan Petrov 2", 2000);
        list.addEmployee(4, "Ivan Petrov 3", 800);
        list.addEmployee(5, "Ivan Petrov 4", 50000);
        list.addEmployee(1, "Ivan Ivanov", 10000);
        list.addEmployee(2, "Ivan Ivanov 1", 10);
        list.addEmployee(3, "Ivan Ivanov 2", 100);
        list.addEmployee(4, "Ivan Ivanov 3", 40000);


        System.out.println(" Все сотрудники");
        list.printAllEmployees();
        System.out.println();
        System.out.println("Количество сотрудников: " + list.getCurrentSize1());

        System.out.println("Метод toString  " + list);
        System.out.println("Минимальная з.п.");
        list.minSalaryEmployee();
        System.out.println("Максимальная  з.п.");
        list.maxSalaryEmployee();

        System.out.println("Сумма з.п.");
        list.sumSalaryEmployee();

        System.out.println("Средняяя з.п.");
        list.averageSumSalaryEmployee();


        System.out.println("Удаленный сотрудник");
        list.removeEmployee("Ivan Ivanov 3");
        System.out.println("Поиск сотрудника");
        list.findEmployee("Ivan Ivanov 2");


    }
}