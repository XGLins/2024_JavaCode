/**
 * @author XGLins
 * @date 2024/5/11 9:15
 *
 * 嵌套循环：将一个循环作为另一个循环的循环体
 * 外层循环控制行数
 * 内层循环控制列数
 * 外层循环执行一次 内层循环执行一遍
 *
 * ******
 * ******
 * ******
 *
 */
class LoopTest2 {

    public static void main(String[] args) {
        /*
        打印分针 秒针
        */
        //打印分钟数1~6分钟
        for (int fenZhen = 1; fenZhen <=6 ; fenZhen++) {

            System.out.print("fenZhen = " + fenZhen + "--->");
            //打印秒数0~60
            for (int miaoZhen = 0; miaoZhen <=60; miaoZhen++) {
                System.out.print(miaoZhen + " ");
            }
            System.out.println();
        }


    }

}

public class LoopTest {
    public static void main(String[] args) {

        //1.打印第1行
        for (int i = 1; i <=6 ; i++) {
            System.out.print("*");
        }
        System.out.println();
        //2.打印第2行
        for (int i = 1; i <=6 ; i++) {
            System.out.print("*");
        }
        System.out.println();
        //3.打印第3行
        for (int i = 1; i <=6 ; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("---------------");
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 6; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
