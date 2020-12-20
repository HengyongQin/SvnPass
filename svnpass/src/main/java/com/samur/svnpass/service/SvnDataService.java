package com.samur.svnpass.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.samur.svnpass.data.SvnData;
import com.samur.svnpass.util.FileUtil;
import com.samur.svnpass.util.StringUtil;
import org.springframework.ui.Model;

public class SvnDataService {
   /**
    * parse string and create svnData instance.
    * @param fileStr
    * @return
    */
   private SvnData parseStr(String fileStr) {
      if(StringUtil.isEmpty(fileStr)) {
         return new SvnData();
      }

      JSONObject json = JSON.parseObject(fileStr);
      String port = String.valueOf(json.get("server_port"));
      String protocol = String.valueOf(json.get("protocol"));
      String confuse = String.valueOf(json.get("obfs"));
      String encryption = String.valueOf(json.get("method"));
      return new SvnData(port, protocol, confuse, encryption);
   }

   /**
    * Get svn data, and add to model.
    * @param model
    */
   public void getSvnData(Model model) {
      SvnData svnData = getSvnData();
      model.addAttribute("confuse", svnData.getConfuse());
      model.addAttribute("encryption", svnData.getEncryption());
      model.addAttribute("protocol", svnData.getProtocol());
      model.addAttribute("servicePort", svnData.getServicePort());
   }

   /**
    * Get svn data.
    * @return
    */
   public SvnData getSvnData() {
      String fileStr = FileUtil.readFile(SvnData.filePath);
      return parseStr(fileStr);
   }


}
