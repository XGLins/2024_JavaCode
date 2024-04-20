package homeworkThree;

/**
 * @author XGLins
 * @date 2024/4/21 0:03
 *
 * 6、分析如下代码的计算结果
 */
public class Homework6 {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;

//        System.out.println((a=b) ? "Equal" : "Not Equal");
        //编译报错，因为=是赋值运算，不是==比较运算，而a和b是int类型，a=b的结果是int类型，不能直接作为条件

        System.out.println((a==b) ? "Equal" : "Not Equal");
    }
}
