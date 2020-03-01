package org.hyy.modules.demo.test.service;

import org.hyy.common.system.base.service.JeecgService;
import org.hyy.modules.demo.test.entity.JeecgDemo;
import org.hyy.modules.demo.test.entity.JeecgDemo;

import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @Description: jeecg 测试demo
 * @Author: 黄智强
 * @Date:  2018-12-29
 * @Version: V1.0
 */
public interface IJeecgDemoService extends JeecgService<JeecgDemo> {

	public void testTran();

	public JeecgDemo getByIdCacheable(String id);

	/**
	 * 查询列表数据 在service中获取数据权限sql信息
	 * @param pageSize
	 * @param pageNo
	 * @return
	 */
	IPage<JeecgDemo> queryListWithPermission(int pageSize,int pageNo);
}
