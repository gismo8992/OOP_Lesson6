package SOLID.task2;

/**
 * Класс абстрактного транспортного средства. Добавлен ограничивающий коэф. скорости в виде свойства.
 */
public abstract class Vehicle {
    private int maxSpeed;
    private String type;
    private double speedIndex; // ограничивающий коэффициент скорости

    public Vehicle(int maxSpeed, String type, double speedIndex) {
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.speedIndex = speedIndex;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double getSpeedIndex() {
        return this.speedIndex;
    }

    public String getType() {
        return this.type;
    }

    /**
     * Метод расчета допустимой скорости с учетом ограничивающего коэффициента скорости.
     *
     * @return разрешимая скорость.
     */
    public double calculateAllowedSpeed() {
        return this.maxSpeed * this.speedIndex;
    }
}
