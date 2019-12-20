package com.gmall.manage.controller;

import com.gmall.entity.PmsBaseAttrInfo;
import com.gmall.entity.PmsBaseAttrValue;
import com.gmall.entity.PmsBaseSaleAttr;
import com.gmall.service.AttrService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/attrService")
public class AttrServiceController {

    @Resource(name="attrServiceImpl")
    private AttrService attrService;

    @RequestMapping(value = "/attrInfoList", method = RequestMethod.POST)
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        return attrService.attrInfoList(catalog3Id);
    }

    @RequestMapping(value = "/saveAttrInfo", method = RequestMethod.POST)
    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo){
        return attrService.saveAttrInfo(pmsBaseAttrInfo);
    }

    @RequestMapping(value = "/getAttrValueList", method = RequestMethod.POST)
    List<PmsBaseAttrValue> getAttrValueList(String attrId){
        return attrService.getAttrValueList(attrId);
    }

    @RequestMapping(value = "/baseSaleAttrList", method = RequestMethod.POST)
    List<PmsBaseSaleAttr> baseSaleAttrList(){
        return attrService.baseSaleAttrList();
    }

    @RequestMapping(value = "/getAttrValueListByValueId", method = RequestMethod.POST)
    List<PmsBaseAttrInfo> getAttrValueListByValueId(Set<String> valueIdSet){
        return attrService.getAttrValueListByValueId(valueIdSet);
    }
}
