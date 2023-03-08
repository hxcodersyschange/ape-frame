package com.hx.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.user.entity.po.UserPo;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserPo> {
//    int updateByName(UserPo userPo);
}