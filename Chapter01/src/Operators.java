public class Operators {
    public static void main(String[] args) {
        String myString = "Hello" + "Codeit!!";
        System.out.println(myString);

        System.out.println("숫자 연산자");
        int a = 9;
        int b = 5;
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));

        System.out.println();
        // 자바에서 정수형과 정수형의 연산 결과는 무조건 정수형으로 나온다.
        // 피연산자 중 하나라도 소수형이 있으면 결과는 소수형으로 나옴

        int c = 9;
        double d = 5;
        System.out.println(c + " + " + d + " = " + (c + d));
        System.out.println(c + " - " + d + " = " + (c - d));
        System.out.println(c + " * " + d + " = " + (c * d));
        System.out.println(c + " / " + d + " = " + (c / d));
        System.out.println(c + " % " + d + " = " + (c % d));

        System.out.println("비교 연산자");
        System.out.println(3 + " > " + 2 + " : " + (3 > 2));
        System.out.println(3 + " < " + 2 + " : " + (3 < 2));
        System.out.println(3 + " >= " + 2 + " : " + (3 >= 2));
        System.out.println(3 + " <= " + 2 + " : " + (3 <= 2));
        System.out.println(3 + " == " + 2 + " : " + (3 == 2));
        System.out.println(3 + " != " + 2 + " : " + (3 != 2));
        System.out.println();


        System.out.println("불린 연산자 - and");
        System.out.println("true && true : " + (true && true));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && true : " + (false && true));
        System.out.println("false && false : " + (false && false));
        System.out.println();

        System.out.println("불린 연산자 - or");
        System.out.println("true || true : " + (true || true));
        System.out.println("true || false : " + (true || false));
        System.out.println("false || true : " + (false || true));
        System.out.println("false || false : " + (false || false));
        System.out.println();

        System.out.println("불린 연산자 - not");
        System.out.println("!true : " + !true);
        System.out.println("!false : " + !false);
    }
}

// Escape Sequence
/*
 *   \t  : 탭
 *   \b  : 백스페이스
 *   \n  : 줄 바꿈(new line)
 *   \r  : 줄 바꿈(carriage return)
 *   \f  : 폼 피드(form feed)
 *   '   : 작은 따옴표
 *   "   : 큰 따옴표
 *   \   : 역슬래쉬
 * */