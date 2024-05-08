/**
 * @author XGLins
 * @date 2024/5/8 9:28
 */
public class IfExer1 {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        //x==2,x++ false  x=2 左边为false
        //右边继续
        //++y  y==2  y=2  y==2成立 右边为true
        //false & true 结果为false
        if(x++ ==2 & ++y==2) {
            x = 7;
        }
        System.out.println("x: " + x + " ,y: " + y);//x:2,y:2

        //或
        int w = 1;
        int z = 1;
        if(w++ ==2 | ++z==2) {
            x = 7;
        }
        System.out.println("x: " + x + " ,y: " + y);//x:7,y:2
    }

}
