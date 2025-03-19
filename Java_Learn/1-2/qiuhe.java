import java.util.Scanner;
public class qiuhe{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入三位数:");
        int shu = scanner.nextInt();
        int ge=shu%10;
        int shi=(shu/10)%10;
        int bai=shu/100;
        int sum=ge+shi+bai;
        System.out.println("三个位数的和是:"+sum);
    }
}