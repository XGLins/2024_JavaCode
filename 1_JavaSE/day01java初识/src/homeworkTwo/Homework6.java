package homeworkTwo;

/**
 * @author XGLins
 * @date 2024/4/20 22:41
 *
 * 6、华氏度转摄氏度
 */
public class Homework6 {
    public static void main(String[] args) {
        //1. 定义一个double类型变量hua，存储华氏温度80
        double hua = 80;
        //2. 定义一个double类型变量she，存储摄氏温度，根据公式求值
        double she = (hua-32)/1.8;
        //3. 输出结果
        System.out.println("华氏度" + hua + "0F"+"转为摄氏度是"+she + "℃");
    }
}
