package com.tschool.Entity.Controller;

import com.tschool.Entity.Patient;
import com.tschool.Entity.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @RequestMapping("/")
    public ModelAndView home(){
        List<Patient> patientList = doctorService.getAll();
        ModelAndView mav = new ModelAndView("index.jsp");
        mav.addObject("patientList", patientList);
        return mav;
    }
}

