public class Task8_ShirtSale {
    public static void main(String[] args) {
        int shirtPrice = 1500;
        int shirtSelected = 3;
        int discountQuantity = 5;
        int quantityNeeded = discountQuantity - shirtSelected;
        int totalPrice = shirtPrice * shirtSelected;
        int neededShirtPrice = shirtPrice * quantityNeeded;
        double discountPercentage = 20;
        double priceWithDiscount = discountQuantity * shirtPrice - (discountQuantity * ((shirtPrice / 100) * discountPercentage));
        double singleDiscount = priceWithDiscount / discountQuantity;
        double savedAmount = (discountQuantity * shirtPrice) - priceWithDiscount;
        double freeFee = savedAmount / shirtPrice;

        System.out.println("Цена за одну рубашку: " + shirtPrice + " руб.");
        System.out.println("Количество выбранных рубашек: " + shirtSelected + " шт.");
        System.out.println("Количество рубашек для скидки: " + discountQuantity + " шт.");
        System.out.println("Количество рубашек, которых не хватает для скидки: " + quantityNeeded + " шт.");
        System.out.println("Цена выбранных рубашек без скидки: " + totalPrice + " руб.");
        System.out.println("Цена рубашек к покупке, чтобы получить скидку: " + neededShirtPrice + " руб.");
        System.out.println("Скидка на товар: " + discountPercentage + "%");
        System.out.println("Цена рубашек со скидкой: " + priceWithDiscount + " руб.");
        System.out.println("Цена одной рубашки при скидке: " + singleDiscount + " руб.");
        System.out.println("Сэкономленные деньги при покупке со скидкой: " + savedAmount + " руб.");
        System.out.println("Количество рубашек на халяву: " + freeFee + " шт.");
    }
}
