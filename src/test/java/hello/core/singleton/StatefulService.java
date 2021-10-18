package hello.core.singleton;

public class StatefulService {
    // 빈을 무상태로 설계하지 않은 경우
//    private int price;
//
//    public void order(String name, int price){
//        System.out.println("name = " + name + " price = " + price);
//        // 여기가 문제
//        this.price = price;
//    }
//
//    public int getPrice(){
//        return price;
//    }
    public int order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
        return price;
    }
}
