package homeworkTwo;

/**
 * @author XGLins
 * @date 2024/4/20 22:49
 *
 * 简答题
 */
public class Homework7 {
    public static void main(String[] args) {
        //float f=3.4;是否正确，表达式15/2*2的值是多少？
        //float f = 3.4;//编译报错，因为3.4是double类型，大于float类型
        float f =3.4F;
        System.out.println(f);

        int result = 15/2*2;
        System.out.println("表达式15/2*2的值是多少？"+result);
    }
}
