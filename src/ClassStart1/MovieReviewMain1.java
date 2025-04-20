package ClassStart1;

public class MovieReviewMain1 {

    public static void main(String[] args) {
        MovieReviews[] reviews = new MovieReviews[2];

        MovieReviews inception = new MovieReviews();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReviews abouTime = new MovieReviews();
        abouTime.title = "어바웃타임";
        abouTime.review = "인생영화임";
        reviews[1] = abouTime;

        for (MovieReviews review : reviews) {
            System.out.println("영화제목 :" + review.title + ", 리뷰 :" + review.review);
        }

        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 5000;
        order1.quantity = 3;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 8000;
        order2.quantity = 2;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 4;
        orders[2] = order3;
        
        String s = "신선우";
        
        
        
        int total = 0;

        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 :" + order.price + ", 수량 :" + order.quantity);
            total += order.price * order.quantity;
        }

        System.out.println("총 결제 금액 :" + total + s);
    }
}
