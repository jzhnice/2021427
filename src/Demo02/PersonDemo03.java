package Demo02;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-26 07:52
 */
public class PersonDemo03 extends Exception {
    private static final long serialVersiouUid = 1L;
    public PersonDemo03(){
        super();
    }
    public PersonDemo03(String message){
        super(message);
    }

    public PersonDemo03(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonDemo03(Throwable cause) {
        super(cause);
    }

    public PersonDemo03(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
