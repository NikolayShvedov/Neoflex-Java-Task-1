package ru.neoflex.training.shvedov.init.syntax.solution.ch03n002;

public class SolutionCh03n002 {

    /**
     * Записать условие, которое является истинным, когда каждое из чисел X и Y нечетное;
     * @param x - целое число
     * @param y - целое число
     */
    public static void checkingTheConditionForTruePointA(int x, int y) {
        boolean result;
        result = (x % 2 == 1) && (y % 2 == 1);
        System.out.println("Каждое из чисел X и Y нечетное: " + result);
    }

    /**
     * Записать условие, которое является истинным, когда только одно из чисел X и Y меньше 20;
     * @param x - целое число
     * @param y - целое число
     */
    public static void checkingTheConditionForTruePointB(int x, int y) {
        boolean result;
        result = (x <= 20) || (y <= 20);
        System.out.println("Только одно из чисел X и Y меньше 20: " + result);
    }

    /**
     * Записать условие, которое является истинным, когда хотя бы одно из чисел X и Y равно нулю;
     * @param x - целое число
     * @param y - целое число
     */
    public static void checkingTheConditionForTruePointC(int x, int y) {
        boolean result;
        result = (x == 0) || (y == 0);
        System.out.println("Хотя бы одно из чисел X и Y равно нулю: " + result);
    }

    /**
     * Записать условие, которое является истинным, когда каждое из чисел X, Y, Z отрицательное;
     * @param x - целое число
     * @param y - целое число
     * @param z - целое число
     */
    public static void checkingTheConditionForTruePointD(int x, int y, int z) {
        boolean result;
        result = (x < 0) && (y < 0) && (z < 0);
        System.out.println("Каждое из чисел X, Y, Z отрицательное: " + result);
    }

    /**
     * Записать условие, которое является истинным, когда только одно из чисел X, Y и Z кратно пяти;
     * @param x - целое число
     * @param y - целое число
     * @param z - целое число
     */
    public static void checkingTheConditionForTruePointE(int x, int y, int z) {
        boolean result;
        result = (x % 5 == 0) && (y % 5 != 0) && (z % 5 != 0) || (x % 5 != 0) && (y % 5 == 0) && (z % 5 != 0) || (x % 5 != 0) && (y % 5 != 0) && (z % 5 == 0);
        System.out.println("Только одно из чисел X, Y и Z кратно пяти: " + result);
    }

    /**
     * Записать условие, которое является истинным, когда хотя бы одно из чисел X, Y, Z больше 100.
     * @param x - целое число
     * @param y - целое число
     * @param z - целое число
     */
    public static void checkingTheConditionForTruePointF(int x, int y, int z) {
        boolean result;
        result = (x > 100) || (y > 100) || (z > 100);
        System.out.println("Хотя бы одно из чисел X, Y, Z больше 100: " + result);
    }
}
