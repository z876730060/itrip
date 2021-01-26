package com.itrip.dao.itripTradeEnds;
import com.itrip.pojo.ItripTradeEnds;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public interface ItripTradeEndsMapper {

	public ItripTradeEnds getItripTradeEndsById(@Param(value = "id") Long id)throws Exception;

	public List<ItripTradeEnds>	getItripTradeEndsListByMap(Map<String, Object> param)throws Exception;

	public Integer getItripTradeEndsCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertItripTradeEnds(ItripTradeEnds itripTradeEnds)throws Exception;

	public Integer updateItripTradeEnds(ItripTradeEnds itripTradeEnds)throws Exception;

	public Integer deleteItripTradeEndsById(@Param(value = "id") Long id)throws Exception;

}
