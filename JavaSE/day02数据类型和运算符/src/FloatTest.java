/**
 * @author XGLins
 * @date 2024/4/25 19:55
 *
 * 小数存储：遵从IEEE规范
 *          符号位 指数位 尾数位
 *    float     4    单精度
 *    double    8   双精度     默认数据类型
 *
 * 注意：
 *      1.浮点类型默认的数据类型是double
 *      2.想要声明float类型的数据 需要在数值的末尾＋f/F
 *      3.小数是约数 无法表示精确内容 如果需要精确表示多位小数可以使用 BigDecimal
 *
 */
public class FloatTest {

    public static void main(String[] args) {

        double  d = 3.14;

        System.out.println("d = " + d);
        //不兼容的类型：从double转换到float可能会有损失
        //float f = 6.66;
        float f = 6.66F;

        System.out.println("f = " + f);

        double d1 = 3.4E3;//3.4*10^3
        System.out.println("d1 = " + d1);//3400.0

    }
}
