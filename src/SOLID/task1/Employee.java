package SOLID.task1;

import java.util.Date;

// Переписать код в соответствии с Single Responsibility Principle:
// Подсказка: вынесите метод calculateNetSalary() в отдельный класс

/**
 * Класс, представляющий собой структуру для создания экземпляра работника.
 */
public class Employee {
    private String name;
    private int id; // добавил ID работнику для идентификации
    private static Integer idGenerator;
    private Date dob;
    private int baseSalary;

    /**
     * Конструктор класса.
     *
     * @param name       имя работника
     * @param dob        дата рождения работника
     * @param baseSalary базовая зарплата работника
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
        idGenerator++;
        this.id = idGenerator;
    }

    /**
     * Метод получения информации о работнике.
     *
     * @return информацию о работнике: имя и дата рождения.
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    /**
     * Метод получения информации о базовой зарплате работника.
     * @return базовую зарплату работника.
     */
    public int getBaseSalary() {
        return baseSalary;
    }

    /**
     * Метод получения информации о id работника.
     *
     * @return идентификационный номер работника.
     */
    public int getId() {
        return id;
    }
}
