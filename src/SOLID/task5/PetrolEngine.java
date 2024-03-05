package SOLID.task5;

/**
 * Класс бензинового двигателя.
 */
public class PetrolEngine implements Engine {
    /**
     * Метод запуска бензинового двигателя.
     */
    @Override
    public void start() {
        System.out.println("Petro engine starts");
    }
}
