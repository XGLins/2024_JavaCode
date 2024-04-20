package homeworkTwo;

import com.sun.security.jgss.GSSUtil;

/**
 * @author XGLins
 * @date 2024/4/20 19:50
 *
 * 3、强制类型转换练习，效果如图所示：
 */
//定义类 Homework1
public class Homework1 {
    //定义 main方法
    public static void main(String[] args) {
        //定义2个double类型变量x、y，x赋值为100.8，y赋值为20.6
        double x =100.8;
        double y =20.6;

        //定义新变量add，保存变量x，y的和并打印到控制台
        double add;
        add = x + y;
        System.out.println("x,y的和为: " + add);

        //定义新变量sub，保存变量x，y的差并打印到控制台
        double sub = x-y;
        System.out.println("x,y的差为: " + sub);

        //定义新变量mul，保存变量x，y的积并打印到控制台
        double mul = x*y;
        System.out.println("x,y的积为：" + mul);
        //定义新变量div，保存变量x，y的商并打印到控制台
        double div = x/y;
        System.out.println("x,y的商为：" + div);


    }
}
