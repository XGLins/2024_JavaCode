/**
 * @author XGLins
 * @date 2024/5/8 15:50
 */
class HomeWork99 {
    public static void main(String[] args) {
        int count =0;
        for (int i = 2; i <=100 ; i+=2) {
            count++;
            if (count<5){
                System.out.print(i+",");
            }else {
                System.out.println(i);
                count=0;
            }
        }
    }
}
class HomeWork9 {
    public static void main(String[] args) {
        for (int i = 2; i <=100; i+=2) {
            //System.out.println(i);
            if(i%10!=0){
                System.out.print(i+",");
            }else{
                System.out.println(i);
            }
        }
    }
}
