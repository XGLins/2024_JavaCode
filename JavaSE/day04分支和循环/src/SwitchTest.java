import java.util.Scanner;

/**
 * @author XGLins
 * @date 2024/5/9 9:43
 *
 * switch(表达式){
 *     case 常量值:
 *          分支内容一
 *          break;
 *     case 常量值:
 *          分支内容二
 *          break;
 *     ......
 *     [default:
 *          分支内容三
 *          break;
 *     ]
 * }
 * 注意：
 *    1.default：可以有也可以没有
 *              所有的case都不满足时 会执行default
 *    2.break：结束/跳出switch
 *    3.switch(表达式)：byte short int char String 枚举(enum)
 *
 */
class SwitchTest {
    public static void main(String[] args) {
        /*
        键盘输入一个数字 展示 数字对应的大写数字
        1   壹
        2   贰
        3   叁
        */
        //键盘输入对象
        Scanner in = new Scanner(System.in);
        //给出提示语句
        System.out.println("请输入需要转换成大写的个位数字");
        //对象调用方法
        int num = in.nextInt();
        //对象数据进行判断
        switch (num) {
            case 1:
                System.out.println(num + "的大写：壹");
                break;
            case 2:
                System.out.println(num + "的大写：贰");
                break;
            case 3:
                System.out.println(num + "的大写：叁");
                break;
            default:
                System.out.println("只能输入1-3的数字，请重新输入");
                break;
        }
        //展示结果
        System.out.println("GameOver");

    }
}
