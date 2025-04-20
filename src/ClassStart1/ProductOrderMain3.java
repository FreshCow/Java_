package ClassStart1;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for(int i = 0; i < orders.length; i++){
            System.out.println((i+1) +"번째 주문을 입력하세요.");
            String pname = scanner.nextLine();
            System.out.println((i+1) +"번째 주문의 가격을 입력하세요.");
            int price = scanner.nextInt();
            System.out.println((i+1) +"번째 주문의 수량을 입력하세요.");
            int quat = scanner.nextInt();
            orders[i] = createOrder(pname, price, quat);
            scanner.nextLine();
        }


//        ProductOrder order1 = createOrder("두부", 5000, 5);
//        orders[0] = order1;
//
//        ProductOrder order2 = createOrder("김치", 8000, 2);
//        orders[1] = order2;
//
//        ProductOrder order3 = createOrder("콜라", 1500, 1);
//        orders[2] = order3;
//
//        String s = "신선우";

        printoreders(orders);

    }

    static ProductOrder createOrder(String pName, int price, int qunt){
        ProductOrder order = new ProductOrder();
        order.productName = pName;
        order.price = price;
        order.quantity = qunt;

        return order;
    }

    static void printoreders(ProductOrder[] orders){
        int total = 0;

        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 :" + order.price + ", 수량 :" + order.quantity);
            total += order.price * order.quantity;
        }

        System.out.println("총 결제 금액 :" + total);
    }

}
