public class Circle {
    int banjing;
    double zhouchang;
    double mianji;

    public Circle() {
        banjing = 94;
        zhouchang = 2 * Math.PI * banjing;
        mianji = Math.PI * banjing * banjing;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.printf("半径: %d\n", circle.banjing);
        System.out.printf("周长: %.3f\n", circle.zhouchang);
        System.out.printf("面积: %.3f\n", circle.mianji);
    }
}