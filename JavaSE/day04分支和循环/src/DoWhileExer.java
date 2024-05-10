import java.util.Scanner;

/**
 * @author XGLins
 * @date 2024/5/10 9:16
 */
public class DoWhileExer {

    public static void main(String[] args) {
        /*
        键盘输入任意个整数，当输入0时结束 展示一共有几个正数 几个负数
        请输入一个数
        1
        请输入一个数
        2
        请输入一个数
        3
        请输入一个数
        -1
        请输入一个数
        0

        */

        //1.创建输入对象
        Scanner in = new Scanner(System.in);

        //2.定义变量统计正数 和 负数的数量
        int zCount = 0, fCount = 0;
        //定义变量统计正数偶数 与 负数偶数数量
        int zEvenCount = 0;//正偶数
        int zOddCount =0;//正奇数
        int fEvenCount = 0;//负偶数
        int fOddCount =0;//负奇数

        System.out.print("请输入一个数:");

        //3.定义变量接收键盘输入的值
        int num = in.nextInt();

        //4.使用循环不断进行输入数据
        do {

            //6.判断是正数 还是 负数
            if (num > 0) {
                //取模2等于0为正偶数 否则 为负偶数
                if (num % 2 == 0) {
                    zEvenCount++;
                } else {
                    zOddCount++;
                }
                zCount++;
            } else if (num == 0) {
                break;
            } else {
                if (num % 2 == 0) {
                    fEvenCount++;
                } else {
                    fOddCount++;
                }
                fCount++;
            }
            System.out.print("请输入一个数:");
            num = in.nextInt();

        } while (num != 0);

        System.out.println("正数 zCount = " + zCount);
        System.out.println("负数 fCount = " + fCount);

        System.out.println("正偶 zEvenCount = " + zEvenCount);
        System.out.println("正奇 zOddCount = " + zOddCount);

        System.out.println("负偶 fEvenCount = " + fEvenCount);
        System.out.println("负奇 fOddCount = " + fOddCount);

        System.out.println("Game Over");

    }

}
