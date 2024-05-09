import java.util.Random;

/**
 * @author XGLins
 * @date 2024/5/9 16:43
 *
 * Math.random();[0,1)
 *
 */
public class RandomTest {
    public static void main(String[] args) {

        int i1 = 1;
        while (i1 <5){
            double random = Math.random();
            System.out.println("random = " + random);
            i1++;

        }

        //随机数对象
        Random r = new Random();
        while(i1<11){
            int i= r.nextInt(0, 10);
            System.out.println(i);
            i1++;
        }


    }
}
