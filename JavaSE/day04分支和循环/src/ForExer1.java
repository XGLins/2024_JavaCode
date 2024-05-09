/**
 * @author XGLins
 * @date 2024/5/9 14:28
 *
 * 1~100内偶数的和
 *    1.1~100内所有的数
 *    2.筛选偶数
 *    3.对偶数进行求和
 * 当程序内需要一个变量记录数据 自己创建变量
 *    变量的位置如何思考？
 *        记录的是总变化：变量定义再循环的外部
 *        记录的是单个个体变化：变量定义再循环的内部
 *
 */
public class ForExer1 {
    public static void main(String[] args) {
        //1到100内偶数的和
        int sumEvenNum = 0;//偶数
        int sumOddNum =0;
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                sumEvenNum +=i;
            }else{
                sumOddNum +=i;
            }

        }
        System.out.println("sumEvenNum = " + sumEvenNum);
        System.out.println("sumOddNum = " + sumOddNum);

        //1到100的和
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum +=i;
        }
        System.out.println("sum = " + sum);
    }
}

/*
1~100内能被3整除的数的数量
    1.获取1~100内的数
    2.筛选能for被3整除
    3.记录数量
*/
class ForExer2{
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <101 ; i++) {
            if (i%3==0) {
                //System.out.println(i);
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
class ForExer3{
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <101 ; i+=3) {
//            System.out.println("i = " + i);
            count++;
        }
        System.out.println("count = " + (count-1));
    }
}

class ForExer8{
    public static void main(String[] args) {

        for (int i = 1; i <201 ; i++) {
            String s = "";
            //对数据校验
            if (i%3==0){
                s+=" foo ";
            }
            if (i%5==0){
                s+=" biz ";
            }
            if (i%7==0){
                s+=" baz ";
            }
            System.out.println(i+s);
        }
        ;
    }
}