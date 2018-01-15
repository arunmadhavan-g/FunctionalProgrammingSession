package org.ford.fpsession.util;

import java.util.Calendar;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Timing {

    public static String timing(String desc, Supplier<String> employee){
        return timing(desc, employee, System.out::println);
    }

    public static String timing(String desc, Supplier<String> employee, Consumer<String> out){
        long startTime = Calendar.getInstance().getTimeInMillis();
        String result = employee.get();
        long timeTaken = (Calendar.getInstance().getTimeInMillis() - startTime);
        out.accept((String.format("%s took %d ms to complete", desc, timeTaken)));
        return result;
    }
}
