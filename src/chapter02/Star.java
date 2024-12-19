package chapter02;

public class Star {
    public static void main(String[] args) {

        for( int i = 0 ; i < 5; i++) {
            // 별 갯수 5~1
            for (int j = 0 ; j < 5-i; j++) {
                System.out.print("*");
            }
            // 줄 띄우기
            System.out.println();
        }
        int row = 5;
        for( int i = 0 ; i < row ; i ++ ) {
            // 공백 찍기 0~4
            for( int j = 0; j < i ; j ++ ) {
                System.out.print(" ");
            }// 별 찍기 5~1
            for( int k = 0 ; k < row - i ; k++ ) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
        int height = 5; // 별의 높이를 고정값 5로 설정

        // 첫 번째 for은: 줄(row)을 제어 - 5줄 출력
        for(int i = height; i >= 1; i--) {

            // 두 번쨰 for문 : 각 줄에 별을 출력
            for ( int j =1 ; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 첫 번째 for문 : 줄(row)을 제어 - 5줄 출력
        for(int i = height; i>=1; i--) {
            // 두 번째 for문 : 줄의 시작 부분에 공백을 추가(오른쪽 정렬)
            // 0,1,2,3,4
            for (int j = 1; j<=height-i; j++) {
                System.out.print(" ");
            }
            // 세 번째 for문 : 별을 추가
            // 5,4,3,2,1
            for (int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
