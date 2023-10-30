public class Task7_DestinationTiming {

    public static void main(String[] args) {
        int destination = 8;
        double taxisSpeed = 65.5;
        double homeOfficeTiming = destination / taxisSpeed;
        double speedSlowdown = 1.2;
        double officeHomeTiming = homeOfficeTiming * speedSlowdown;
        System.out.println("Растояние от дома до офиса: " + destination + " км.");
        System.out.println("Средняя скорость такси: " + taxisSpeed + " км./ч.");
        System.out.println("Время из дома до работы: " + homeOfficeTiming + " часов");
        System.out.println("Коэффициент замедления транспорта вечером: " + speedSlowdown);
        System.out.println("Время из офиса до дома: " + officeHomeTiming + " часов");

    }
}
