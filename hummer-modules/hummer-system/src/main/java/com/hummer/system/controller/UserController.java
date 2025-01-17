package com.hummer.system.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hummer.common.core.domain.User;
import com.hummer.common.core.domain.request.member.EditPassWordRequest;
import com.hummer.common.core.domain.request.member.UserRequest;
import com.hummer.common.core.dto.UserDTO;
import com.hummer.common.core.dto.UserRoleDTO;
import com.hummer.common.core.handler.annotation.I18n;
import com.hummer.common.core.utils.PageUtils;
import com.hummer.common.core.utils.Pager;
import com.hummer.common.security.service.TokenService;
import com.hummer.system.api.model.LoginUser;
import com.hummer.system.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@Tag(name = "用户")
@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;

    @I18n
    @Operation(summary = "添加用户")
    @PostMapping("/special/add")
    public UserDTO insertUser(@RequestBody UserRequest user) throws Exception {
        return userService.insert(user, tokenService.getLoginUser());
    }

    @I18n
    @Operation(summary = "用户列表")
    @PostMapping("/special/list/{goPage}/{pageSize}")
    public Pager<List<User>> getUserList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody UserRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, userService.getUserListWithRequest(request));
    }

    @I18n
    @Operation(summary = "用户角色")
    @GetMapping("/special/user/role/{userId}")
    public UserRoleDTO getUserRole(@PathVariable("userId") String userId) {
        return userService.getUserRole(userId);
    }

    @Operation(summary = "删除用户")
    @GetMapping("/special/delete/{userId}")
    public void deleteUser(@PathVariable(value = "userId") String userId) throws Exception {
        userService.deleteUser(userId, tokenService.getLoginUser());
    }

    @Operation(summary = "更新用户")
    @PostMapping("/special/update")
    public void updateUser(@RequestBody UserRequest user) {
        userService.updateUserRole(user);
    }

    @Operation(summary = "更新用户状态")
    @PostMapping("/special/update_status")
    public void updateStatus(@RequestBody User user) {
        userService.updateUser(user);
    }

    @I18n
    @Operation(summary = "所有用户")
    @GetMapping("/list/all")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @Hidden
    @PostMapping("/update/current")
    public UserDTO updateCurrentUser(@RequestBody User user) throws Exception {
        userService.updateUser(user);
        LoginUser loginUser = tokenService.getLoginUser();
        loginUser.getUser().setLanguage(user.getLanguage());
        tokenService.setLoginUser(loginUser);
        return userService.getUserDTO(user.getId());
    }

    @I18n
    @Operation(summary = "用户信息")
    @GetMapping("/info/{userId}")
    public UserDTO getUserInfo(@PathVariable(value = "userId") String userId) throws Exception {
        return userService.getUserInfo(userId);
    }

    /**
     * 修改当前用户密码
     */
    @Operation(summary = "修改用户密码")
    @PostMapping("/update/password")
    public int updateCurrentUserPassword(@RequestBody EditPassWordRequest request) throws Exception {
        return userService.updateCurrentUserPassword(request, tokenService.getLoginUser());
    }

    /**
     * 管理员修改用户密码
     */
    @Hidden
    @PostMapping("/special/password")
    public int updateUserPassword(@RequestBody EditPassWordRequest request) throws Exception {
        return userService.updateUserPassword(request, tokenService.getLoginUser());
    }

    @Hidden
    @GetMapping("/search/{condition}")
    public List<User> searchUser(@PathVariable String condition) {
        return userService.searchUser(condition);
    }

    /*Get default language*/
    @Hidden
    @GetMapping(value = "/language")
    public String getDefaultLanguage() {
        return userService.getDefaultLanguage();
    }

    @Operation(summary = "批量删除用户")
    @PostMapping("deleteUsers")
    public void deleteUsers(@RequestBody List<String> selectIds) throws Exception {
        userService.deleteUsers(selectIds, tokenService.getLoginUser());
    }

}
