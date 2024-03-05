package SOLID.task3;
//Переписать код в соответствии с Interface Segregation Principle:
//Подсказка: круг не объемная фигура и этому классу не нужен метод volume().

/**
 * Метод круга реализует интерфейс для расчета площади.
 */
public class Circle implements Area {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
//    @Override
//    public double volume() {
//        throw new UnsupportedOperationException();
//    }
}