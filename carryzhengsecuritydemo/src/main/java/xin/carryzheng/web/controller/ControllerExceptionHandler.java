package xin.carryzheng.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import xin.carryzheng.exception.UserNotExistException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhengxin
 * @date 2018-02-23 11:26:56
 */
@ControllerAdvice
public class ControllerExceptionHandler {


    @ExceptionHandler(UserNotExistException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> handleUserNotExistException(UserNotExistException ex){

        Map<String, Object> result = new HashMap<>();
        result.put("id", ex.getId());
        result.put("message", ex.getMessage());

        return result;
    }

}
