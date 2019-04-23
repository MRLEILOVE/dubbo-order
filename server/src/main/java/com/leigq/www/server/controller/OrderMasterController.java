package com.leigq.www.server.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.leigq.www.dubbo.api.entity.Commodity;
import com.leigq.www.dubbo.api.service.CommodityService;
import com.leigq.www.server.bean.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 订单
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-04-23 17:15 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@RestController
public class OrderMasterController {

    private final Response response;

    @Reference
    private CommodityService commodityService;

    @Autowired
    public OrderMasterController(Response response) {
        this.response = response;
    }

    @GetMapping("/order-masters")
    public Response listCommodities() {
        // 引用商品服务查询商品信息
        final List<Commodity> commodities = commodityService.listCommodities();
        return response.success(commodities);
    }

}
