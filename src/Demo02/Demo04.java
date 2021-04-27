package Demo02;
/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-26 07:52
 */
public class Demo04 {


    public static void setSex(String sex) throws Exception {
        if( !"男".equals(sex) || !"女".equals(sex) ) {
            throw new PersonDemo03("性别只能是男或者女");
        }
    }

    public static void main(String[] args) {

        try {
            setSex("男");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

