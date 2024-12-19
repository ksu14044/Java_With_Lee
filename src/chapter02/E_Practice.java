package chapter02;

import java.util.Scanner;

public class E_Practice {
    public static void main(String[] args) {
        /*
         1. 점수에 따른 학점 출력

         사용자로부터 점수를 입력받아 아래 기준에 따라 학점을 출력하세요.
         0 미만 또는 100초과인 경우 : 유효하지 않은 점수입니다.
         90 이상 : A
         80 이상 : B
         70 이상 : C
         60 이상 : D
         그 외 : F

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int score = sc.nextInt();
        if (score>100 || score<0){
            System.out.println("유효하지 않은 점수입니다.");
        } else if (score>=90){
            System.out.println('A');
        } else if (score>=80){
            System.out.println('B');
        } else if (score>=70){
            System.out.println('C');
        } else if (score>=60){
            System.out.println('D');
        } else   {
            System.out.println('F');
        }

        // 2. 중첩 for문을 사용하여 삼각형 모양의 별(*) 출력
        // (1)
        // 줄 수 : 1 ~ 5 까지 반복
        // 각 줄의 별 갯수 : 1 ~ 5로 증가
        for (int i = 1; i <= 5; i++){ // 변수 i는 몇 번째 줄인지를 저장
            for (int j = 1; j <= i; j++){ // 각 줄의 별 갯수( 각 줄의 별 갯수는 각 줄의 수 보다 "이하"의 값 )
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈 처리를 감당
        }

        // (2)
        int rows = 5; // 출력할 줄 수

        for(int i = 0; i < rows; i++){// 1부터 rows까지 반복
            // 공백 반복 (4에서 0까지 감소)
            for(int j = 1; j <= rows -i; j++){// (j: 4~0)
                System.out.print(" ");
            }
            // 별 반복 (1에서 5까지 증가)
            for (int k = 0; k <= i; k++) {// (k:1~5)
                System.out.print("*");
            }

            System.out.println();// 줄 바꿈 처리

        }
        // cf) do-while 문 사용 예제
        // : 사용자 입력값을 반복적으로 받아 조건에 맞는 값을 처리할 때 유용

        int number;
        do {
            System.out.println("1부터 10사이의 숫자를 입력하세요.");
         number = sc.nextInt();
        }
        // 입력값이 1 ~ 10 사이일 때 반복 종료
        while(number < 1 || number > 10);

        System.out.println("입력한 숫자는 : " + number);

        sc.close();
        // cf) 동일한 입력 공간(System.in)을 여러 번 여는 경우
        // : 표준 입력 스트림을 닫고 재실행하는 경우 에러 발생
        // - 운영체제 자원의 스트림이기 떄문에 한 번 닫으면 다시 열 수 없음.
    }
}
