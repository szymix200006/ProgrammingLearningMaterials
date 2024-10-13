package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;

public class MyJson {

    public static String converterStarter(Object object) throws IllegalAccessException {
        StringBuilder sb = new StringBuilder();
        convertObjectToJson(sb, object, 1);
        return sb.toString();
    }
    public static void sendJsonToClient(String myJson) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("object.json"));
        writer.write(myJson);
        writer.close();
    }

    public static void convertObjectToJson(StringBuilder sb, Object object, int tabCount) throws IllegalAccessException {
        sb.append("{\n");
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            field.setAccessible(true);
            Object value = field.get(object);
            sb.append("\t".repeat(tabCount)).append("\"").append(fieldName).append("\": ");
            if (value instanceof Number) {
                sb.append(value);
            } else if(value instanceof String){
                sb.append("\"").append(value).append("\"");
            } else {
                convertObjectToJson(sb, value, tabCount + 1);
            }
            if(Arrays.asList(fields).indexOf(field) < fields.length - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("\t".repeat(tabCount - 1)).append("}");
    }
}
