public class Task4_GlassHalfFull {
    public static void main(String[] args) {
        int glassVolume = 300;
        double fullnessPercentage = 45.5;
        double glassFulness = (glassVolume / 100) * fullnessPercentage;
        System.out.println("Объем стакана в миллилитрах: " + glassVolume + "мл.");
        System.out.println("Заполненность стакана в процентах: " + fullnessPercentage + "%");
        System.out.println("Жидкость в стакане в миллилитрах: " + glassFulness + "мл.");
    }
}
