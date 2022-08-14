package com.yzp.log.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yzp.log.dao.OperationLogDao;
import com.yzp.log.entity.OperationLogEntity;
import com.yzp.log.service.OperationLogService;
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
public class OperationLogServiceImpl extends ServiceImpl<OperationLogDao, OperationLogEntity> implements OperationLogService {

}
