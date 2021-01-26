package com.itrip.controller;

import com.itrip.common.DtoUtil;
import com.itrip.common.Page;
import com.itrip.dao.itripHotel.ItripHotelMapper;
import com.itrip.pojo.ItripHotel;
import com.itrip.pojo.SearchHotCityVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HotelListController {

    @Resource
    ItripHotelMapper hotelMapper;

    @RequestMapping(value = "/api/hotellist/searchItripHotelListByHotCity", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public Object hotellist(@RequestBody SearchHotCityVO vo) throws Exception {

        List<ItripHotel> list = hotelMapper.getItripHotelList(vo);

        Page<ItripHotel> page = new Page();

        page.setRows(list);

        return DtoUtil.returnDataSuccess(list);
    }
}
