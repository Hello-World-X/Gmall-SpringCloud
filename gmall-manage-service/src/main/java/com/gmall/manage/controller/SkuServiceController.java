package com.gmall.manage.controller;

import com.gmall.entity.PmsSkuInfo;
import com.gmall.service.SkuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;


@RestController
@RequestMapping("/skuService")
public class SkuServiceController {

    @Resource(name="skuServiceImpl")
    private SkuService skuService;

    @RequestMapping(value = "/saveSkuInfo", method = RequestMethod.POST)
    void saveSkuInfo(PmsSkuInfo pmsSkuInfo){
        skuService.saveSkuInfo(pmsSkuInfo);
    }

    @RequestMapping(value = "/getSkuById", method = RequestMethod.POST)
    PmsSkuInfo getSkuById(String skuId, String str){
        return skuService.getSkuById(skuId, str);
    }

    @RequestMapping(value = "/getSkuSaleAttrValueListBySpu", method = RequestMethod.POST)
    List<PmsSkuInfo> getSkuSaleAttrValueListBySpu(String productId){
        return skuService.getSkuSaleAttrValueListBySpu(productId);
    }

    @RequestMapping(value = "/getAllSku", method = RequestMethod.POST)
    List<PmsSkuInfo> getAllSku(String s){
        return skuService.getAllSku(s);
    }

    @RequestMapping(value = "/productSkuId", method = RequestMethod.POST)
    boolean checkPrice(String productSkuId, BigDecimal price){
        return skuService.checkPrice(productSkuId, price);
    }
}
