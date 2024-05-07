/**
 * @author XGLins
 * @date 2024/5/7 13:56
 *
 * 赋值运算符：
 *      =
 *      +=
 *      -=
 *      *=
 *      /=
 *      %=
 * 注意：
 *      赋值运算符不会改变原有的数据类型
 */
class OperatorTest2 {
    public static void main(String[] args) {
        int m = 10;

        m += 20;//m =m+20;
        System.out.println("m=" + m);

        m *= 3;//m =m*3;
        System.out.println("m=" + m);

        byte b1 = 60;
        b1+=10;//b1 = b1+10;
        System.out.println("b1=" + b1);

        int n = 30;
        n/=3;//n =n/3;
        System.out.println("n=" + n);

        n%=6;//n =n%6;
        System.out.println("n=" + n);

        char c ='a';
//        char c2=(char)(c-32);
//        System.out.println("c2=" + c2);
        c-=32;
        System.out.println("c=" + c);

    }

}
