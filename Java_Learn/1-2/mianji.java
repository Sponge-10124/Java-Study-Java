import java.util.Scanner;
public class mianji{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("输入长:");
    int l = scanner.nextInt();
    System.out.println("输入宽:");
    int w = scanner.nextInt();
    int c=(l+w)*2;
    int s=l*w;
    System.out.println("矩形的周长:"+c);
    System.out.println("矩形的面积:"+s);
    }
}