package com.app.util;

import com.app.entity.User;

/**
 * @program: busis
 * @description: 一些简单的工具方法
 * @author: Mr.Chen
 * @create: 2018-03-21 17:50
 **/
public class SimpleUtil {

    /**
     * 隐藏用户敏感信息
     * @param user
     * @return
     */
    public static User hideSensitiveInformation(User user){

        if (user != null){
            if(user.getPassword() == null || user.getPassword() != ""){
                user.setPassword("");
            }

            //判空处理
            if(user.getBirthday() == null){

            }
            if (user.getHead_portrail() == null){
                user.setHead_portrail("");
            }
            if (user.getIntroduce() == null){
                user.setIntroduce("");
            }
            if (user.getGender() != '1' && user.getGender() != '0'){
                user.setGender(' ');
            }
            if (user.getLongitude() == null){
                user.setLongitude("");
            }
            if (user.getLatitude() == null){
                user.setLatitude("");
            }

        }

        return user;
    }
}
