package ch18_static.products;

public class ProductViewMain {
    public static void main(String[] args) {

//        ProductView productView1 = ProductView.getInstance();
        // 여태까지는 위의 방법으로 객체명을 직접 지정해놓고 해당 객체의 메서드들을 실행시키는 방법을 사용함.

        /*
          ProductView.getInstance() 메서드는 대문자 P 이고, 싱글톤에서 분석했듯 static 메서드임.
          그리고 getInstance() 의 리턴값을 instance 라는 static 필드이기 때문에
          ProductView productView1 = ProductView.getInstance() 대입을 생략하고 곧장 실행을 해봄.
          하지만 return 값이 instance 라는 데에 주목을 해야함.
          그리고 instance 필드를 확인해 본 결과 자료형이 ProductView 클래스의 객체임을 확인 할 수 있기 때문에
          instance 메서드를 (static 이 없는) 실행한 결과 값과 동일한 값이 나오게 됨.
         */

        ProductView.getInstance().showMainView();
        //  두 instance 는 동일함.
        ProductView.getInstance().showOrderView();
    }
}
