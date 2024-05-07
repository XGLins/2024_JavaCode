/**
 * @author XGLins
 * @date 2024/5/7 10:39
 *
 * 算术运算符：
 *    +：
 *       1.正号
 *       2.加法运算
 *       3.字符串连接符使用
 *    -：
 *       1.负号
 *       2.减法运算
 *    *
 *    /:
 *      整数相除不保留小数
 *
 *    %：取模/取余:获取余数
 *      判断整除：余数位0是整除
 *
 * --------------------------
 *    ++:
 *      ++a 前++：先+1 再运算
 *      a++ 后++：先运算 再+1
 *    --:
 *      --a
 *      a--
 *
 *
 *
 *
 */
class MathOperator2{

    public static void main(String[] args) {
        int m = 10;
//        System.out.println(m++);//10
//        System.out.println(m++);//11

//        int sum = ++m + m;//22
//        System.out.println(sum);

//        ++m;//11

        m++;//11

        System.out.println(m);

    }

}

class MathOperator1 {

    public static void main(String[] args) {
        System.out.println("------------- % -------------");
        System.out.println(4%2);
        System.out.println(4%3);
        System.out.println(5%13);

        System.out.println("------------- / -------------");
        System.out.println(10/3);//3
        System.out.println(4/2);//2
        System.out.println(19/10);//1

        System.out.println("------------- * -------------");
        System.out.println(7*8);

        System.out.println("------------- - -------------");
        System.out.println(-36);
        System.out.println(6-3);

        System.out.println("------------- + -------------");
        System.out.println(36);
        System.out.println(+36);
        System.out.println(3+6);
        System.out.println(8+1);
        System.out.println("公孙离"+7+7);//公孙离77
        System.out.println(3+3+"艾琳");//6艾琳
        System.out.println(3+3+"艾琳"+(6+6));//6艾琳12

    }

}
