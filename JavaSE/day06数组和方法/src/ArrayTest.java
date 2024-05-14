/**
 * @author XGLins
 * @date 2024/5/13 14:30
 */
class ArrayTest2{
    public static void main(String[] args) {
        //动态初始化
        int[] array = new int[3];
        System.out.println(array);
    }
}

/**
 * 初始化方法 以及 静态初始化
 * */
public class ArrayTest {
    public static void main(String[] args) {
        int[] array={77,11,44,55};
        System.out.println(array);

        //声明和赋值不能分开
        int array2[]={77,11,44,55};
        System.out.println(array2);

        //声明和赋值可以分开
        int[] array3=new int[]{77,11,44,55};
        System.out.println(array3);
    }
}
