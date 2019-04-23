package com.leigq.www.dubbo.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

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
@Data
public class OrderMaster implements Serializable {
    /**
	* 主键Id
	*/
    private Long id;

    /**
	* 编号
	*/
    private String code;

    /**
	* 金额
	*/
    private BigDecimal amount;

    /**
	* 0:未支付;1:已支付
	*/
    private Boolean status;

    /**
	* 创建时间
	*/
    private Date createTime;

    /**
	* 修改时间
	*/
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}