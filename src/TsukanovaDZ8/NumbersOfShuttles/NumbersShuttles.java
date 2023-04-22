package TsukanovaDZ8.NumbersOfShuttles;

public class NumbersShuttles {
    public static void main(String[] args) {
        int sumShuttles = 0;
        while (true) {
            sumShuttles++;
            if (sumShuttles <= 101) {
                for (int i = 1; i <= 200; i++) {
                    if (i == 4 || i == 9) {
                        continue;
                    } else if (i / 10 == 4 || i / 10 == 9) {
                        continue;
                    } else if (i / 10 == 14) {
                        continue;
                    } else if (i % 10 == 4 || i % 10 == 9) {
                        continue;
                    }
                    if (sumShuttles < 100) {
                        sumShuttles++;
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("Прономеровано 100 шатлів, без 4 && 9");
                break;
            }
        }
    }
}
