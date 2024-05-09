/**
 * @author XGLins
 * @date 2024/5/9 15:54
 *
 * 初始化条件;
 * while(循环条件){
 *     循环体;
 *     迭代条件;
 * }
 *
 */
public class WhileTest {
    public static void main(String[] args) {

        //1.初始化条件
        int i = 1;

        while(i<6){
            //循环体
            System.out.println("HelloWorld\t"+ i);
            //迭代条件
            i++;
        }
        System.out.println("Game Over");

    }
}

class WhileTest2{
    public static void main(String[] args) {
        //100以内偶数的和
        int sumEvenNum = 0;
        int sumOddNum =0;

        int num = 1;
        while(num<101){
            if (num%2==0){
                sumEvenNum +=num;
            }else {
                sumOddNum+=num;
            }
            num++;


        }
        System.out.println("sumEvenNum = " + sumEvenNum);
        System.out.println("sumOddNum = " + sumOddNum);


    }
}