/**
 * @author XGLins
 * @date 2024/4/25 22:12
 * 用在字符串内：
 * 转义字符：\
 *      \n：换行
 *      \t：大空格
 * -------------------
 *      \b：退格键（删除数据）
 *      \"：字符串内插入引号
 *      \\：插入斜杠
 *      \r：后面的所有内容回到开头
 *
 */
public class CharTest1 {

    public static void main(String[] args) {

        System.out.println("蜀道难，难于上青天");
        System.out.println("-------r-------");
        System.out.println("蜀道难，\r难于上青天");

        System.out.println("-------斜杠-------");
        System.out.println("蜀道难，\\难于\\上青天");

        System.out.println("-------引号-------");
        System.out.println("蜀道难，\"难于\"上青天");

        System.out.println("-------b-------");
        System.out.println("蜀道难，难于\b上青天");

        System.out.println("-------t-------");
        System.out.println("蜀道难，难于\t上青天");

        System.out.println("-------n-------");
        System.out.println("蜀道难，难于\n上青天");



    }
}
