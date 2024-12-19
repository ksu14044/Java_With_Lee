package chapter10.Practice2;
/*
* 2) 요구 사항
* - 기능
*       상품(Item) 추가, 수정, 삭제, 카테고리별 상품 검색, 가격 또는 이름 등으로 정렬
* - 사용 컬렉션
*       Set : 상품 관리 ( 중복 상품 방지 )
*       Map : 카테고리별 상품 분류 ( Key: 카테고리명, Value: 상품 목록 )
* - 추상클래스(Item) : 모든 상품의 공통 필드를 포함
* - 인터페이스(Discountable) : 할인로직 제공
*
* */

// cf) CRUD (크루드)
// : Create, Read, Update, Delete
// - 소프트웨어 개발에서 데이터를 처리하는 기본적인 네 가지 작업


import chapter10.Practice2.entity.Electronics;
import chapter10.Practice2.entity.Furniture;
import chapter10.Practice2.entity.Item;
import chapter10.Practice2.repository.InMemoryItemRepository;
import chapter10.Practice2.service.InventoryService;
import chapter10.Practice2.service.InventoryServiceImp1;



import java.util.List;


public class Main {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryServiceImp1(new InMemoryItemRepository());
        // Scanner scanner = new Scanner(System.in);

        Item laptop1 = new Electronics("E001", "Samsung Book3 Pro", 20000, 10, "Samsung", 12);
        Item laptop2 = new Electronics("E002", "Samsung Book4 Pro", 10000, 5, "Samsung", 12);
        Item sofa1 = new Furniture("Foo1", "Fabric sofa", 30000, 15, "Fabric", "4인");
        Item sofa2 = new Furniture("Foo2", "Leather sofa", 20000, 5, "Leather", "2인");

        inventoryService.addItem(laptop1);
        inventoryService.addItem(laptop2);
        inventoryService.addItem(sofa1);
        inventoryService.addItem(sofa2);

        List<Item> electronics = inventoryService.getItemByCategory("Electronics");
        List<Item> furniture = inventoryService.getItemByCategory("Furniture");

        //리스트 출력
        System.out.println("========== 리스트 출력 =============");
        System.out.println(electronics);
        System.out.println(furniture);
        System.out.println("====================================");


        System.out.println("All Electronics");
        for(Item item : electronics) {
            System.out.println(item);
        }

        System.out.println("All Furniture");
        for(Item item : furniture) {
            System.out.println(item);
        }
        // 상품 가격 업데이트
        inventoryService.updateItemPrice("E001", 27000);
        System.out.println("Updated price");
        for(Item item : inventoryService.getItemByCategory("Electronics")) {
            System.out.println(item);
        }

        System.out.println("=======================================");

        // ItemRepository에서 E001 제거
        inventoryService.deleteItem("E001");
        System.out.println("Updated list:");

        electronics = inventoryService.getItemByCategory("Electronics");

        // E001이 제거된 Electronics 목록 출력
        for(Item item : inventoryService.getItemByCategory("Electronics")){
            System.out.println(item);
        }

        // E003 추가
        Item laptop3 = new Electronics("E003", "Samsung Book5 Pro", 25900, 7, "Samsung", 10);

        // List<Item> electronics 인덱스 1번에 추가
        electronics.add(1,laptop3);


        // ItemRepository에 추가
        inventoryService.addItem(laptop3);

        // ItemRepository에 추가된 "Electronics" 카테고리가 있는 물건을 item에 하나씩 추가하면서 출력
        System.out.println("===================== Repository ==========================");
        for(Item item : inventoryService.getItemByCategory("Electronics")) {
            System.out.println(item);
        }

        // List electronics 출력
        System.out.println("============== electronics =============");
        for(Item item : electronics) {
            System.out.println(item);
        }

    }
}
