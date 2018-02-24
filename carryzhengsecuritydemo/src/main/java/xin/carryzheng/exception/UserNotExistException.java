package xin.carryzheng.exception;

/**
 * @author zhengxin
 * @date 2018-02-23 11:22:04
 */
public class UserNotExistException extends RuntimeException {



    private String id;

    public UserNotExistException(String id){

        super("用户不存在！");
        this.id = id;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
