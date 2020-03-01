package org.hyy.modules.message.service;

import java.util.List;

import org.hyy.common.system.base.service.JeecgService;
import org.hyy.modules.message.entity.SysMessageTemplate;
import org.hyy.modules.message.entity.SysMessageTemplate;

/**
 * @Description: 消息模板
 * @Author: 黄智强
 * @Date:  2019-04-09
 * @Version: V1.0
 */
public interface ISysMessageTemplateService extends JeecgService<SysMessageTemplate> {
    List<SysMessageTemplate> selectByCode(String code);
}
