package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        String firstName = " Ivan ";
        String middleName = " Ivanov ";
        String lastName = " Ivanovich ";
        String fullName = (middleName + firstName + lastName);
        System.out.println("ФИО сотрудника " + fullName);
    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String expectedFullNaame = "IVANOV IVAN IVANOVICH";
        if (fullName.equals(expectedFullNaame)) {
            System.out.println("Данные ФИО сотрудника для заполнения отчета " + fullName);
        } else {
            System.out.println("Данные ФИО сотрудника для заполнения отчета " + expectedFullNaame);
        }
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника " + fullName);
    }
}
