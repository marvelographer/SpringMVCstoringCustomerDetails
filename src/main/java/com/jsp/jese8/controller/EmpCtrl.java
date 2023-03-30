package com.jsp.jese8.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.jese8.dao.EmpDao;
import com.jsp.jese8.dto.EmpDto;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

//
import com.jsp.jese8.dto.EmpDto;

@Controller
public class EmpCtrl {
	// @Autowired
	// EmpDto empdto;

	// @Autowired
	// EmpDao empdao;

	// Model is the "object" and View is to show the "data in web page"

	@RequestMapping("/signup")
	public ModelAndView signup() {
		ModelAndView modelAndView = new ModelAndView("signup.jsp");
		EmpDto objempdto = new EmpDto();
		modelAndView.addObject("empobject", objempdto); // creation of the
														// object
		return modelAndView;
	}

	@ResponseBody // convert your object into HTTP response in the form client
					// is expecting like JSON, XML, or simply text
	@RequestMapping("/insert")
	public String insert(EmpDto dto) { // method name can be any name
		EmpDao objempdao = new EmpDao();
		objempdao.insert(dto);
		return "saved";
	}

	@RequestMapping("/delete")
	public ModelAndView delete() {
		ModelAndView modelAndView = new ModelAndView("delete.jsp");
		EmpDto empDto = new EmpDto();
		modelAndView.addObject("deleteByEmail", empDto);
		return modelAndView;
	}

	@ResponseBody
	@RequestMapping("/findByEmail")
	public String deletePerson(EmpDto empDto) {
		EmpDao empDao = new EmpDao();
		EmpDto empDto2 = empDao.findByEmail(empDto.getEmail());
		empDao.deleteData(empDto2);
		return "Your Data has Deleted Successfully " + empDto2.getEmail();
	}

	@RequestMapping("/update")
	public ModelAndView updating() {
		ModelAndView andView = new ModelAndView("update.jsp");
		EmpDto empDto = new EmpDto();
		andView.addObject("updateObj", empDto);
		return andView;
	}

	@ResponseBody
	@RequestMapping("/toBeUpdate")
	public String updating(EmpDto dto) {
		EmpDao dao = new EmpDao();
		EmpDto empDto = dao.findByEmail(dto.getEmail());
		empDto.setPhone(dto.getPhone());
		dao.update(empDto);
		return "DATA HAS UPDATED --> " + dto.getPhone();
	}

	@RequestMapping("/fetch")
	public ModelAndView method() {
		ModelAndView modelAndView = new ModelAndView("fetch.jsp");
		EmpDto dto = new EmpDto();
		modelAndView.addObject("fetchObj", dto);
		return modelAndView;
	}

	@ResponseBody
	@RequestMapping("/methodFetch")
	public ModelAndView method1(EmpDto dto) {
		EmpDao dao = new EmpDao();
		EmpDto empDto = dao.findByEmail(dto.getEmail());
		ModelAndView andView = new ModelAndView("fetch1.jsp");
		andView.addObject("fetch1Obj", empDto);
		return andView;
	}
	
	@ResponseBody
	@RequestMapping("/allFetch1")
	public ModelAndView method3(){
		EmpDao dao = new EmpDao();
		List<EmpDto> dtos = dao.fetchingAll();
		ModelAndView andView = new ModelAndView("fetchAll1.jsp");
		andView.addObject("fetchAllKey",dtos);
		return andView;
	}
}