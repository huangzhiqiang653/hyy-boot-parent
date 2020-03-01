package org.hyy.modules.message.service.impl;

import org.hyy.common.system.base.service.impl.JeecgServiceImpl;
import org.hyy.modules.message.entity.SysMessageTemplate;
import org.hyy.modules.message.mapper.SysMessageTemplateMapper;
import org.hyy.modules.message.service.ISysMessageTemplateService;
import org.hyy.modules.message.entity.SysMessageTemplate;
import org.hyy.modules.message.mapper.SysMessageTemplateMapper;
import org.hyy.modules.message.service.ISysMessageTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Description: 消息模板
 * @Author: 黄智强
 * @Date:  2019-04-09
 * @Version: V1.0
 */
@Service
public class SysMessageTemplateServiceImpl extends JeecgServiceImpl<SysMessageTemplateMapper, SysMessageTemplate> implements ISysMessageTemplateService {

    @Autowired
    private SysMessageTemplateMapper sysMessageTemplateMapper;


    @Override
    public List<SysMessageTemplate> selectByCode(String code) {
        return sysMessageTemplateMapper.selectByCode(code);
    }
}
