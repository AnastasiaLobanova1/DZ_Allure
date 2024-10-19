package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class DataGenerator {


    private static Faker faker = new Faker(new Locale("ru"));
    private static final List<String> cities = Arrays.asList("Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург", "Нижний Новгород", "Тюмень");

    public static String generateCity() {
        return cities.get(faker.random().nextInt(cities.size()));
    }

    private static final List<String> otherCity = Arrays.asList("Нью-Йорк", "Париж", "Милан", "Мадрид", "Ереван", "Мюнхен");

    public static String generateOtherCity() {
        return otherCity.get(faker.random().nextInt(otherCity.size()));
    }

    private static final List<String> otherName = Arrays.asList("Иван@!123", "Ivan", ".i.v.a.n.", "*ivan*", "<Иван>", "!иван)");

    public static String generateOtherName() {
        return otherName.get(faker.random().nextInt(otherName.size()));
    }
    private static final List<String> otherPhone = Arrays.asList("+79001001", "+9121229992", "+1");

    public static String generateOtherPhone() {
        return otherPhone.get(faker.random().nextInt(otherPhone.size()));
    }
        public static String generateName () {
            return faker.name().fullName();
        }

        public static String generatePhone () {
            return faker.phoneNumber().phoneNumber();
        }

        public static String generateDate ( long addDays, String pattern){
            return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));
        }
    }
