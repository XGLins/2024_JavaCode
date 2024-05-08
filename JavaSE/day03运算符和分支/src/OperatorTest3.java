/**
 * @author XGLins
 * @date 2024/5/7 15:41
 *
 * 条件运算符/三元运算符/三目运算符：
 *      X?Y:Z;
 *      X:true ---> Y
 *      X:false ---> Z
 *
 */
public class OperatorTest3 {

    public static void main(String[] args) {

        boolean b = false;
        //              X?   Y       Z
        String result = b?"公孙离":"马克";
        System.out.println(result);

        int age = 19;
        result = age >=18?"成年了":"未成年";
        System.out.println(result);

        int m = 10,n = 20;
        int maxNum = m>n?m:n;
        System.out.println("maxNum = "+maxNum);

        boolean flag = true;
        //result = flag=false?"项羽":"吕布";//报错：等号是赋值
        result = (flag=false)?"项羽":"吕布";
//        result = flag==false?"项羽":"吕布";
        System.out.println("result = " + result);




    }

}
