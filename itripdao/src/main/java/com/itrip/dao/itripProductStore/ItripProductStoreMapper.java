package com.itrip.dao.itripProductStore;
import com.itrip.pojo.ItripProductStore;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public interface ItripProductStoreMapper {

	public ItripProductStore getItripProductStoreById(@Param(value = "id") Long id)throws Exception;

	public List<ItripProductStore>	getItripProductStoreListByMap(Map<String, Object> param)throws Exception;

	public Integer getItripProductStoreCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertItripProductStore(ItripProductStore itripProductStore)throws Exception;

	public Integer updateItripProductStore(ItripProductStore itripProductStore)throws Exception;

	public Integer deleteItripProductStoreById(@Param(value = "id") Long id)throws Exception;

}
