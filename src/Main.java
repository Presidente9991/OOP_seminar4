public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(0.2));
        appleBox.add(new Apple(0.3));
        appleBox.add(new Apple(0.25));

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(0.5));
        orangeBox.add(new Orange(0.75));
        orangeBox.add(new Orange(1));

        System.out.println("Общий вес коробки с яблоками: " + appleBox.getWeight());

        for (Apple apple : appleBox) {
            System.out.println("Вес яблок: " + apple.getWeight());
        }

        System.out.println("\nОбщий вес коробки с апельсинами: " + orangeBox.getWeight());

        for (Orange orange : orangeBox) {
            System.out.println("Вес апельсинов: " + orangeBox.getWeight());
        }
            // appleBox.move(orangeBox); Попытка вызвать метод пересыпания - не компилируется
            // orangeBox.move(appleBox); Попытка вызвать метод пересыпания - не компилируется
    }
}