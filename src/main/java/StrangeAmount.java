public class StrangeAmount {
    public static void main(String[] args) {
        int sumOfEven = 0;
        int theSumOfOdd = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEven = sumOfEven + i;
            }
        }
        System.out.println("Сумма всех четных чисел от 1 до 100 равна: " + sumOfEven);

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                theSumOfOdd = theSumOfOdd + i;
            }
        }
        System.out.println("Сумма всех не четных чисел от 1 до 100 равна: " + theSumOfOdd);


        System.out.println("Для чисел от 1 до 100 посчитать сколько получится, " +
                "если писать 1 - 2 + 3 - 4 и так далее." +
                " Будет равна: -" + (sumOfEven - theSumOfOdd));

    }
}


