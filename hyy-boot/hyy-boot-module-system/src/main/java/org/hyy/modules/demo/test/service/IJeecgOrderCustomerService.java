package org.hyy.modules.demo.test.service;

import java.util.List;

import org.hyy.modules.demo.test.entity.JeecgOrderCustomer;
import org.hyy.modules.demo.test.entity.JeecgOrderCustomer;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description: 订单客户
 * @Author: 黄智强
 * @Date:  2019-02-15
 * @Version: V1.0
 */
public interface IJeecgOrderCustomerService extends IService<JeecgOrderCustomer> {

	public List<JeecgOrderCustomer> selectCustomersByMainId(String mainId);
}
