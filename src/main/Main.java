package main;

import model.Student;
import java.time.LocalDate;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Student[] StdArr = createArray();
        printArray(StdArr);

        Scanner scanner = new Scanner(System.in);
        taskA(StdArr, scanner);
        taskB(StdArr, scanner);
        taskC(StdArr, scanner);
        scanner.close();
    }

    public static Student[] createArray() {
        Student[] StdArr = new Student[3];

        StdArr[0] = new Student(
                872648,
                "Палладін",
                "Петро",
                "Сергійович",
                LocalDate.of(2006, 5, 10),
                "м. Львів, вул. Коновальця 34В, кв. 17",
                677582639,
                "Хімії та хімічних технологій",
                1,
                "ХЗ-12");

        StdArr[1] = new Student(0,"0","0","0",LocalDate.of(1,1,1),"0",0,"0",0,"0");
        StdArr[1].setStudent_id(432987);
        StdArr[1].setSurname("Кац");
        StdArr[1].setName("Румбельт");
        StdArr[1].setFather_name("Зигмундович");
        StdArr[1].setDate_of_birth(LocalDate.of(1995, 8, 14));
        StdArr[1].setAddress("м. Умань, вул. Спінози 12, кв 3");
        StdArr[1].setTelephone_number(672348656);
        StdArr[1].setFaculty("Економіки і менеджменту");
        StdArr[1].setCourse(6);
        StdArr[1].setGroup("ФФ-61");

        StdArr[2] = new Student(0,"0","0","0",LocalDate.of(1,1,1),"0",0,"0",0,"0");
        StdArr[2].setStudent_id(986111);
        StdArr[2].setSurname("Дарк");
        StdArr[2].setName("Ван");
        StdArr[2].setFather_name("Ю-Фак");
        StdArr[2].setDate_of_birth(LocalDate.of(2010, 11, 29));
        StdArr[2].setAddress("м. Ханой, вул. Слейва-Мегготса 300, кв 13");
        StdArr[2].setTelephone_number(670143259);
        StdArr[2].setFaculty("Гуманітарних та соціальних наук");
        StdArr[2].setCourse(3);
        StdArr[2].setGroup("ФІС-33");

        return StdArr;
    }

    public static void printArray(Student[] arr) {
        for (int i = 0; i != arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public static void taskA(Student[] arr, Scanner scanner) {
        System.out.println("\nTask a)\nВведіть назву факультету:");
        String faculty = scanner.nextLine();

        boolean inArr = false;

        for (int i = 0; i != arr.length; i++) {
            if (arr[i].getFaculty().equals(faculty)) {
                System.out.println(arr[i].toString());
                inArr = true;
            }
        }
        if (!inArr) {
            System.out.println("Студентів з цього факультету в списку не має.");
        }
    }

    public static void taskB(Student[] arr, Scanner scanner) {
        System.out.println("\nTask b)\nВведіть рік:");
        int year = Integer.parseInt(scanner.nextLine());

        boolean inArr = false;

        for (int i = 0; i != arr.length; i++) {
            int bYear = arr[i].getDate_of_birth().getYear();
            if (bYear > year) {
                System.out.println(arr[i].toString());
                inArr = true;
            }
        }
        if (!inArr) {
            System.out.println("Студентів, які народились після заданого року в списку не має.");
        }
    }

    public static void taskC(Student[] arr, Scanner scanner) {
        System.out.println("\nTask c)\nВведіть назву групи:");
        String group = scanner.nextLine();

        boolean inArr = false;

        for (int i = 0; i != arr.length; i++) {
            if (arr[i].getGroup().equals(group)) {
                System.out.println(arr[i].toString());
                inArr = true;
            }
        }
        if (!inArr) {
            System.out.println("Студентів з заданої групи в списку не має.");
        }
    }
}
