package homeworkTwo;

/**
 * @author XGLins
 * @date 2024/4/20 20:00
 */
public class Homework3 {
    public static void main(String[] args) {
        //（1）先声明两个byte类型的变量b1,b2,并分别赋值为10和20，求b1和b2变量的和，并将结果保存在byte类型的变量b3中，最后输出b3变量的值
        byte b1 = 10,b2=20;
        byte b3 = (byte)(b1 +b2);
        System.out.println("byte类型的b1,b2的和为：" + b3);

        //（2）先声明两个short类型的变量s1,s2,并分别赋值为1000和2000，求s1和s2变量的和，并将结果保存在short类型的变量s3中，最后输出s3变量的值
        short s1=1000,s2=2000;
        short s3=(short)(s1+s2);
        System.out.println("short类型的s1,s2的和为：" + s3);
        //（3）先声明1个char类型的变量c1赋值为'a'，再声明一个int类型的变量num赋值为5，求c1和num变量的和，并将结果将结果保存在char类型的变量letter中，最后输出letter变量的值。
        char c1 = 'a';
        int num = 5;
        char letter = (char)(c1+num);
        System.out.println("char类型的c1,int类型的num的和为：" + letter);
        //（4）先声明两个int类型的变量i1,i2，并分别赋值5和2，求i1和i2的商，并将结果保存在double类型的变量result中，最后输出result变量的值。如何得到结果2.5呢？
        int i1=5,i2=2;
        double result = i1/i2;
        System.out.println("int类型的i1,i2的商为：" + result);

    }
}
