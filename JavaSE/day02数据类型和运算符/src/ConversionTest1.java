/**
 * @author XGLins
 * @date 2024/5/7 9:23
 *
 * byte  1
 * short 2
 * char  2
 * int   4
 * long  8
 * float 4
 * double 8
 *
 * 基本数据类型的转换：
 *   自动类型提升：
 *      1.将小的数据类型的值赋值给大的数据类型
 *      2.多个数据类型的值做运算结果是大的数据类型
 *   强制类型转换：
 *      1.将大的数据类型的值赋值给小的数据类型
 *      2.小的数据类型 变量名 = (小的数据类型) 大的数据类型的值;
 *   注意：
 *      1.小数强制转换为整数 舍弃小数部分
 *      2.整数强制转换 能存储多少位就存储多少位 多余舍弃
 *      3.byte short int char 三个数据类型的变量相加 结果是int类型
 *
 */
class ConversionTest3{
    public static void main(String[] args) {
        byte b1 = 10 + 10;
        System.out.println("b1=" + b1);
        short s1= 20+20;
        System.out.println("s1=" + s1);
        char c1 ='0'+'1';
        System.out.println("c1=" + c1);

        //short s2 = b1+s1;
       // System.out.println("s2=" + s2);
        //char c2 = c1 + c1;

    }
}

class ConversionTest2{
    public static void main(String[] args) {

        double d = 3.14;
        //int i = d;
        //小的数据类型 变量名 = (小的数据类型) 大的数据类型的值;
        int i = (int)d;
        System.out.println("i = " + i);

        /*
        0000 0001 0010 1100

        0010 1100
        */
        int num = 300;
        byte b = (byte)num;
        System.out.println("b = " + b);//44
        /*
        0000 0000 0000 0000 0000 0000 1100 1000
        补码 1100 1000
        反码：1100 0111
        原码：1011 1000
         */
        num = 200;
        byte b1 = (byte)num;
        System.out.println("b1=" + b1);//-56

        int n = 97;
        char c = (char)n;
        System.out.println("c=" + c);//a


    }
}

class ConversionTest1 {

    public static void main(String[] args) {

        System.out.println("-------------自动类型提升方式二------------------");
        long m = 10+20L;
        System.out.println("m= " + m);

        double f1 = 3.14+20+30L;
        System.out.println("f1= " + f1);


        System.out.println("-------------自动类型提升方式二------------------");
        byte b = 10;
        int i =b;
        System.out.println("i = " + i);

        char c = 'A';
        int i1 = c;
        System.out.println("i1 = " + i1);

        long l =20L;
        float f = l;
        System.out.println("f = " + f);

    }

}
