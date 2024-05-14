/**
 * @author XGLins
 * @date 2024/5/11 9:52
 * <p>
 * *
 * **
 * ***
 * ****
 * *****
 */
public class LoopExer {

    public static void main(String[] args) {

        String stars = "";
        for (int row = 1; row <= 5; row++) {

            stars += "*";
            System.out.println(stars);
        }

        System.out.println("-------------------");
        //共计打印5行
        for (int row = 1; row <= 5; row++) {
            //有多少行 那么就打印多少个*并显示在一行内
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            //当一列打印结束后换行
            System.out.println();
        }

    }

}

/** page4
     *****
    *****
   *****
  *****
 *****
 */
class LoopExer2 {
    public static void main(String[] args) {
        //存储总行数
        int rowCount = 5;
        //存储总列数
        int columnCount = 6;

        //外层循环 决定有多少行
        for (int row = 1; row <= rowCount; row++) {

            //这一层循环 是第n行则打印n个空格
            for (int space = rowCount; space >= row; space--) {

                if (space != rowCount) {
                    System.out.print(" ");
                }
            }

            //在第n行则打印n个空格 的 基础上后面跟上指定的内容及个数
            for (int column = 1; column <= columnCount; column++) {

                System.out.print("*");

            }

            //第一层循环结束一次则输出一次换行
            System.out.println();


        }

    }
}

/** page14
 ******
  ******
   ******
    ******
     ******
 */
class LoopExer3 {
    public static void main(String[] args) {
        //存储总行数
        int rowCount = 5;
        //存储总列数
        int columnCount = 6;

        //外层循环 决定有多少行
        for (int row = 1; row <= rowCount; row++) {

            //这一层循环 是第n行则打印n个空格
            for (int space = 1; space <= row; space++) {

                if (space != 1) {
                    System.out.print(" ");
                } else {
                    continue;
                }
            }

            //在第n行则打印n个空格 的 基础上后面跟上指定的内容及个数
            for (int column = 1; column <= columnCount; column++) {
                System.out.print("*");
            }
            //第一层循环结束一次则输出一次换行
            System.out.println();
        }
    }
}


    

