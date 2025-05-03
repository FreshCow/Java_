package extends1.shoppingmall;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        int getprice = 0;
        getprice = this.price;
        return getprice;
    }

    public void print(){
        System.out.println("이름:"+name + "," + "가격:"+price);
    }
}
