package TsukanovaDZ8.NumbersOfShuttles;

public class NumbersShuttles {
    public static void main(String[] args) {
        int sumShuttles = 0;
        while (true) {
            if (sumShuttles <= 99) {
                for (int i = 1; i <= 200; i++) {
                    if (i == 4 || i == 9) {
                        continue;
                    } else if (i / 10 == 4 || i / 10 == 9) {
                        continue;
                    } else if (i / 10 == 14) {
                        continue;
                    } else if (i % 10 == 4 || i % 10 == 9) {
                        continue;
                    }sumShuttles++;
                    System.out.println(i);
                    if (sumShuttles > 99) {
                        System.out.println("Прономеровано 100 шатлів, без 4 && 9");
                        break;
                    }
                }
            }
        }
    }
}

