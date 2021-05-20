public class IfElse {
    public static void main(String[] args) {
        int temp = 30;

        if (temp <= 5) {
            System.out.println("내복과 긴팔과 자켓을 입으세요");
        } else if (temp <= 10) {
            System.out.println("긴팔과 자켓을 입으세요");
        } else if (temp <= 15) {
            System.out.println("긴팔을 입으세요");
        } else {
            System.out.println("반팔을 입으세요");
        }

        int number = 13;
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        int x = 10;
        int y = 1;

        if (x != 10 || x % 2 != 0) {
            System.out.println(x);
        } else if (y == 1) {
            System.out.println(y);
        } else {
            System.out.println(x + y);
        }

        // 실습


        int a = 38, b = 27;

        // 여기에 코드를 작성하세요.
        if (a == b) {
            System.out.println("a와 b가 같습니다. a = b = " + a);
        } else {
            System.out.println("a와 b는 같지 않습니다");
            if (a > b) {
                System.out.println("a가 b보다 " + (a - b) + "만큼 더 큽니다.");
            } else {
                System.out.println("b가 a보다 " + (b - a) + "만큼 더 큽니다.");
            }
        }
    }
}

