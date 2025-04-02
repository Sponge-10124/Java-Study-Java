public class pingjun {
    public static void main(String[] args) {
        double[][] scores = {
            {85, 90, 78}, 
            {88, 76, 92}, 
            {90, 88, 84}, 
            {70, 85, 80}, 
            {95, 91, 89}  
        };
        double[] totalScores = new double[3];
        for (int i = 0; i < scores.length; i++) { 
            for (int j = 0; j < scores[i].length; j++) { 
                totalScores[j] += scores[i][j];
            }
        }
        System.out.println("每门课的平均分为：");
        for (int i = 0; i < totalScores.length; i++) {
            double average = totalScores[i] / scores.length;
            System.out.println("第 " + (i + 1) + " 门课的平均分是: " + average);
        }
    }
}
