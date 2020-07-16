package ru.Sobolev.lesson09.Task03;

public class Main extends Men {

    public static void main(String[] args) {
        Elderly elderly = new Elderly();
        Baby baby = new Baby();
        System.out.println(elderly.runFast());
        System.out.println(elderly.runSlow());
        System.out.println(elderly.swim());
        System.out.println(baby.runFast());
        System.out.println(baby.runSlow());
        System.out.println(baby.swim());
    }

    public static class Elderly extends Men {
        @Override
        public String runFast() {
            return "Пожилой человек хочет, но не может бегать.";
        }

        @Override
        public String runSlow() {
            return "Пожилой человек ходит медленно.";
        }

        @Override
        public String swim() {
            return "Пожилой человек умеет плавать.";
        }
    }

    public static class Baby extends Men {

        @Override
        public String runFast() {
            return "Ребенок не умеет бегать!";
        }

        @Override
        public String runSlow() {
            return "Ребенок медленно ходит.";
        }

        @Override
        public String swim() {
            return "Ребенок хочет, но не умеет плавать.";
        }
    }
}
