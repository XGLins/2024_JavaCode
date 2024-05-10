/**
 * @author XGLins
 * @date 2024/5/10 17:17
 */
public class ReturnTest {
    public static void main(String[] args) {
        /*
        当i等于3的时候 结束main方法
        */
        for (int i = 1; i <11 ; i++) {
            if (i==3){
                return;
            }
            System.out.println("你好世界\t" + i);
        }
    }
}
