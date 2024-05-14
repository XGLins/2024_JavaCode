import java.util.Arrays;

/**
 * @author XGLins
 * @date 2024/5/14 9:58
 */
public class BubbleSort {
    public static void main(String[] args) {
        //创建数组
        int[] arr = {70, 60, 50, 40, 30, 20, 10};
        System.out.println("排序前="+Arrays.toString(arr)+"\n");
        //排序
        for (int i = 0; i < arr.length - 1; i++) {

            //假设此次排序数组有序
            boolean flag = true;

            for (int j = 0; j < arr.length - 1-i; j++) {
                //如果前一个数>后一个数 则进行位置交换
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //如果前一个>后一个数的情况产生 则假设失败
                    flag=false;
                }
            }
            //如果没有一个>后一个 则有序 则结束程序
            if(flag){
                break;
            }
            System.out.println("排序中="+Arrays.toString(arr));

        }
        System.out.println("\n排序后="+Arrays.toString(arr));


    }
}
