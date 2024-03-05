package SOLID.task4;

/**
 * Класс квадрата с переопределенным конструктором. Поскольку стороны квадраты равны, можно на вход передавать
 * только 1 параметр ширины или длины.
 */
public class Square extends Rectangle {
    /**
     * Переопределенный конструктор класса Квадрат.
     *
     * @param width сторона квадрата.
     */
    public Square(int width) {
        super(width, width);
    }
}
