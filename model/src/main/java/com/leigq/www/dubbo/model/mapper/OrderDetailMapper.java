package com.leigq.www.dubbo.model.mapper;

import com.leigq.www.dubbo.api.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单详情
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
public interface OrderDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}