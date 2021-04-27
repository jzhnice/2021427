package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-26 07:51
 */
public class Demo05 {

        public static void main(String[] args)   {            //急促向上声明异常，不处理
            try {
                setSsx("双性人");
            }catch (Exception e){   // 调用者处理异常

                System.out.println("调用者说处理过了");
            }


        }
        public static  void setSsx(String  sex) throws Exception{
            if(!(sex.equals("男") || sex.equals("女"))){
                throw new sexException("发现一个不对劲的");
            }
        }
    }

