package com.by.mapper;

import com.by.entity.Linerseat;

import java.util.List;

public interface LinerseatMapper {

    /**
     *
     *@描述 查询当天大afterNum天过后席位不正常的席位信息
     *@参数
     *@返回值
     *@创建人  wl
     *@创建时间
     *@修改人和其它信息
     *
     */
    public List<Linerseat> queryAbnormal(String currentTime,String afterTime);

}
