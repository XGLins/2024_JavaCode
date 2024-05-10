/**
 * @author XGLins
 * @date 2024/5/10 17:16
 */
public class ContinueTest {
    public static void main(String[] args) {
        /*
        当i等于3的时候 跳过
        */
        for (int i = 1; i <11 ; i++) {
            if (i==3){
                continue;
            }
            System.out.println("你好世界\t" + i);

        }
    }
}
