package Demo01;

import java.io.UncheckedIOException;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-26 07:50
 */


public class Demo01 {
/**
 * Error 错误
 * VirtualMachineError  虚拟机错误
 * Exception  异常
UncheckedIOException检查性异常
    RuntimeException
    非检查性异常
 异常的处理方法式： 捕获
 抛出

 */
public static void main(String[] args) {
    int divisor = 100;
    int dividend = 30;
    try{
        System.out.println(divisor/dividend);
        //报错: ArithmeticException 算数异常

    }catch(Exception  e){
        e.printStackTrace();
        System.out.println("捕获到一个异常");
    }finally {
        System.out.println("不管如何都会执行这里的代码");
    }
    System.out.println("hhhhhhhh");

}














}
