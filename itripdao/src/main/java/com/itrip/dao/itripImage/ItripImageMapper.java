package com.itrip.dao.itripImage;
import com.itrip.pojo.ItripImage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public interface ItripImageMapper {

	public ItripImage getItripImageById(@Param(value = "id") Long id)throws Exception;

	public List<ItripImage>	getItripImageListByMap(Map<String, Object> param)throws Exception;

	public Integer getItripImageCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertItripImage(ItripImage itripImage)throws Exception;

	public Integer updateItripImage(ItripImage itripImage)throws Exception;

	public Integer deleteItripImageById(@Param(value = "id") Long id)throws Exception;

}
