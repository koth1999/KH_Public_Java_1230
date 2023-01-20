package 인터페이스활용;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer; // Customer Type의 참조변수를 Buy 인터페이스 타입에 대입하여 형 변환
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        Customer customer1 = (Customer) seller;
        customer1.buy();
        customer1.sell();
    }
}
