package org.hyy.modules.system.service;

import org.hyy.modules.system.entity.SysDepartRoleUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 部门角色人员信息
 * @Author: 黄智强
 * @Date:   2020-02-13
 * @Version: V1.0
 */
public interface ISysDepartRoleUserService extends IService<SysDepartRoleUser> {

    void deptRoleUserAdd(String userId,String newRoleId,String oldRoleId);
}
