public class shuixianhua {
    public static void main(String[] args) {
        int temp, geshu;
        int ge, shi, bai;
        for (temp = 100; temp <= 999; temp++) {
            ge = temp / 100;
            shi = (temp - ge * 100) / 10;
            bai= temp - ge * 100 - shi * 10;
            geshu = ge * ge * ge + shi * shi * shi + bai * bai * bai;
            if (geshu == temp) {
                System.out.println("水仙花的个可能数是："+geshu);
            }
        }
    }
}