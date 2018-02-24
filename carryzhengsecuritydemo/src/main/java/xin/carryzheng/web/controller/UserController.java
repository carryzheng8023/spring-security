package xin.carryzheng.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import xin.carryzheng.dto.User;
import xin.carryzheng.dto.UserQueryCondition;
import xin.carryzheng.exception.UserNotExistException;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengxin
 * @date 2018-02-19 18:18:56
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/me")
    public Object getCurrentUser(@AuthenticationPrincipal UserDetails userDetails){


        return userDetails;
    }


//    @GetMapping("/me")
//    public Object getCurrentUser(Authentication authentication){
//
////        return SecurityContextHolder.getContext().getAuthentication();
//
//        return authentication;
//    }


    @DeleteMapping("/{id:\\d+}")
    public void delete(@PathVariable String id){

        System.out.println(id);

    }


    @PutMapping("/{id:\\d+}")
    public User update(@RequestBody @Valid User user, BindingResult errors){

        if(errors.hasErrors()){
            errors.getAllErrors().stream().forEach(error -> {

//                FieldError fieldError = (FieldError)error;
//
//                String message = fieldError.getField() + " " + error.getDefaultMessage();

                System.out.println(error.getDefaultMessage());


            });
        }

        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getBirthday());

        user.setId("1");

        return user;

    }



    @PostMapping
    public User create(@RequestBody @Valid User user, BindingResult errors){

        if(errors.hasErrors()){
            errors.getAllErrors().stream().forEach(error -> System.out.println(error.getDefaultMessage()));
        }

        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getBirthday());

        user.setId("1");

        return user;

    }


    @GetMapping
    @JsonView(User.UserSimpleView.class)
    @ApiOperation(value = "用户查询服务")
    public List<User> query(UserQueryCondition condition, @PageableDefault(page = 2, size = 17, sort = "username, asc")Pageable pageable){


        System.out.println(ReflectionToStringBuilder.toString(condition, ToStringStyle.MULTI_LINE_STYLE));

        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getSort());

        List<User> users = new ArrayList<>();

        users.add(new User());
        users.add(new User());
        users.add(new User());

        return users;
    }

    @GetMapping("/{id:\\d+}")
    @JsonView(User.UserDetailView.class)
    public User getInfo(@ApiParam(value = "用户id") @PathVariable String id){

//        throw new UserNotExistException(id);

        System.out.println("进入getInfo服务");

        User user = new User();

        user.setUsername("tom");

        return user;

    }



}
