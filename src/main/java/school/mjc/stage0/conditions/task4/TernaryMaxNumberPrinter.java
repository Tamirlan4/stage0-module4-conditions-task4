package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max = 0;
        max = first > second && first > third ?
                first:
                max;
        max = second > first && second > third ?
                second:
                max;
        max = third > first && third > second ?
                third:
                max;
        max = max == 0?first:max;
        System.out.println(max);
    }
}
