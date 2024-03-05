package SOLID.task4;
//Переписать код в соответствии с Liskov Substitution Principle:

/**
 * Класс прямоугольника со свойствами в виде длины и ширины сторон.
 */
public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Метод расчета площади прямоугольника.
     *
     * @return площадь прямоугольника.
     */
    public int area() {
        return this.width * this.height;
    }
}

