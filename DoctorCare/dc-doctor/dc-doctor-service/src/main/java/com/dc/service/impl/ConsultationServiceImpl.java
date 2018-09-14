package com.dc.service.impl;

import com.dc.common.pojo.EasyUIDataGridResult;
import com.dc.mapper.TbConsultationMapper;
import com.dc.pojo.TbConsultation;
import com.dc.service.ConsultationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationServiceImpl implements ConsultationService {
    @Autowired
    private TbConsultationMapper  tbConsultationMapper;

    @Override
    public List<TbConsultation> getConsultationByName() {
        List<TbConsultation> list =  tbConsultationMapper.getConsultationByName();
        System.out.println(list);
       return list;
    }

    @Override
    public EasyUIDataGridResult getTbConsultation(int page, int rows) {
        //设置分页信息
        PageHelper.startPage(1, 30);
        //得的所以商品信息
        List<TbConsultation> list = tbConsultationMapper.getTbConsultation();
        //取分页信息
        PageInfo<TbConsultation> pageInfo = new PageInfo<>(list);

        //创建返回结果对象
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal((int) pageInfo.getTotal());
        result.setRows(list);
        System.out.println(list);
        return result;
    }
}
