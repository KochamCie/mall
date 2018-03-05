package com.hama.user.dao;

import com.hama.user.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: hama
 * @date: created in  2018/3/5
 * @description:
 */
@Mapper
public interface  UserDAO {

    /**
     * 查询用户信息
     * @return 查询结果
     */
    List<UserEntity> findUsers();

}
