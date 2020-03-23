package ru.geekbrains.less_5;

public class Main {

    public static void main(String[] args) {

        Horse a = new Horse("Plotva", 3, 1500, 100);
        Bird b = new Bird("Kesha", 5, 0.2f, 0);
        Cat c = new Cat("Barsik", 2, 200, 0);
        Dog d = new Dog("Tuzik", 0.5f, 500, 10);


        Animal[] arr = {a, b, c, d};
        float toJump = 1.5f;
        float toRun = 350;
        float toSwim = 5;

        for (Animal animal : arr) {
            String nameString = animal.getType() + " " + animal.getName() + " can ";

            String eventName = String.format("jump max %.2fm. Tries to jump ", animal.getMaxJump());
            String eventResult = (animal.jump(toJump)) ? "succeed" : "fails";
            System.out.println(nameString + eventName + toJump + "m and " + eventResult);

            eventName = String.format("run max %.2fm. Tries to run ", animal.getMaxRun());
            eventResult = animal.run(toRun) ? "succeed" : "fails";
            System.out.println(nameString + eventName + toRun + "m and " + eventResult);

            int swimResult = animal.swim(toSwim);
            eventName = String.format("swim max %.2fm. Tries to swim ", animal.getMaxSwim());
            eventResult = (swimResult == Animal.SWIM_OK) ? "succeed" : "fails";
            if (swimResult == Animal.SWIM_WTF)
                eventResult = "too scared to enter the water";
            System.out.println(nameString + eventName + toSwim + "m and " + eventResult);
        }
    }
}
