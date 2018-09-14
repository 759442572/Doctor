package com.dc.service;

import com.dc.common.pojo.EasyUIDataGridResult;
import com.dc.pojo.TbConsultation;

import java.util.List;

public interface  ConsultationService {
    /**
     * 根据老人姓名查询咨询问题
     * @param conName 老人姓名
     * @return  问题相关信息
     */
    List<TbConsultation> getConsultationByName();

    /**
     *根据页面传递过来的参数，分页显示信息
     * @param page 当前页
     * @param rows 每页显示的信息条数
     * @return 总记录条数+每一个查询信息
     */


    EasyUIDataGridResult getTbConsultation(int page,int rows);


}
