package 基础练习;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("第1个月的兔子总数为1对");
        System.out.println("第2个月的兔子总数为1对");
        int f1 = 1,f2 = 1,M = 24;
        for (int i = 3; i <= M ; i++) {
            int f3 = f1+ f2;
            f1 = f2;
            f2 = f3;
            System.out.println("第" + i + "个月的兔子总数为" + f3 + "对");
        }
    }
}
