package homeworkThree;

/**
 * @author XGLins
 * @date 2024/4/20 22:59
 *
 * 案例：今天是周2，100天以后是周几？
 *
 */
public class Homework1 {
    public static void main(String[] args) {
        //1. 定义一个int类型变量week，赋值为2
        int week = 2;
        //2. 修改week的值，在原值基础上加上100
        week += 100;
        //3. 修改week的值，在原值基础上模以7
        week %= 7;
        //4. 输出结果，在输出结果的时候考虑特殊值，例如周日
        System.out.println("今天是周2，100天以后是周几？" + (week==0 ? "日" : week) );

        //三元运算符用法：首先比较a与b的大小，如果大于则返回a的值，小于则返回冒号后b的值
        int a = 10,b = 20;
        System.out.println(a>b?a:b);

    }
}
