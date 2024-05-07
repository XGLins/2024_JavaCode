/**
 * @author XGLins
 * @date 2024/4/25 11:13
 *
 * 将其他进制数转为10进制展示
 * 所有的数据都是以二进制的形式存储
 * 1个0或1就占用一个bit位
 * 8bit = 1byte（字节）
 * 1024byte = 1MB
 * 1024MB = 1GB
 * 1024GB = 1TB
 * 1024TB = 1PB
 *
 */
public class FeelTheBase {
    public static void main(String[] args) {
        System.out.println("------进制转换------");

        //十进制直接在输出语句中输入数字就可以
        System.out.println("十进制的110的十进制是："+110);

        //二进制使用0b或0B来表示，0b110表示十进制的6
        System.out.println("二进制0b110转换的十进制是："+0b110);

        //八进制使用0来表示，010表示十进制的8
        System.out.println("八进制010转换的十进制是："+010);

        //十六进制使用0x来表示，0x10表示十进制的16
        System.out.println("十六进制0x10转换的十进制是："+ 0x10);


    }
}
