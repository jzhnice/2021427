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
