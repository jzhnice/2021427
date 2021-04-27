package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-27 15:43
 */
public class sexException extends  Exception {
    public sexException() {
    }
    public sexException(String message) {
        System.out.println(message);
        System.out.println("我是自定义的异常，知道是非南非女，但是我没法处理");
        System.out.println(".......");
    }

}
