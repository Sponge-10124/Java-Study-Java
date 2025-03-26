import java.util.Scanner;
public class jiou{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("输入数字:");
    int ip = scanner.nextInt();
    if (ip % 2 == 0){
            System.out.println(ip+"是偶数");
        }else{   
            System.out.println(ip+"是奇数");
        }
    }
}