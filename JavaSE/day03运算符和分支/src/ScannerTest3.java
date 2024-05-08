/**
 * @author XGLins
 * @date 2024/5/7 22:13
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
 *      4.键盘输入一句话
 *          next()：只能接收空格之前的数据
 *          nextLine()：接收一整行数据
 *                      如果nextLine()上面有非nextLine()的键盘输入语句 则会导致自己无法接收数据
 *          String 字符串.charAt(下标/索引)：下标/索引从0开始
 *              "ABCD".charAt(1)====>'B'
 *
 * 注意：
 * 如果输入的数据是不满足键盘输入的类型要求 则发生异常
 *    Exception in thread "main" java.util.InputMismatchException 输入不匹配异常
 *
 */
class ScannerTest4 {

    public static void main(String[] args) {
        //System.out.println("page:13");

        String s1 = "ABCD";
        char ele = s1.charAt(2);
        System.out.println("ele = " + ele);

        //1.创建键盘输入对象
        java.util.Scanner obj = new java.util.Scanner(System.in);
        //2.给出提示语句
        System.out.println("请您输入性别");
        //3.获取数据
        String message = obj.next();
        //4.获取第一个字符
        char gender = message.charAt(0);
        //5.展示字符
        System.out.println("gender=" + gender);

    }

}


class ScannerTest3 {

    public static void main(String[] args) {
        //1.创建键盘输入对象
        java.util.Scanner in = new java.util.Scanner(System.in);
        //2.给出提示语句
        System.out.println("键盘输入第一段话");
        //3.对象调用方法接收数据
        String message = in.nextLine();
        //4.展示数据
        System.out.println("展示数据1："+message);

        //2.给出提示语句
        System.out.println("键盘输入第二段话");
        //3.对象调用方法接收数据
        String message2 = in.next();
        //4.展示数据
        System.out.println("展示数据2："+message2);

        //接收上面in.next()的值，如果不接收那么就将下面第三段的对象调用为结束，然后第三段的展示数据值为空
        in.nextLine();

        //2.给出提示语句
        System.out.println("键盘输入第三段话");
        //3.对象调用方法接收数据
        String message3 = in.nextLine();
        //4.展示数据
        System.out.println("展示数据3："+message3);

    }

}
