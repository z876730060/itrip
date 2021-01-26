package com.itrip.dao.itripHotelTradingArea;
import com.itrip.pojo.ItripHotelTradingArea;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public interface ItripHotelTradingAreaMapper {

	public ItripHotelTradingArea getItripHotelTradingAreaById(@Param(value = "id") Long id)throws Exception;

	public List<ItripHotelTradingArea>	getItripHotelTradingAreaListByMap(Map<String, Object> param)throws Exception;

	public Integer getItripHotelTradingAreaCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertItripHotelTradingArea(ItripHotelTradingArea itripHotelTradingArea)throws Exception;

	public Integer updateItripHotelTradingArea(ItripHotelTradingArea itripHotelTradingArea)throws Exception;

	public Integer deleteItripHotelTradingAreaById(@Param(value = "id") Long id)throws Exception;

}
