package chapter14.review;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class B_Lambda {
    public static void main(String[] args) {

        // (int x, int y ) -> x+y;
        // () -> System.out.println("Hello, Lambda!");
        // (String s) -> {
        //      System.out.println(s);
        //      return s.length();
        // }

        // === 람다식 사용 예시 ===
        // 주로 @FunctionalInterface (하나의 추상 메서드만 가지는 인터페이스)와 함께 사용
        List<String> list = Arrays.asList("apple", "orange", "banana");

        // .sort() : List를 정렬하는 메서드
        // a.compareTo(b) : a 와 b 두 개의 값을 비교하여 같을 경우 0
        // +) 포함되어 있을 경우
        //      오름차순 정렬 : 양수, 내림차수 정렬 : 음수
        list.sort((a,b) -> a.compareTo(b));
        System.out.println(list);

        // == 함수형 인터페이스 ==
        // 1) Predicate<T> : boolean test(T t)
        // - 주어진 조건을 테스트
        // - Stream API와 결합되어 쓰임

        // 2) Function<T, R> : R apply(T t)
        // - 입력값을 다른 타입으로 변환
        // 3) Consumer<T> : void accept(T t)
        // - 입력값을 소비
        // 4) Supplier<T> : T get()
        // - 값을 반환

        Function<String, Integer> fx = s -> s.length();
        Function<String, String> fx2 = s -> s.toUpperCase();

        Integer result = fx.apply("abcde");
        System.out.println(result);

        String result2 = fx2.apply("abcde");
        System.out.println(result2);

        Function<String, Integer> fx3 = s -> Integer.parseInt(s);
        Integer fx3Result = fx3.apply("10");
        System.out.println(fx3Result);

        Integer data = fx3
                .andThen(d -> d + 100)
                .apply("50");
        System.out.println(data);

        Predicate<Integer> even = n -> n % 2 == 0;
        System.out.println(even.test(10));
        System.out.println(even.test(11));

        // === 메서드 참조 ===
        // : 함수형 인터페이스를 간결하게 표현
        // - :: 연산자를 사용하여 기존 메서드를 참조
        List<String> names = Arrays.asList("이승아", "이도경", "김명진");
        // 일반 람다식
        System.out.println(" === 일반 람다식 === ");
        names.forEach(name -> System.out.println(name));

        // 메서드 참조
        System.out.println(" === 메서드 참조 === ");
        names.forEach(System.out::println);



    }
}
