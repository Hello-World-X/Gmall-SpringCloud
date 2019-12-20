package com.gmall.manage.controller;

import com.gmall.entity.PmsProductImage;
import com.gmall.entity.PmsProductInfo;
import com.gmall.entity.PmsProductSaleAttr;
import com.gmall.service.SpuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/skuService")
public class SpuServiceController {

    @Resource(name="spuServiceImpl")
    private SpuService spuService;

    @RequestMapping(value = "/spuList", method = RequestMethod.POST)
    List<PmsProductInfo> spuList(String catalog3Id){
        return spuService.spuList(catalog3Id);
    }

    @RequestMapping(value = "/saveSpuInfo", method = RequestMethod.POST)
    void saveSpuInfo(PmsProductInfo pmsProductInfo){
        spuService.saveSpuInfo(pmsProductInfo);
    }

    @RequestMapping(value = "/spuSaleAttrList", method = RequestMethod.POST)
    List<PmsProductSaleAttr> spuSaleAttrList(String spuId){
        return spuService.spuSaleAttrList(spuId);
    }

    @RequestMapping(value = "/spuImageList", method = RequestMethod.POST)
    List<PmsProductImage> spuImageList(String spuId){
        return spuService.spuImageList(spuId);
    }

    @RequestMapping(value = "/spuSaleAttrListCheckBySku", method = RequestMethod.POST)
    List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String productId, String id){
        return spuService.spuSaleAttrListCheckBySku(productId, id);
    }
}
