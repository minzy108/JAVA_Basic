public class For {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);

        int sumo = 0;
        for (int i = 1; i <= 100; i++) {
            sumo += i;
        }
        System.out.println(sumo);

        // 실습 구구단
        int i = 1;
        int j = 1;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 9; j++)
                System.out.println(i + "*" + j + "=" + i * j);
        }
    }
}
