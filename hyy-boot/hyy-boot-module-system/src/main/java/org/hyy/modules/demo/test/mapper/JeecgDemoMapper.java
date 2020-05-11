package org.hyy.modules.demo.test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.hyy.modules.demo.test.entity.JeecgDemo;
import org.hyy.modules.demo.test.entity.JeecgDemo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @Description: jeecg 测试demo
 * @Author: 黄智强
 * @Date:  2018-12-29
 * @Version: V1.0
 */
public interface JeecgDemoMapper extends BaseMapper<JeecgDemo> {

	public List<JeecgDemo> getDemoByName(@Param("name") String name);

	/**
	 * 查询列表数据 直接传数据权限的sql进行数据过滤
	 * @param page
	 * @param permissionSql
	 * @return
	 */
	public IPage<JeecgDemo> queryListWithPermission(Page<JeecgDemo> page,@Param("permissionSql")String permissionSql);

}