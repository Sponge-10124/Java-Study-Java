import java.util.Scanner;
public class circle{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("输入半径:");
    int r = scanner.nextInt();
    double c=r*2*Math.PI;
    double s=r*r*Math.PI;
    System.out.println("圆的周长:"+c);
    System.out.println("圆的面积:"+s);
    }
}