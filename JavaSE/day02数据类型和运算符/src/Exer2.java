/**
 * @author XGLins
 * @date 2024/5/7 10:57
 */
public class Exer2 {

    public static void main(String[] args) {

        int num = 1234;

        //获取四位数上的每一位 求和
        int qianwei = num / 1000;
        System.out.println("qianwei = " + qianwei);

        int baiwei = num % 1000 / 100;
        System.out.println("baiwei = " + baiwei);

        int shiwei = num % 100 / 10;
        System.out.println("shiwei = " + shiwei);

        int gewei = num % 1000 % 10;
        System.out.println("gewei = " + gewei);

        //定义变量记录总和
        int sum = qianwei + baiwei + shiwei + gewei;
        System.out.println("sum = " + sum);

    }

}
