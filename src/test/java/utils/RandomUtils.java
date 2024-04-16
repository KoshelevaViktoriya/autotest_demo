package utils;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;




public class RandomUtils {

    public static void main(String[] args) {
        System.out.println(getRandomString(10));
        System.out.println(getRandomInt(10, 100));
        System.out.println(getRandomEmail());
        System.out.println();
        String address = generateRandomAddress();
        System.out.println("Случайный адрес: " + address);
    }

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomString(int length) {
        //String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();

    }

    public static String getRandomEmail() {
        return getRandomString(10) + ("@mail.com");
    }

    public static String generateRandomPhoneNumber() {
        String countryCode = "+7";

        StringBuilder phoneNumber = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            phoneNumber.append(random.nextInt(10));
        }
        return countryCode + phoneNumber;
    }





        public static String generateRandomAddress() {
              String[] streets = {"Oak Street", "Maple Avenue", "Main Street", "Cedar Lane", "Elm Street"};
              String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
            // Выбираем случайное название улицы и города из массивов
            String street = streets[ThreadLocalRandom.current().nextInt(streets.length)];
            String city = cities[ThreadLocalRandom.current().nextInt(cities.length)];

            // Генерируем случайный номер дома (от 1 до 100)
            int houseNumber = ThreadLocalRandom.current().nextInt(1, 101);

            // Генерируем случайный почтовый индекс (от 10000 до 99999)
            int postalCode = ThreadLocalRandom.current().nextInt(10000, 100000);

            // Формируем адрес
            String address = houseNumber + " " + street + ", " + city + ", " + postalCode;
            return address;
        }
    }


