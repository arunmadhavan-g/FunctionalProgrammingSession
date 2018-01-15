package org.ford.fpsession.io;

import java.util.List;

public class Outputter {
    public static  void printToConsole(List<String> values) {
        values.forEach(System.out::println);
    }
}
