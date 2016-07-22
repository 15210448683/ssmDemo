package com.cn.person.daoMapper;

import org.apache.ibatis.annotations.Select;


public interface PersonMapper {
	
	@Select("select person_name from person where id_num=#{idNum}")
	String selectNameByIdNum(String idNum);
	
    
}
    