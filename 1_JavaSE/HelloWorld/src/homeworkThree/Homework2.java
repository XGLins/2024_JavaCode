package homeworkThree;

/**
 * @author XGLins
 * @date 2024/4/20 23:27
 * <p>
 * 案例：求三个整数x,y,z中的最大值
 */
public class Homework2 {
    public static void main(String[] args) {
        //1. 定义三个int类型变量,x,y,z，随意赋值整数值
        int x = 10, y = 25, z = 7;
        //2. 定义一个int类型变量max，先存储x与y中的最大值（使用三元运算符）
        int max = x > y ? x : y;
        //3. 再次对max赋值，让它等于上面max与z中的最大值（使用三元运算符）
        max = max > z ? max : z;
        //4. 输出结果
        System.out.println("10,25,7中最大的值是" + max);
    }
}
