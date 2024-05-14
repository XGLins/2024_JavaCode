/**
 * @author XGLins
 * @date 2024/5/14 10:30
 */
/*
二维数组: 数组元素是一维数组的数组
二维数组的声明和初始化:
       声明:
           数据类型[][]数组名;
           数据类型[]数组名[];
           数据类型 数组名[][];
       初始化:
          静态初始化:
                 形式一: 数据类型[][]数组名 = {{值1,值2..},{值1,值2..}...};
                        声明和赋值必须在一起
                 形式二: 数据类型[][]数组名 = new 数据类型[][]{{值1,值2..},{值1,值2..}...};
                        声明和赋值可以分开
          动态初始化:
                形式一: 数据类型[][] 数组名 = new 数据类型[值1][值2];
                       值1:二维数组内一维数组的个数
                       值2:一维数组内元素的个数
                       规则矩形
                形式二: 数据类型[][] 数组名 = new 数据类型[值1][];
                      值1:二维数组内一维数组的个数
                      声明了一维数组的数量 具体的初始化需要单独完成
          注意:
             1.二维数组的长度 数组内一维数组的个数
             2.获取二维数组元素 数组名[一维数组的下标][一维数组内元素的下标]
             3.二维数组的元素是一维数组 一维数组不是基本数据类型所以 默认值为null
二维数组的遍历:
      普通for:
      增强for:


二维数组的内存图:


 */


import java.util.Arrays;

class DoubleArray03 {

    public static void main(String[] args) {
        System.out.println("----------动态 形式二-----------");

        int[] arri = new int[3];// 0 0 0

        int[][] iArr = new int[3][];

        iArr[0]=new int[]{3,6,9};
        iArr[1]=new int[]{30,60,90};
        iArr[2]=new int[6];


        System.out.println("iArr[0] = " + iArr[0]);


        System.out.println("----------动态 形式一-----------");

        int[][] arr = new int[3][6];
        System.out.println("arr.length = " + arr.length);
        System.out.println("arr[2].length = " + arr[2].length);

        System.out.println("arr[0][0] = " + arr[0][0]);


        double[][]dArr = new double[2][3];

        dArr[0][1]=66.6;


        System.out.println("dArr[0][0] = " + dArr[0][0]);


    }
}

class DoubleArray02 {

    public static void main(String[] args) {

        int[][] arr = {{10, 20, 30}, {33, 66}, {123, 456, 789}};

        boolean[][] bArr;
        bArr = new boolean[][]{{true, false}, {false, false, true}, {true, false}};
        //                                        0                     1                             2
        String[][] stars = new String[][]{{"蔡徐坤", "肖战", "胡歌"}, {"于谦", "吴亦凡", "李易峰"}, {"罗志祥", "彭于晏", "吴彦祖", "丁真"}};
        //                                 0       1     2
        //todo 二维数组的长度 一维数组的数量
        System.out.println("stars.length = " + stars.length);

        System.out.println("stars[0] = " + stars[0]);
        System.out.println("Arrays.toString(stars[0]) = " + Arrays.toString(stars[0]));//[蔡徐坤, 肖战, 胡歌]
        // 获取第1个一维数组中第3个元素
        System.out.println("stars[0][2] = " + stars[0][2]);

        System.out.println("stars[1][1] = " + stars[1][1]);//吴亦凡

        System.out.println("stars[2][1] = " + stars[2][1]);//彭于晏


    }

}

public class DoubleArray01 {
    public static void main(String[] args) {
        int[][] a;
        double[] d[];
        boolean b[][];
        int m;
        int[] mm;


        // System.out.println(a);


        String[] arr = {"李白", "杜甫"};

        String[] arr1 = {"安琪拉", "米莱迪", "妲己"};

        System.out.println("arr1 = " + arr1);// [Ljava.lang.String;@682a0b20


        String[][] arr2 = {arr, arr1};

        System.out.println("arr2 = " + arr2);//[[Ljava.lang.String;@214c265e

    }
}

