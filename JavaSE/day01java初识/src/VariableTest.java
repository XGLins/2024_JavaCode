/**
 * @author XGLins
 * @date 2024/4/20 18:00
 *
 * 变量：程序执行过程中 值会发生改变的量
 *
 * 变量的声明和赋值
 *      方式一：声明和赋值分开
 *      声明
 *          数据类型 变量；
 *      赋值
 *          变量名 = 值；
 *      方式二：声明和赋值在一起
 *          数据类型 变量名 = 值；
 *
 *
 */
public class VariableTest {
    public static void main(String[] args) {
        System.out.println("变量的声明和赋值方式二");

        boolean b = true;
        System.out.println(b);
        System.out.println("b = "+ b);

        char c = '国';
        System.out.println("c = "+ c);

        String s = "会当凌绝顶";
        System.out.println("s = "+ s);

        double d1 =3.14,d2 =6.28,d3 =9.26;
        System.out.println("d1 = "+ d1 +    ",d2 = "+ d2 + ",d3 = "+ d3);


        System.out.println("变量的声明和赋值方式一");
        //声明多个变量
        int a, z;
        a = 10;
        z = 20;
        System.out.println("a = " + a + "，z = " + z);

        //声明
        int i;
        //赋值
        i = 100;

        //赋值
        i = 666;

        System.out.println(i);

        double d ;
        d = 3.14;
        d = 6.28;
        System.out.println(d);

    }
}
