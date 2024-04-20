import jdk.swing.interop.SwingInterOpUtils;

/**
 * @author XGLins
 * @date 2024/4/20 11:23
 *
 * 标识符：java对类名方法名变量名等命名时采用的字符序列
 * 标识符在命名时有自己的规则和规范：
 *      规则：法律法规
 *          1.字母、数字、下划线_、美元符$组成
 *          2.数字不能开头
 *          3.不能是java中的关键字和保留字
 *              关键字：在java中赋予了特殊含义的字符串（单词） class void static
 *              保留字：当前版本无意义 以后可能使用 goto
 *          4.严格区分大小写
 *          5.标点符号必须是英文半角
 *      规范：约定成俗道德约束
 *          1.见名知意
 *          2.对类进行命名时要求每一个单词的首字母都大写(大驼峰)
 *              HelloWorld PrintTest IdentifierTest
 *          3.对变量方法命名时 第一个单词首字母小写从第二个单词开始首字母大写（小驼峰）
 *              userName
 *              passWord
 *              getSum
 *          4.对包进行命名时 每一个单词所有的字母都小写
 *              com.atjava.oop
 *              com.atjava.thread
 *              com.atjava.io
 *          5.对常量命名时 每一个单词所有的字母都大写 如果是多个单词组成 单词与单词之间使用下划线连接
 *              PI
 *              MAX_VALUE   MIN_VALUE
 *
 */
public class IdentifierTest {
    public static void main(String[] args) {
        int a = 10;
        int Age = 20;
        System.out.println(a);
        System.out.println(Age);
        int aa = 10;
        int aaa = 20;
        int aaaa = 30;

        int $name = 66;
        System.out.println($name);
        int print = 22;
        System.out.println(print);
        int main = 50;
        System.out.println(main);


    }
}
