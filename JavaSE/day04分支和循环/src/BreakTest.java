/**
 * @author XGLins
 * @date 2024/5/10 16:57
 */
public class BreakTest {

    public static void main(String[] args) {

        /*
        当i等于3的时候 结束当前循环
        */
        for (int i = 1; i <11 ; i++) {
            if (i==3){
                break;
            }
            System.out.println("你好世界\t" + i);

        }

        System.out.println("Game Over");


    }

}
