package com.dc.controller;

import com.dc.common.pojo.EasyUIDataGridResult;
import com.dc.pojo.TbConsultation;
import com.dc.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("list")
public class ConsultationController {

    @Autowired
    private ConsultationService consultationService;
    @RequestMapping("/")
    public  String getConsultationByName(Model model){
        List<TbConsultation> list = consultationService.getConsultationByName();
        model.addAttribute("list",list);

        System.out.println(list);
        return "sucdoc";

    }
    @RequestMapping("/sucdoc")
    @ResponseBody
    public EasyUIDataGridResult getTbConsultationList(Integer page, Integer rows){
        EasyUIDataGridResult result = consultationService.getTbConsultation(page, rows);
        return result;


    }






}
