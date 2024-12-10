package ch13_inheritance.product;

public class Product extends Item{
    private int price;
    private int stock;

    // AllArgsConstructor 로 만들기 위해 부모 클래스에 없는 필드 추가함.
    public Product(String name, String category, int price, int stock) {
        super(name, category);
        System.out.println("Product 가 생성되었습니다.");
        // 기본적으로 사용하던 방식의 생성자 내부에 필드 대입하는 코드를 작성해야함.
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String category) {
        super(name, category);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        System.out.println("Product 이름 변경 : " + name);
        super.setName(name);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        System.out.println("Product 카테고리 변경 : " + category);
        super.setCategory(category);
    }

    // Item 클래스에 없는 필드와 관련된 setter / getter 를 생성하시오.
    // -> 얘네는 override 가 아니기 때문에 일반적인 getter / setter 생성됨.

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public  void displayInfo(){
        System.out.println("제품명 : " + getName() + "\n카테고리 : " + getCategory());
        System.out.println("가격 : " + getPrice() + "\n재고 : " + getStock());
    }
}
