public class pingjunzhi {
    public static void main(String[] args) {
        int[] shuzu = {654, 342, 533, 3477, 76};
        int sum = 0;
        for (int i = 0; i < shuzu.length; i++) {
            sum += shuzu[i];
        }
        double average = (double) sum / shuzu.length;
        System.out.println("平均值是: " + average);
    }
}



