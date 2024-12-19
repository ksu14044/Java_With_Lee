package chapter05;

// 음식점 클래스
// : 다양한 방법으로 주문을 받는 메서드 정의
class Restaurant {
    // 메서드 정의
    // : placeOrder 주문 메서드

    // >> 메뉴 이름(String dish)
    // >> 메뉴 이름, 수량 제공(int quantity)
    // >> 메뉴 이름, 특별 요청 사항(String specialRequest)
    // >> 메뉴 이름, 수량 제공, 특별 요청 사항

    void placeOrder(String dish){
        System.out.println(dish);
    }
    void placeOrder(String dish, int quantity){
        System.out.println(dish + " " + quantity);
    }
    void placeOrder(String dish, String specialRequest){
        System.out.println(dish + " " + specialRequest);
    }
    void placeOrder(String dish, int quantity, String specialRequest){
        System.out.println(dish + " " + quantity + " " + specialRequest);
    }

}

public class OverLoading02 {
    public static void main(String[] args) {
        Restaurant Restaurant = new Restaurant();
        Restaurant.placeOrder("햄버거");
        Restaurant.placeOrder("피자", 2);
        Restaurant.placeOrder("파스타", "치즈 많이");
        Restaurant.placeOrder("샐러드", 2, "드레싱 없이");

    }
}
