package day06_operators.tasks;

public class GiftCard {
    public static void main(String[] args) {
        int giftCard = 500;
        int usedTimes = 3;

        System.out.printf("$500 Gift Card usage (3 times limit): \n" +
                "\t-$%d, balance $%d, times left %d\n", 150, giftCard-=150, --usedTimes);
        System.out.printf("\t-$%d, balance $%d, times left %d", 99, giftCard-=99, --usedTimes);
    }

}
