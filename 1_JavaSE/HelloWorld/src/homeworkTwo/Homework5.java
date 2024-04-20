package homeworkTwo;

/**
 * @author XGLins
 * @date 2024/4/20 22:28
 *
 * 5、计算时间
 */
public class Homework5 {
    public static void main(String[] args) {
        //1. 定义一个int类型变量hours，赋值为89
        int hours = 89;
        //2. 定义一个int类型变量day，用来保存89小时中天数的结果
        int day = hours / 24;
        //3. 定义一个int类型变量hour，用来保存89小时中不够一天的剩余小时数的结果
        int hour = hours % 24;
        //4. 输出结果
        System.out.println("为抵抗洪水，战士连续作战" + hours + "小时：");
        System.out.println(hours + "是" + day +"天" + hour+ "小时");
    }
}
