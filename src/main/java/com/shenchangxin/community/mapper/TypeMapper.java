package com.shenchangxin.community.mapper;

import com.shenchangxin.community.pojo.Type;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TypeMapper {

    Type findTypeById(Integer id);

    Type findTypeByName(String typeName);

}
