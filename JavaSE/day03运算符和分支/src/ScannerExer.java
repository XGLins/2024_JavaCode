/**
 * @author XGLins
 * @date 2024/5/8 8:43
 *
 * 键盘输入 名字 年龄 身高 体重 性别 最喜欢的一句话
 *
 */
public class ScannerExer {

    public static void main(String[] args) {
        //1.创建键盘输入对象
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("--------用户信息录入----------");

        //给出提示语句
        System.out.println("请输入您的姓名：");
        //获取姓名
        String name = in.nextLine();

        //给出提示语句
        System.out.println("请输入您的年龄：");
        //获取年龄
        int age = in.nextInt();

        //给出提示语句
        System.out.println("请输入您的身高：");
        //5.获取身高
        double height = in.nextDouble();

        //给出提示语句
        System.out.println("请输入您的体重：");
        //获取体重
        double weight = in.nextDouble();

        //给出提示语句
        System.out.println("请输入您的性别：");
        //获取性别
        char gender = in.next().charAt(0);
        in.nextLine();

        //给出提示语句
        System.out.println("请输入您最喜欢的一句话：");
        //获取最喜欢的一句话
        String message = in.nextLine();

        System.out.println("--------用户信息展示----------");
        //展示姓名
        System.out.println("name: " +name);
        //展示年龄
        System.out.println("age: " + age);
        //展示身高
        System.out.println("height：" + height);
        //展示体重
        System.out.println("weight: " + weight);
        //展示性别
        System.out.println("gender: " + gender);
        //展示最喜欢的一段话
        System.out.println("message: " +message);

    }

}
