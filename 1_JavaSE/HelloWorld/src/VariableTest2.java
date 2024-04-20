/**
 * @author XGLins
 * @date 2024/4/20 18:15
 *
 * 变量：程序执行过程中 值会发生改变的量
 *
 * 变量的声明和赋值
 *      方式一：声明和赋值分开
 *      声明
 *          数据类型 变量；
 *      赋值
 *          变量名 = 值；
 *      方式二：声明和赋值在一起
 *          数据类型 变量名 = 值；
 * 注意：
 *      1.java:27:错误:可能尚未初始化变量i
 *          局部变量使用前必须进行初始化
 *          赋值就是初始化
 *          局部变量：方法内的变量
 *      2.java: 已在方法 main(java.lang.String[])中定义了变量 i
 *          同一个方法内不能存在同名的变量
 *      3.声明变量的本质：申请内存
 */
public class VariableTest2 {
    public static void main(String[] args) {
        int i ;
        i=10;
        System.out.println("i = " + i);

        double j = 3.14;
        System.out.println("j = " + j);
    }
}
