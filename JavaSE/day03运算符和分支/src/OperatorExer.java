/**
 * @author XGLins
 * @date 2024/5/7 17:10
 *
 * 1.交换俩数的位置
 *      System.out.println("交换前 m = " +m+",n = " + n);//10 20
 *      交换
 *
 *      System.out.println("交换后 m = " +m+",n = " + n);//20 10
 *      思路一：孔融让梨
 *      思路二：变量 + 加法运算
 *
 * 2.定义三个整数 获取三个整数的最大值 使用[一行]条件运算符
 *      int m = 10, n = 20,z = 30;
 *
 * page9
 */
class OperatorExer2 {

    public static void main(String[] args) {
        //定义三个整数 获取三个整数的最大值 使用[一行]条件运算符
        int m = 10, n = 20,z = 30;

        //获取两个值中的较大值
        //int tempNum = m>n?m:n;
        //让较大值与第三个值比较
        //int maxNum = tempNum>z?tempNum:z;

        int maxNum = m>n?(m>z?m:z):(n>z?n:z);

        System.out.println("maxNum = " + maxNum);

    }
}

class OperatorExer {

    public static void main(String[] args) {
        int m = 10,n=20;
        System.out.println("交换前 m = " +m+",n = " + n);//10 20
        //交换
        //临时变量 充当桌子
        /*int temp = n;
        n = m;
        m = temp;
        */
        m = m + n ;//30
        n = m - n;//10
        m = m - n;//20

        System.out.println("交换后 m = " +m+",n = " + n);//20 10

    }
}
