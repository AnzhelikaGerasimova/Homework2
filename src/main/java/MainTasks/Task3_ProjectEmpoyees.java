package MainTasks;

public class Task3_ProjectEmpoyees {
    public static void main(String[] args) {
        int programmers = 38;
        int testers = 2;
        int support = 3;
        int testersNeeded = programmers * testers;
        int supportNeeded = programmers * support;
        int totalEmployees = programmers + testersNeeded + supportNeeded;
        System.out.println("Общее количество программистов в компании: " + programmers);
        System.out.println("Количество тестировщиков на одного программиста: " + testers);
        System.out.println("Количество сотрудников поддержки на одного программиста: " + support);
        System.out.println("Необходимое количество тестировщиков на проекте: " + testersNeeded);
        System.out.println("Необходимое количество сотрудников поддержки на проекте: " + supportNeeded);
        System.out.println("Общее количество сотрудников: " + totalEmployees);
    }
}
