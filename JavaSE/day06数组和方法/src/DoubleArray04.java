/**
 * @author XGLins
 * @date 2024/5/14 11:39
 */
public class DoubleArray04 {

    public static void main(String[] args) {

        int[][] arr={{23,24,25,26},{34,35,36,37},{45,46,47,48}};

        int count=0;
        System.out.println("------增强for-----------");
        for (int[] eleArr : arr) {
            System.out.print("arr二维数组"+count +"：" );
            for (int ele:eleArr){
                System.out.print(ele +" ");
            }
            System.out.println();
            count++;
        }
        System.out.println("------普通for-----------");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr二维数组"+i +"：" );
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
