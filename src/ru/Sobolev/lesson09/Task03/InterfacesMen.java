package ru.Sobolev.lesson09.Task03;

public class InterfacesMen {

    public interface Run {
        public static String runFast() {
            return "бегать";
        }

        public static String runSlow() {
            return "ходить";
        }
    }

    public interface Swim {
        public static String swim() {
            return "плавать";
        }
    }

}
