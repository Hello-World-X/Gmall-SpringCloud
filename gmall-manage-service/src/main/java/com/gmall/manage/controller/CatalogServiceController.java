package com.gmall.manage.controller;

import com.gmall.entity.OmsCartItem;
import com.gmall.entity.PmsBaseCatalog1;
import com.gmall.entity.PmsBaseCatalog2;
import com.gmall.entity.PmsBaseCatalog3;
import com.gmall.service.AttrService;
import com.gmall.service.CatalogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/catalogService")
public class CatalogServiceController {

    @Resource(name="attrServiceImpl")
    private CatalogService catalogService;

    @RequestMapping(value = "/getCatalog1", method = RequestMethod.POST)
    List<PmsBaseCatalog1> getCatalog1(){
        return catalogService.getCatalog1();
    }

    @RequestMapping(value = "/getCatalog2", method = RequestMethod.POST)
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        return catalogService.getCatalog2(catalog1Id);
    }

    @RequestMapping(value = "/getCatalog3", method = RequestMethod.POST)
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        return catalogService.getCatalog3(catalog2Id);
    }
}
