import java.util.Arrays;

/**
 * @author XGLins
 * @date 2024/5/13 17:45
 *
 * page8
 * 数组元素反转：
 *      10 20 30 40 50 60 70
 *
 *      70 60 50 40 30 20 10
 */
class ReverseTest2{
    public static void main(String[] args) {
        //1.创建数组
        int[] arr={10,20,30,40,50,60,70};

        //2.数组反转前输出
        System.out.println("反转前："+Arrays.toString(arr));

        //3.反转
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;

        }



        //数组反转后输出
        System.out.println("反转前："+Arrays.toString(arr));


    }
}

public class ReverseTest {
    public static void main(String[] args) {

        //1.创建数组
        int[] arr={10,20,30,40,50,60,70};

        //2.数组反转前输出
        System.out.print("数组反转前：");
        for (int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();

        //3.创建一个新数组
        int[] arr2 = new int[arr.length];
        int index = 0;
        for (int i = arr.length-1; i >=0; i--) {
            arr2[index] = arr[i];
            index++;
        }

        //4.将数组的地址赋值给旧数组
        arr=arr2;
        System.out.println(arr);
        System.out.println(arr2);

        System.out.print("数组反转后：");
        for (int num : arr) {
            System.out.print(num+" ");
        }

    }
}
