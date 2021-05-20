public class Variables {
    public static void main(String[] args) {
        int age;
        age = 27;

        int num = 21;
        age = 26;

        //   age = 22.6; int 형 변수에 소수를 넣어서 오류 발생

        age = num;  // 변수에 다른 변수 값 대 가능
        age = age + 1;  // 변수에 연산하여 저장 가능

        System.out.print("Hello, I'm ");
        System.out.print(age);
        System.out.println(".");


        boolean myBollean = true;
        myBollean = false;

        int MyInt = 123;

//        myInt = 12345678910;
        long myLong = 1234567890L;

        double myDouble = 3.14;

        String myString = "codeit!!";
        // String : 객체/클래스

        System.out.println("hello!");

        String hello = "Hello, I'm ";
        String dot = ".";

        System.out.print(hello);
        System.out.print(27);
        System.out.println(dot);

        // 실습 자기소개

        String name;
        int year;
        int month;
        int day;
        boolean married;


        // 값 대입
        name = "코드잇";
        year = 2015;
        month = 7;
        day = 20;
        married = false;

        // 자기 소개
        System.out.println("이름: " + name);
        System.out.println("생일: " + year + "년 " + month + "월 " + day + "일");
        System.out.println("결혼: " + married);
    }
}

/*
 *   변수 선언
 * type variableName;
 * 자료형 변수이름
 *
 * int a;
 * String s;
 *
 * - 대소문자 구분
 * - 숫자로 시작할 수 없음
 * - 밑줄(_)과 달러표시($) 외에 특수문자 사용 불가능, 밑줄과 달러표시도 사용하지 않는 것이 좋음
 *   $는 주로 자동 생성되는 변수명으로 쓰임, _는 보통 상수 이름에 쓰임
 * - 자바의 예약어는 변수명으로 사용 불가
 * 주로 카멜케이스(camelCase) 기법으로 작성하는게 좋다.(myName, someRidiculouslyLongName)
 * */