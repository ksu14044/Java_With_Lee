package chapter07.orderApp;

/*
* Food 클래스(자식 클래스)
*
* +) 식품은 세금 면제
* */
public class Food extends Product {
    Food(String name, int price) {
        super(name, price);
    }

    double calculateTax(){
        return 0;
    }
}
