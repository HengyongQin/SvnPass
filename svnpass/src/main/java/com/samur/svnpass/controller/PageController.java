package com.samur.svnpass.controller;

import com.samur.svnpass.service.SvnDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
   @RequestMapping("/*")
   public String index(Model model) {
      SvnDataService service = new SvnDataService();
      service.getSvnData(model);
      return "content";
   }
}
