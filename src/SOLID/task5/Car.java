package SOLID.task5;
//Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.

/**
 * Класс автомобиля.
 * Сейчас класс связан с абстракцией, т.е не важно, какой двигатель будет передаваться при
 * создании экземпляра класса.
 */
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}

