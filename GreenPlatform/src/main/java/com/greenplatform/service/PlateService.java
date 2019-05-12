package com.greenplatform.service;


import com.greenplatform.model.*;
import com.greenplatform.model.base.ReturnModel;

import java.util.List;

public interface PlateService {
    /*public ReturnModel checkLogin(PlateUser plateUser);

    public ReturnModel selectPlateuserByEmail(PlateUser plateUser);//验证注册用户邮箱

    public ReturnModel selectPlateuserByLoginname(PlateUser plateUser);//验证注册用户会员名

    public ReturnModel insertUser(PlateUser plateUser);*/

    /*平台用户操作brgin*/
    public ReturnModel selectPlateuser(PlateUser plateUser);//查询平台用户信息

    public ReturnModel insertPlateuser(PlateUser plateUser);//插入平台用户信息

    public ReturnModel delPlateuser(PlateUser plateUser);//删除平台用户信息

    public ReturnModel updPlateuser(PlateUser plateUser);//修改平台用户
    /*平台用户操作end*/

    /*代码类别操作begin*/
    public ReturnModel selectPlateCodeDmlb (PlateCodeDmlb plateCodeDmlb);//查询代码类别

    public ReturnModel insertPlateCodeDmlb (PlateCodeDmlb plateCodeDmlb);//插入代码类别

    public ReturnModel delPlateCodeDmlb(PlateCodeDmlb plateCodeDmlb);//删除代码类别

    public ReturnModel updPlateCodeDmlb(PlateCodeDmlb plateCodeDmlb);//修改代码类别
    /*代码类别操作end*/

    /*代码值操作begin*/
    public ReturnModel selectPlateCodeDmz (PlateCodeDmz plateCodeDmz);//查询代码值

    public ReturnModel insertPlateCodeDmz (PlateCodeDmz plateCodeDmz);//插入代码值

    public ReturnModel delPlateCodeDmz (PlateCodeDmz plateCodeDmz);//删除代码值

    public ReturnModel updPlateCodeDmz (PlateCodeDmz plateCodeDmz);//修改代码值
    /*代码值操作end*/

    /*日志表操作begin*/
    public ReturnModel selectPlateLog (PlateLog plateLog);//查询代码值

    public ReturnModel insertPlateLog (PlateLog plateLog);//插入代码值
    /*日志表操作end*/

}
