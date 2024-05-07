/**
 * @author XGLins
 * @date 2024/4/25 20:05
 *
 * 字符型：char
 *      底层的存储的是数值（编码值）
 *      常识：
 *          '0'：48
 *          'A'：65
 *          'a'：97
 *
 */
public class CharTest {

    public static void main(String[] args) {

        char c ='A';
        System.out.println("c = " + c);

        char c1 = 66;
        System.out.println("c1 = " + c1);//B

        char c3 = 'せ';
        System.out.println("c3 = " + c3);

        /*
        char 你好 = '中';
        System.out.println("你好 = " + 你好);
        */

        char c4 = '\u4e2d';
        System.out.println("c4 = " + c4);

    }
}
