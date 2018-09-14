package com.dc.service.impl;

import com.dc.mapper.TbEarlywarmMapper;
import com.dc.pojo.TbEarlywarm;
import com.dc.service.EarlywarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EarlywarmServiceImpl implements EarlywarmService {
    @Autowired
    private TbEarlywarmMapper tbEarlywarmMapper;

    @Override
    public List<TbEarlywarm> getEarlywarmById() {
        List<TbEarlywarm> list = tbEarlywarmMapper.getEarlywarmMapperById();
        return list;
    }
}
