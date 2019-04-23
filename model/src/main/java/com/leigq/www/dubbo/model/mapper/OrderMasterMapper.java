package com.leigq.www.dubbo.model.mapper;

import com.leigq.www.dubbo.api.entity.OrderMaster;
import org.apache.ibatis.annotations.Mapper;

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
@Mapper
public interface OrderMasterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderMaster record);

    int insertSelective(OrderMaster record);

    OrderMaster selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderMaster record);

    int updateByPrimaryKey(OrderMaster record);
}