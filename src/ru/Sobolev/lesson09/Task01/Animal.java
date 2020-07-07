package ru.Sobolev.lesson09.Task01;

abstract class Animal {

    {
        System.out.print("\nЭто животное называется - ");
    }

    abstract void Name();
}

class AnimalsTitle {
    private Animal animal1;

    public static void main(String[] args) {
        Animal animal1 = new Duck();
        animal1.Name();

        Animal animal2 = new Falcon();
        animal2.Name();

        Animal animal3 = new Hare();
        animal3.Name();

        Animal animal4 = new Squirrel();
        animal4.Name();
    }

}




