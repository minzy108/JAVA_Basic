public class Switch {
    public static void main(String[] args) {
        /*
     A+ : 100
     A  : 90-99
     B  : 80-89
     C  : 70-79
     D  : 60-69
     F  : 0-59
     */

        // 시험점수
        int score = 60;

        // 성적
        String grade;

        switch (score / 10) {
            case 10:
                grade = "A+";
                break;  // switch 문 종료
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }
//        System.out.println(grade);

        switch (grade) {
            case "A+":
            case "A":
            case "B":
                System.out.println("참 잘했어요!");
                break;
            case "C":
            case "D":
                System.out.println("조금만 더 노력해 볼까요?");
                break;
            case "F":
                System.out.println("Fail입니다.");
                break;
            default:
                System.out.println("다시 수강해 주세요");
                break;
        }

        int i = 10;
        if (i % 3 == 0) { // i < 20 : 불린 식, 변수, 메소드
            System.out.println("C 구역입니다.");
        } else if (1 % 3 == 1) {
            System.out.println("A 구역입니다.");
        } else {
            System.out.println("B 구역입니다.");
        }

        switch (i % 3) { // i : 불린이 아닌 식, 변수, 메소드
            case 0:
                System.out.println("C 구역입니다.");
                break;
            case 1:
                System.out.println("A 구역입니다.");
                break;
            default:
                System.out.println("B 구역입니다.");
                break;
        } // 여러 개의 동등한 조건의 나열에는 if문 보다 switch문이 더 편리함

        // 실습

        int number = 134354;

        switch (number % 7) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
        }
    }
}