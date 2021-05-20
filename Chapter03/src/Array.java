public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[5];    // 크기 5의 정수형을 담는 빈 배
//        == int[] intArray = {1, 2, 3, 4, 5};

        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;

        System.out.println(intArray[2] + intArray[4]);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Aliasing
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1;  // arr1 과 arr2가 같은 주소를 가리킨다.

        // 새롭게 복사
        int[] arr3 = arr1.clone();

        // arr1과 arr3은 서로 다른 배열, 서로 영향을 미치지 않음


        // 예제 1
        // 100개 짜리 배열을 만들고 1, 2, ... 100으로 채운다.
        int[] exArray1 = new int[100];
        for (int i = 0; i < exArray1.length; i++) {
            exArray1[i] = i + 1;
        }
        for (int i = 0; i < exArray1.length; i++) {
            System.out.println(exArray1[i]);
        }

        // 예제 2
        // for-each 문을 활용하여 출력
        String[] fruitArray = new String[5];

        fruitArray[0] = "딸기";
        fruitArray[1] = "당근";
        fruitArray[2] = "수박";
        fruitArray[3] = "참외";
        fruitArray[4] = "메론";

        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }


        // 실습
        /*
        * (1) 크기가 30인 정수형 배열 intArray를 만들어 주세요.

(2) 배열의 첫 번째(0번 인덱스) 칸부터 1001, 1002, 1003, ..., 1029, 1030을 순서대로 넣어주세요.

(3) 크기가 4인 문자열형 배열 remainders를 만들어 "Zero", "One", "Two", "Three"를 순서대로 넣어주세요.

(4) intArray 배열에 담긴 각 값을 4로 나눈 나머지를 인덱스로 생각하고, remainders 배열에서 그 인덱스에 위치한 단어를 출력해주세요.  이 때 반드시 '배열 정리' 노트에 있는, for- each문을 활용해주세요!!
        * */

        int[] intArray1 = new int[30];
        for (int i = 0; i < intArray1.length; i++) {
            intArray1[i] = 1001 + i;
        }

        String[] remainders = {"Zero", "One", "Two", "Three"};
//        remainders[0] = "Zero";
//        remainders[1] = "One";
//        remainders[2] = "Two";
//        remainders[3] = "Three";

        for (int element : intArray1) {
            System.out.println(remainders[element % 4]);
        }

    }
}
