import java.util.Arrays;
import java.util.Objects;

public class List {
    private final Employee[] employees;
    private int size1;

    public List() {
        this.employees = new Employee[10];
    }

    public void addEmployee(int department, String employeeName, int salary) {
        if (size1 >= employees.length) {
            System.out.println("Список переполнен.");
        }
        Employee newEmployee = new Employee(department, employeeName, salary);
        employees[size1++] = newEmployee;
    }


    public void removeEmployee(String employeeName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(employeeName)) {
                employees[i] = null;
                if (i != employees.length - 1) {
                    System.arraycopy(employees, i + 1, employees, i, size1 - i);
// Этот метод сдвигает массив влево на одну ячейку, затирая ячейку под номером i путем смещения всех элементов справа на одну ячейку влево
                }
                size1--;
                System.out.println("Сотрудник " + employeeName + " удален.");
                return;
            }
        }
        System.out.println("Сотрудник " + employeeName + " не найден.");
    }

    public void findEmployee(String employeeName) {
        for (int i = 0; i < size1; i++) {
            Employee employee = employees[i];
            if (employee.getName().equals(employeeName)) {
                System.out.println(employee.getDepartment() + " ; " + employee.getName() + ": " + employee.getSalary());
                return;
            }
        }
        System.out.println("Сотрудник " + employeeName + " не найден.");
    }


    public void printAllEmployees() {
        for (int i = 0; i < size1; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getDepartment() + " ; " + employee.getName() + ": " + employee.getSalary());

        }
    }


    public void minSalaryEmployee() {

        Employee minSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + minSalaryEmployee);
    }

    public void maxSalaryEmployee() {
        Employee maxSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employees[i];

            }

        }
        System.out.println("Сотрудник с максимальной зарплатой " + maxSalaryEmployee);
    }

    public void sumSalaryEmployee() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i] != null) {
                sum = sum + employee.getSalary();
            }
        }
        System.out.println(sum);
    }

    public void averageSumSalaryEmployee() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i] != null) {
                sum = sum + employee.getSalary();
            }
        }
        double result = sum / size1;
        System.out.println(result);
    }


    public int getCurrentSize1() {
        return size1;
    }

    @Override
    public String toString() {
        return "Список сотрудников{" +
                "employees=" + Arrays.toString(employees) +
                ", size=" + size1 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        List list = (List) o;
        return size1 == list.size1 && Arrays.equals(employees, list.employees);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size1);
        result = 31 * result + Arrays.hashCode(employees);
        return result;
    }
}

