# Java面向对象编程：异常



在理想状态下，用户输入数据的格式永远都是正确的，选择打开的文件也一定存在，并且永远不会出现错误，但真实情况并非如此。

## 异常：

假如在一个Java程序运行期间出现了一个错误。这个错误可能是由于文件包含了了错误信息，或者网络连接出现问题造成的，等等，用户期望在出现错误时，程序能够采用一些理智的行为。如果由于出现错误而使得某些错做没有完成，程序应该：

（1）返回一个安全状态，并能够让用户执行一些其他的命令

（2）允许用户保存所有操作的结果，并以妥善的方式终止程序

如果某个方法不能够采用正常的途径完成然的任务，就可以通过另外一个路径退出方法，在这种情况下，方法不返回任何值，而是抛出（throw）一个封装了错误信息的对象，需要注意的是，这个方法将会立即推出，并不返回任何值，此外，调用这个方法的代码也将无法继续执行，取而代之的是，异常处理机制开始搜索能够处理这种异常状况的异常处理器

[图片上传失败...(image-c46627-1620871624024)]

在Java中，异常的顶级父类是 Throwable ，下面有2个分支：

1. Error： 错误是Java程序中无法处理的，通常是 Java 虚拟机的报错。

   我们通常根据报错查找程序中的代码，分析引起 Error 的原因。

2. Exception：异常才是在Java程序中可以处理的方式。异常有2不同的分类，

   主要是检查性异常和非检查性异常。**所有的异常都以 Exception 结尾。**

## Exception又分为检查行异常和非检查行异常

## （1)检查行异常：

javac强制要求程序员为这样的异常做预备处理工作，否则编译不通过。这样的异常一般是由程序的运行aS环境导致的。因为程序可能错

在被运行在各种位置的环境下，而程序员无法干预用户如何使用他编写的陈鼓型，于是程序员就应该为这样的一场环境时刻准备着。

## （2）非检查行异常：

javac在编译时，不会提示和发现这样的异常，我们应该编写代码处理也可以不处理，对于这些异常，我们应该修正代码，而不是去通过异常处理器处理。这杨的异常发生的原因多半时代码写的有问题，比如错误地强制类型转换错误，又或者使用了空对象

## 异常的处理方式：

对于编译期异常处理有两种不同的处理方式。

###### （1) 使用try{} catch {} finally 语句块处理他

###### （2）在函数签名中使用throws声明交给函数调用者去解决

## try {} catch {} finally块

try {} catch {} finally块是异常的捕获，其本质是判断，基本语法如下：

```java
 try{
  可能出现异常的代码（包括不会出现异常的代码）

  }catch(Exception  e){    // 括号里面接受try 代码块中出现的异常类型
  如果出现异常的处理代码
  }finally {
  不管代码是正常运行还是出现异常需要处理，finally代码块中的代码最终都会执行
 }</pre>
```



案例代码：

```java
 package Demo01;
 import java.io.UncheckedIOException;
 /**
  * @version 1.0
  * @author: jiazhihao
  * @date: 2021-04-26 07:50
    */
 public class Demo01 {

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
 }</pre>
```



try catch程序块本质就是判断，首先执行的是try语句块中的语句，这时会有以下几种情况。

（1）：如果try中所有语句正常执行完毕，不会发生异常，那么catch块中的所有语句都将会被忽略

（2）：如果try语句块在执行过程中遇到异常，并且这个异常与catch中声明的异常匹配，那么在try块中其余的代码都将被忽略，而相应的catch块将会被执行。

如果try语句块在执行过程中遇到异常，而抛出的异常在catch中没有被声明，那么程序立刻退出。

printStackTrace方法：输出异常的堆栈信息。

getMessage方法：返回异常信息描述字符串。

## 抛出异常throws和throw

如果在一个方法体中抛出了异常，我们希望调用者能够及时驳货异常，那么如何通知调用者呢？

抛出异常就是当前代码不做异常的处理，通过 throws 和 throw 将异常抛给调用者处理。

1. throw ：声明可能要抛出的异常类型，通常在方法内部会出现错误的地方使用。

2. throws：在方法定义时指定抛出的异常类型。可以指定多个异常，使用逗号分开。抛出的异常和方法内使用 throw 声明抛出的异常类型匹配。


   ```java
    package Demo01;
    /**
     * @version 1.0
     * @author: jiazhihao
     * @date: 2021-04-26 07:51
       */
        public class Demo04 {
         public static void main(String[] args)  throws  Exception {            //急促向上声明异常，不处理
         /* try {
         setSsx("双性人");
         }catch (Exception e){   // 调用者处理异常
         e.printStackTrace();
         System.out.println("非男非女");
         } */
   
     setSsx("sasd") ;
     }
     public static  void setSsx(String  sex) throws Exception{
     if(!(sex.equals("男") || sex.equals("女"))){
     throw new Exception("处理不了的异常，扔出去");
    //             throws Exception     声明异常
    //            throw new Exception   抛出异常
     }
     }
    }
   ```



### throws和throw区别：

（1）：作用不同：throw用于在程序中抛出异常；throws用于声明在该方法内抛出了异常

（2）：使用的位置不同：throw位于方法体内部，可以作为单独语句使用；throws必须跟在方法参数列表后面，不能单独使用

（3）：内容不同：throw抛出一个异常对象，而且只能是一个；throws后面个异常类，而且可以跟多个异常类。

## 自定义异常

在复杂业务环境下，Java自带的异常可能不能满足我么业务的需求，这个时候我们可以自定义异常来进行对业务异常的处理

语法格式：

```java
public class 自定义异常 extends java.lang.Exception{
}
```



注意：

自定义异常类一般都是以Exception结尾的

自定义异常类，必须继承Exception 或者 RuntimeException.

继承Exception，那么自定义的异常类就是一个编译器异常，如果方法内部抛出了编译期异常，就必须处理这个异常，要么 throws，要么 try...catch.

###### 继承RuntimeException，那么自定义的异常类就是一个运行期异常，无须处理，交给虚拟机处理
异常：
小异常写在前面
大异常写在后面