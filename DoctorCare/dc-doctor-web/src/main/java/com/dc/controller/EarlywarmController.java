//package com.dc.controller;
//
//
//import com.dc.pojo.TbEarlywarm;
//import com.dc.service.EarlywarmService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//import java.util.List;
//
//@Controller
//@SessionAttributes("list")
//public class EarlywarmController {
//    @Autowired
//    private EarlywarmService earlywarmService;
//    @RequestMapping("/")
//    public String getEarlywarmById(Model model){
//       List<TbEarlywarm> early = earlywarmService.getEarlywarmById();
//        model.addAttribute("early",early);
//       return "sucdoc";
//    }
//
//}
