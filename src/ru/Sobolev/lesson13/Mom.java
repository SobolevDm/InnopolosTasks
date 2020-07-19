package ru.Sobolev.lesson13;

public class Mom {
    static int action = -1;

    public static void main(String[] args) {

        for (; ; ) {
            InputMain.main();
            if (action == 0) {
                break;
            } else {
                for (Food f : Food.values()) {
                    if (f.ordinal() == action - 1) {
                        action--;
                        Child.main(action);
                    }
                }
            }
        }
    }

    public static int getAction() {
        return action;
    }
}
