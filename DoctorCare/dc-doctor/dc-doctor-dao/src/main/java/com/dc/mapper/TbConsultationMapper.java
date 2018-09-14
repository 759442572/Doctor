package com.dc.mapper;

import com.dc.pojo.TbConsultation;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TbConsultationMapper {
    /**
     * 根据角色id查询
     * @param conName    用户名字
     * @return 返回投诉信息查询结果集
     */
    List< TbConsultation> getConsultationByName();

    /**
     * 分页查询商品信息
     *
     * @return  每页显示的商品数量
     */

    List< TbConsultation>  getTbConsultation();


}
