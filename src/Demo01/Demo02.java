package Demo01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-26 07:51
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] a = new int[2];
        Scanner scanenr = new Scanner(System.in);


        try {

            System.out.println("请输入");
            int i = scanenr.nextInt();
            System.out.println("请输入");
            int j = scanenr.nextInt();

            a[0] = i ;
            a[2] = j ;
            System.out.println(a[0] / a[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界了");
        } catch (InputMismatchException e) {
            System.out.println("数据格式不正确异常");
        } catch (ArithmeticException e) {
            System.out.println("算术异常");
        }
    }
}
