public class pingjunfen {
    public static void main(String[] args) {
        // 定义5个学生3门课的成绩
        int[][] scores = {
            {85, 90, 78}, // 学生1
            {88, 76, 92}, // 学生2
            {90, 88, 85}, // 学生3
            {70, 80, 75}, // 学生4
            {95, 85, 88}  // 学生5
        };

        // 计算每门课的平均分
        int numStudents = scores.length;
        int numSubjects = scores[0].length;
        double[] averageScores = new double[numSubjects];

        for (int j = 0; j < numSubjects; j++) {
            int sum = 0;
            for (int i = 0; i < numStudents; i++) {
                sum += scores[i][j];
            }
            averageScores[j] = (double) sum / numStudents;
        }

        // 输出每门课的平均分
        for (int j = 0; j < numSubjects; j++) {
            System.out.printf("第%d门课的平均分是：%.2f%n", j + 1, averageScores[j]);
        }
    }
}
