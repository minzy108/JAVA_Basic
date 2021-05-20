public class TypeConversionCasting {
    public static void main(String[] args) {
//        double x = 3.14;
//        int y = x;      // int 보다 double 자료형의 공간이 작아서 변수저장 불가능
        double x = 3.14;
        int y = (int) x;    // type casting (형변환)

        System.out.println(y);

        int a = 9;
        int b = 5;
        System.out.println((double) a / b);


        // 실습

        int koreanScore = 86;
        int mathScore = 94;
        int scienceScore = 87;
        int computerScore = 100;

        double average = (double) (koreanScore + mathScore + scienceScore + computerScore)
                / 4;

        System.out.println(average);
    }
}

// 랭크
/*
 * byte  :   1 byte	-128 ... 127
 * short :	2 byte	-32,768 ... 32,767
 * int	:   4 byte	-2,147,483,648 ... 2,147,483,647
 * long  :	8 byte	-9,223,372,036,854,775,808 ... 9,223,372,036,854,775,807
 * float	:   4 byte	1.4023985 x 10^-45 ... 3.4028235 x 10^38
 * double:	8 byte	4.940656458412465 x 10^-324 ... 1.797693134862316 x 10^308
 * */
