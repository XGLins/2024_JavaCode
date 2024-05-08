import java.util.Scanner;

/**
 * @author XGLins
 * @date 2024/5/8 15:32
 *
 * 6、判断年、月、日是否合法
 *
 * （1）从键盘输入年、月、日，
 *
 * （2）要求年份必须是正整数，月份范围是[1,12]，日期也必须在本月总天数范围内，
 *
 * （3）如果输入正确，输出“xxxx年-xx月-xx日”结果，否则提示输入错误。
 *
 */
public class Homework6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入日期：");
        System.out.print("年：");
        int year = input.nextInt();

        System.out.print("月：");
        int month = input.nextInt();

        System.out.print("日：");
        int day = input.nextInt();

        input.close();

        if (year > 0) {
            if (month >= 1 && month <= 12) {
                //计算month月的总天数
                int days;
                if (month == 2) {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    days = 30;
                } else {
                    days = 31;
                }

                if(day >= 1 && day <= days) {
                    System.out.println(year + "-" + month + "-" + day);
                }else{
                    System.out.println("日期输入不合法");
                }
            } else {
                System.out.println("月份输入不合法");
            }
        } else {
            System.out.println("年份输入不合法");
        }
    }
}
