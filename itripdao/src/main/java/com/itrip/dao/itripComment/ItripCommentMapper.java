package com.itrip.dao.itripComment;
import com.itrip.pojo.ItripComment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public interface ItripCommentMapper {

	public ItripComment getItripCommentById(@Param(value = "id") Long id)throws Exception;

	public List<ItripComment>	getItripCommentListByMap(Map<String, Object> param)throws Exception;

	public Integer getItripCommentCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertItripComment(ItripComment itripComment)throws Exception;

	public Integer updateItripComment(ItripComment itripComment)throws Exception;

	public Integer deleteItripCommentById(@Param(value = "id") Long id)throws Exception;

}
