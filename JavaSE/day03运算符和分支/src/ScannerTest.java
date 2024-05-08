import java.util.Scanner;

/**
 * @author XGLins
 * @date 2024/5/7 20:49
 *
 * 键盘输入：在程序执行时录入数据
 * 如何使用键盘输入：
 *      1.创建键盘输入对象
 *          java.util.Scanner input = new java.util.Scanner(System.in);
 *          或者
 *          Scanner in = new Scanner(System.in);
 *      2.给出提示语句 提升用户体验
 *          System.out.print("请输入您的年龄：");
 *      3.对象调用方法 接受数据
 *          nextByte();
 *          nextShort();
 *          nextInt()
 *          nextLong();
 *          nextFloat();
 *          nextDouble();
 *          nextBoolean
 *
 *
 * 注意：
 * 如果输入的数据是不满足键盘输入的类型要求 则发生异常
 *    Exception in thread "main" java.util.InputMismatchException 输入不匹配异常
 *
 */
class ScannerTest2 {

    public static void main(String[] args) {
        //获取其它基本类型的数据
        //创建键盘输入对象
        java.util.Scanner input = new java.util.Scanner(System.in);
        //给出提示语句
        System.out.print("请输入一个byte类型的值：");
        //对象调用方法接受byte
        byte b1 = input.nextByte();
        System.out.println("byte类型的值为："+b1);

        //给出提示语句
        System.out.print("请输入一个short类型的值：");
        //对象调用方法接收short
        short s1 = input.nextShort();
        System.out.println("short类型的值为："+s1);

        //给出提示语句
        System.out.print("请输入一个int类型的值：");
        //对象调用方法接收int
        int i1 = input.nextInt();
        System.out.println("int类型的值为："+i1);

        //给出提示语句
        System.out.print("请输入一个long类型的值：");
        //对象调用方法接收long
        long l1 = input.nextLong();
        System.out.println("long类型的值为："+l1);

        //给出提示语句
        System.out.print("请输入一个float类型的值：");
        //对象调用方法接收float
        float f1 = input.nextFloat();
        System.out.println("float类型的值为："+f1);

        //给出提示语句
        System.out.print("请输入一个double类型的值：");
        //对象调用方法接收double
        double d1 = input.nextDouble();
        System.out.println("double类型的值为："+d1);

        //给出提示语句
        System.out.print("请输入一个boolean类型的值：");
        //对象调用方法接收boolean
        boolean b2 = input.nextBoolean();
        System.out.println("boolean类型的值为："+b2);


    }

}

class ScannerTest {

    public static void main(String[] args) {
        //1.创建键盘输入对象
//        java.util.Scanner input = new java.util.Scanner(System.in);
        Scanner in = new Scanner(System.in);

        //2.给出提示语句
        System.out.print("请输入您的年龄：");

        //3.对象调用方法 接受数据
        int userAge = in.nextInt();
        System.out.println("输出您的年龄："+userAge);


    }

}
