package 基础练习;

public class Judge水仙花数 {
    public static void main(String[] args) {
        //水仙花数：三位数，各个位之和加起来等于本身
        for (int i = 100; i <999 ; i++) {
            int a = i % 10;
            int b = (i % 100) / 10;
            int c = i / 100;
            if (i == a*a*a+b*b*b+c*c*c)
                System.out.println(i + "是水仙花数");
        }
    }
}
