package SOLID.task1;

import java.util.List;

/**
 * Класс калькулятора зарплаты. На вход при создании экземпляра передается список сотрудников и размер налога.
 */
public class SalaryCalculator {
    private List<Employee> employeeList;
    private int tax;

    public SalaryCalculator(List<Employee> employeeList, int tax) {
        this.employeeList = employeeList;
        this.tax = tax;
    }

    /**
     * Метод расчета заработной платы работника с учетом налога.
     *
     * @param employeeId id работника
     * @return заработная плата с учетом удержанного налога
     */
    public int calculateNetSalary(int employeeId) {
        int tax = (int) (employeeList.get(employeeId).getBaseSalary() * 0.25); //calculate in otherway
        return employeeList.get(employeeId).getBaseSalary() - tax;
    }

    /**
     * Метод получения информации о налоге.
     *
     * @return размер налога.
     */
    public int getTax() {
        return tax;
    }

    /**
     * Метод для изменения налоговой ставки.
     *
     * @param tax размер налога.
     */
    public void setTax(int tax) {
        this.tax = tax;
    }
}
