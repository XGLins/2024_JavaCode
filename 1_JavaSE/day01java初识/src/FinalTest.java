/**
 * @author XGLins
 * @date 2024/4/20 18:25
 *
 * Final:最终的
 *      final修饰的变量是常量
 *
 */
public class FinalTest {
    public static void main(String[] args) {

        //定义半径
        int r = 10;
        //定义变量
        final double PI = 3.1415;

        //面积
        double area = PI * r * r;

        //pi = 3.1415926;
        //周长
        double perimeter = 2 * PI * r;

        System.out.println("面积：" + area);
        System.out.println("周长:" + perimeter);


    }
}
