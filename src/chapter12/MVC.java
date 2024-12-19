package chapter12;


// === Model: 데이터를 저장하는 역할 ===
class LunchMenu {
    private String menu;

    public String getMenu (){ return menu; }
    public void setMenu(String menu){ this.menu = menu; }
}

// === View: 화면에 보여주는 역할 ===
class LunchView {
    public void displayMenu(String menu){
        System.out.println("오늘의 급식 메뉴는 " + menu);
    }
}

// === Controller: 모델과 뷰를 연결하는 역할 ===
class LunchController {
    private LunchMenu model;
    private LunchView view;

    public LunchController(LunchMenu model, LunchView view){
        this.model = model;
        this.view = view;
    }

    // 모델에 데이터를 저장
    public void setLunchMenu(String menu){
        model.setMenu(menu);
    }

    // 모델 데이터를 뷰에 전달
    public void updateView() {
        String menu = model.getMenu();
        view.displayMenu(menu);
        // view.displayMenu(model.getMenu();
    }
}


public class MVC {
    // 학교 급식 배식 시스템

    // Model(모델) : 데이터 담당
    // : 학교 급식표와 실제 음식 데이터를 담당
    // >> 급식표에 메뉴를 적는 역할

    // View(뷰) : 화면 담당
    // : 학생들에게 급식표를 보여줌
    // >> 급식을 쉽게 볼 수 있도록 보기 좋게 정리하는 역할

    // Controller(컨트롤러) : 연결 담당
    // : 모델과 뷰 사이의 통역사
    // : "선생님"이 학생의 요청을 급식표에 반영하고 다시 칠판에 업데이트
    public static void main(String[] args) {
        LunchMenu menu = new LunchMenu();
        LunchView view = new LunchView();

        LunchController controller = new LunchController(menu, view);
        controller.setLunchMenu("김밥, 떡볶이, 콜라");
        controller.updateView();
    }

}
