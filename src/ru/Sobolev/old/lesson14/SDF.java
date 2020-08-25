package ru.Sobolev.old.lesson14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SDF {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyy:MM:dd HH:mm:ss");

    public static String getSdf(String s) {
        return sdf.format(new Date()) + " " + s;
    }
}
