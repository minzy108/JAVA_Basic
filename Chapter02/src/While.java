public class While {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 3) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);

        int sumo = 0, io = 1;

        while (sumo < 10000) {
            sumo += io;
            io++;
        }

        System.out.println(sumo);
        System.out.println(io - 1);

        // 실습
//        10000 미만의 정수 중에서, 153의 배수중 가장 큰 값을 찾아 출력하세요.

        int num = 10000;
        int key = 153;

        while (num % key > 0) {
            num--;
        }
        System.out.println(num);
    }
}
