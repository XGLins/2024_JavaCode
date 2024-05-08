/**
 * @author XGLins
 * @date 2024/5/7 14:50
 *
 * 逻辑运算符：
 *      &：与     两边表达式都为true 结果才是true
 *      |：或     只要有一个表达式为true 结果就是true
 *      ^：异或   相同为false 不同为true
 *      ！非      取反
 *      ------------------
 *      &&：短路与  当前边的表达式为false 就不再计算后面的表达式
 *      ||：短路或  当前边的表达式为true 就不再计算后面的表达式
 *
 * 注意：
 *   1.连接布尔类型表达式
 *   2.& 和 &&
 *     | 和 || 不会更改布尔表达式的结果
 */
class OperatorTest2 {

    public static void main(String[] args) {
        boolean t1 = true, t2 = true, f1 = false, f2 = false;

        System.out.println("-------------短路||------------------");
        int a = 10, b = 20;
//        boolean r = b > a | ++a > b;//true  11
        boolean r = b > a || ++a > b;//true 10
        System.out.println("r=" + r + "，a=" + a);

        System.out.println("-------------短路&&------------------");
        int m = 10, n = 5;

//        boolean result = n>m & ++m>n;//false , 11

        boolean result = n > m && ++m > n;//false , 10

        System.out.println("result = " + result + ",m = " + m);


        System.out.println("-------------||------------------");
        System.out.println(f1 || f2 || f1 || f2 || t1);//true
        System.out.println(f1 || f2 || f1 || f2);//false

        System.out.println("-------------&&------------------");
        System.out.println(t1 && t2 && t1 && t2 && f1);//false
        System.out.println(t1 && t2 && t1 && t2);//true


    }
}

class OperatorTest1 {

    public static void main(String[] args) {
        boolean t1 = true;
        boolean t2 = true;
        boolean f1 = false;
        boolean f2 = false;

        System.out.println(5 > 3 & 6 > 2);//true
        System.out.println(5 > 3 ^ 6 > 2);//false

        System.out.println("-------------!------------------");
        System.out.println(!t1);//false
        System.out.println(!f1);//true

        System.out.println("-------------^------------------");
        System.out.println(t1 ^ t2);//false
        System.out.println(f1 ^ f2);//fale
        System.out.println(f1 ^ t2);//true
        System.out.println(t1 ^ f2);//true

        System.out.println("-------------|------------------");
        System.out.println(f1 | f2 | f1 | f2 | t1);//true
        System.out.println(f1 | f2 | f1 | f2);//false

        System.out.println("-------------&------------------");
        System.out.println(t1 & t2 & t1 & t2 & f1);//false
        System.out.println(t1 & t2 & t1 & t2);//true


    }

}
