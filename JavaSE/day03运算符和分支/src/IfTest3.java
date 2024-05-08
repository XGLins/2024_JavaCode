import java.util.Scanner;

/**
 * @author XGLins
 * @date 2024/5/8 13:55
 *
 * if分支：
 *    if单分支
 *       if(布尔类型的表达式){
 *           分支内容;
 *       }
 *
 *    if双分支
 *       if(布尔类型的表达式){
 *         分支内容1;
 *       }else{
 *         分支内容2;
 *       }
 *
 *    if多分支
 * 注意：
 *    1.如果没有大括号 则只对距离它最近的语句有效
 *    2.判断闰年的标准
 *      2.1 能被400整除
 *      2.2能被4整除 并且 不能被100整除
 */
class IfTest4 {

    public static void main(String[] args) {
        System.out.println("使用三元运算符判断闰年还是平年");
    }
}

class IfTest3 {

    public static void main(String[] args) {

        int age= 19;
        if (age>=18){
            System.out.println("成年了");
        }else {
            System.out.println("没有成年");
        }
        System.out.println("--------------");

        //1.获取键盘输入对象
        Scanner in = new Scanner(System.in);
        //2.提示语句
        System.out.println("请输入一个整数");
        //3.接收数据
        int num;
        //4.对数据进行判断
        for (int i = 1;i<100;i++ ) {
            num = in.nextInt();
            if (num % 2 == 0 & num > 0) {
                System.out.println("正偶数！");
            } else if (num % 2 == 0 & num < 0) {
                System.out.println("负偶数");
            } else if (num % 2 != 0 & num > 0) {
                System.out.println("正奇数！");
            } else if (num % 2 != 0 & num < 0) {
                System.out.println("负奇数");
            }else if(num==0){
                System.out.println("循环测试结束");
                break;
            }
        }


        System.out.println("Game Over");



    }

}
