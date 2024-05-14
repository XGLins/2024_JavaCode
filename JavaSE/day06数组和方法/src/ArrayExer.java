/**
 * @author XGLins
 * @date 2024/5/14 11:51
 *
 * page21
 */
public class ArrayExer {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30},{11,22,33},{123,456,789,1234}};
        //获取最大值 最小值
        //假设最大值
        int maxNum=arr[0][0];
        //假设最小值
        int minNum=arr[0][0];

        for (int[] eleArr : arr) {
            for (int ele : eleArr) {
                if (ele>maxNum){
                    maxNum=ele;
                }
                if (ele<minNum){
                    minNum = ele;
                }
            }
        }
        System.out.println("maxNum = " + maxNum);
        System.out.println("minNum = " + minNum);
    }
}
