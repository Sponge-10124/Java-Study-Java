import java.util.Scanner;
public class gaodi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] scores = new float[10];
        System.out.println("请输入10个学生的成绩：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第 " + (i + 1) + " 个学生的成绩: ");
            scores[i] = scanner.nextFloat();
        }
        float max = scores[0];
        float min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("最高分是: " + max);
        System.out.println("最低分是: " + min);
        scanner.close();
    }
}