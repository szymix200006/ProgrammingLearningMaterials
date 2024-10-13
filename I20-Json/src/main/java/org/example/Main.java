package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        //test(); -> StackOverflowError
         //List list = new ArrayList<>();
        //while(true) list.add(new Object()); OutOfMemoryException
        //User user = loadUserFromDB(123);
        //String userJson = convertUserToJson(user);
        //sendJsonToClient(userJson);
        Object object = loadCarFromDB(123);
        String userJson = MyJson.converterStarter(object);
        MyJson.sendJsonToClient(userJson);
    }

    /*private static void sendJsonToClient(String userJson) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("user.json"));
        writer.write(userJson);
        writer.close();
    }

    private static String convertUserToJson(User user) throws IllegalAccessException {
        String json = "{\n";
        Field[] fields = user.getClass().getDeclaredFields();

        for(Field field : fields) {
            json += ("\t\"" + field.getName() + "\": " + "\"" + field.get(user).toString() + "\",\n");
        }

        json += "}";

        return json;
                /*"{\n" +
                "\t\"id\": \"" + user.id() + "\", \n" +
                "\t\"firstName\": \"" + user.firstName() + "\", \n" +
                "\t\"lastName\": \"" + user.lastName() + "\" \n" +
                "}";*/
    //}

    private static User loadUserFromDB(int id) {
        return new User(id, "Marek", "Kowalski");
    }
    private static Car loadCarFromDB(int id) {
        return new Car(10, "Red", new Engine(2.0, new Fuel("diesel")));
    }

    private static void test() {
       test();
    }
}