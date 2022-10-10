package 基础练习;

public class Judge素数个数 {
    public static void main(String[] args) {
        //判断101-200的素数个数

        for (int i = 101; i < 200 ; i++) {
            boolean flag = true;
            for (int j = 2; j < i/2; j++) {
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                System.out.println(i);
            }

        }
    }
}
