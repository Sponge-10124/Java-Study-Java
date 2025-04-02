import java.util.Scanner;

public class fenshu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[10]; // 存储10个学生成绩

        System.out.println("请输入10个学生的成绩：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第 " + (i + 1) + " 个学生的成绩: ");
            scores[i] = scanner.nextInt();
        }

        int maxScore = scores[0];
        int minScore = scores[0];

        // 遍历数组，找出最高分和最低分
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
        }

        System.out.println("最高分是: " + maxScore);
        System.out.println("最低分是: " + minScore);

        scanner.close(); // 关闭 Scanner
    }
}