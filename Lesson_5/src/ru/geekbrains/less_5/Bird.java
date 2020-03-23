package ru.geekbrains.less_5;

public class Bird extends Animal {
    Bird (String name, float maxJump, float maxRun, float maxSwim) {
        super("Bird", name, maxJump, maxRun, maxSwim);
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_WTF;
    }
}
