package com.sun.demo2;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("detele");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg){
        System.out.println("[INFO] 使用了"+ msg +"方法");
    }
}
