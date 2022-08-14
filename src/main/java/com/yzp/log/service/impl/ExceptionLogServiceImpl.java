package com.yzp.log.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yzp.log.dao.ExceptionLogDao;
import com.yzp.log.entity.ExceptionLogEntity;
import com.yzp.log.service.ExceptionLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yzp
 * @since 2022-08-14
 */
@Service
public class ExceptionLogServiceImpl extends ServiceImpl<ExceptionLogDao, ExceptionLogEntity> implements ExceptionLogService {

}
