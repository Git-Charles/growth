package com.myssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myssm.bean.TbInformation;
import com.myssm.service.InformationService;

@Controller
@RequestMapping("/information")
public class InformationController {
	
	@Autowired
	private InformationService informationService;
	
	@RequestMapping("/infos")
	public String informationList(){
		List<TbInformation>  infos=informationService.getInformations();
		for(int i=0;i<infos.size();i++){
			System.out.println(infos.get(i).getInfoId());
		}
		
		return "/information";
	}
	
	
}
