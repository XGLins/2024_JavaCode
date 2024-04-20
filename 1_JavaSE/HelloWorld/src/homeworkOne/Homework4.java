package homeworkOne;

/**
 * @author XGLins
 * @date 2024/4/20 18:55
 *
 * 4、定义圆周率PI
 */
public class Homework4 {
    public static void main(String[] args) {
        //使用final定义变量，用来表示圆周率并赋值为3.14
        final double PI = 3.14;

        //使用3个变量分别保存圆的半径，分别赋值为1.2、2.5、6
        double radiusOne = 1.2;
        System.out.println("radiusOne=" + radiusOne +
                ",area = " + PI * radiusOne * radiusOne);

        double radiusTwo = 2.5;
        System.out.println("radiusTwo=" + radiusTwo +
                ",area = " + PI * radiusTwo * radiusTwo);

        int radiusThree = 6;
        System.out.println("radiusThree=" + radiusThree +
                ",area = " + PI * radiusThree * radiusThree);


    }
}
