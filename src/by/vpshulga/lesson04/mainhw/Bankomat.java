package by.vpshulga.lesson04.mainhw;

public class Bankomat {
    private int countOf20;
    private int countOf50;
    private int countOf100;

    public Bankomat(int countOf20, int countOf50, int countOf100) {
        this.countOf20 = countOf20;
        this.countOf50 = countOf50;
        this.countOf100 = countOf100;
    }

    void add20(int count) {
        countOf20 += count;
    }

    void add50(int count) {
        countOf50 += count;
    }

    void add100(int count) {
        countOf100 += count;
    }

    private boolean isSuccessfulOperation(int totalMoney) {
        return totalMoney != 30 && totalMoney % 10 == 0 && totalMoney >= 20 && totalMoney <= (countOf100 * 100 + countOf50 * 50 + countOf20 * 20);

    }

    void takeMoney(int totalMoney) {


        if (isSuccessfulOperation(totalMoney)) {
            int countOfTaken100;
            if ((totalMoney % 100 == 10 || totalMoney % 100 == 30) && totalMoney / 100 > 0) {
                countOfTaken100 = totalMoney / 100 - 1;
            } else {
                countOfTaken100 = totalMoney / 100;
            }

            if (countOfTaken100 >= countOf100) {
                countOfTaken100 = countOf100;
            }
            int countOfTaken50;
            if (((totalMoney - countOfTaken100 * 100) % 50 == 10 || (totalMoney - countOfTaken100 * 100) % 50 == 30)
                    && (totalMoney - countOfTaken100 * 100) / 50 > 0) {
                countOfTaken50 = ((totalMoney - countOfTaken100 * 100) / 50 - 1);
            } else {
                countOfTaken50 = ((totalMoney - countOfTaken100 * 100) / 50);
            }
            if (countOfTaken50 >= countOf50) {
                countOfTaken50 = countOf50;
            }
            int countOfTaken20 = 0;
            if ((totalMoney - countOfTaken100 * 100 - countOfTaken50 * 50) % 20 != 0) {
                countOfTaken20 = (totalMoney - countOfTaken100 * 100 - ((countOfTaken50 - 1) * 50)) / 20;
                if (countOfTaken50 > 0) {
                    countOfTaken50 -= 1;
                }
            } else if ((totalMoney - countOfTaken100 * 100 - countOfTaken50 * 50) / 20 <= countOf20) {
                countOfTaken20 = (totalMoney - countOfTaken100 * 100 - (countOfTaken50 * 50)) / 20;
            }

            if (countOfTaken100 * 100 + countOfTaken50 * 50 + countOfTaken20 * 20 == totalMoney) {
                System.out.println("100: " + countOfTaken100);
                System.out.println("50: " + countOfTaken50);
                System.out.println("20: " + countOfTaken20);
                countOf100 -= countOfTaken100;
                countOf50 -= countOfTaken50;
                countOf20 -= countOfTaken20;
            } else {
                System.out.println("Недостаточно нужных купюр");
            }

        } else if (totalMoney > (countOf100 * 100 + countOf50 * 50 + countOf20 * 20)) {
            System.out.println("Недостаточно денег");
        } else {
            System.out.println("Вы ввели некорректную сумму");
        }
    }
}
