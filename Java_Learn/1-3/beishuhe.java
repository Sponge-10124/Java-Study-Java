public class beishuhe{
    public static void main(String[] args){
        int he = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                he += i;
            }
        }
        System.out.println("100以内3的倍数和为：" + he);
    }
}