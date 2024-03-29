package SOLID.task3;

/**
 * Метод куба реализует интерфейсы для расчета площади и объема.
 */
public class Cube implements Area, Volume {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
