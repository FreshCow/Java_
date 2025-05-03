package extends1.shoppingmall;

public class ShoppingMallMain {
    public static void main(String[] args) {
        Book book = new Book("Java", 10000, "han", 12345);

        book.print();

        int sum = book.getPrice();

        System.out.println("가격 상품의 합 :" + sum);
    }
}
