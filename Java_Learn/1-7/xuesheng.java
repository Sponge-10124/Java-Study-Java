public class xuesheng {
    class Student { 
        int score;
        String name; 

        Student() {
            name = "OP"; 
            score = 91;
        }
        Student(String ming, int fen) { 
            name = ming;
            score = fen;
        }

        public void jieguo() {
            System.out.println("姓名:" + name + "\t成绩:" + score);
        }
    }
    public static void main(String[] args) {
        xuesheng outer = new xuesheng();
        Student l1 = outer.new Student();
        l1.jieguo();
        Student l2 = outer.new Student("GI", 666);
        l2.jieguo();
    }
}

