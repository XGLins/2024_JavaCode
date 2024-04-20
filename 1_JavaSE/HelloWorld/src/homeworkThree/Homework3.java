package homeworkThree;

/**
 * @author XGLins
 * @date 2024/4/20 23:39
 *
 * 3、案例：判断今年是否是闰年
 * 1. 定义一个int类型变量year，赋值为今年年份值
 * 2. 定一个一个boolean类型变量，用来保存这个年份是否是闰年的结果
 * 3. 输出结果，例如：2022年不是闰年。
 *  2000年是闰年。
 *
 * 提示闰年的判断标准是：
 * 1）年份year，可以被4整除，但不可以被100整除
 * 2）或者，可以被400整除
 */
public class Homework3 {
    public static void main(String[] args) {
        //1. 定义一个int类型变量year，赋值为今年年份值
        int year = 2022;
        //2. 定一个一个boolean类型变量，用来保存这个年份是否是闰年的结果
        boolean result = (year%400==0 || year/4==0&&year%100!=0)?true:false;
        //3. 输出结果，例如：2022年不是闰年。
        System.out.println(year + "年" + (result?"是":"不是")+"闰年");
    }
}
