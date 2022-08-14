package com.yzp.log.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author yzp
 * @since 2022-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("operation_log")
public class OperationLogEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId
    private String operId;

    /**
     * 功能模块
     */
    private String operModul;

    /**
     * 操作类型
     */
    private String operType;

    /**
     * 操作描述
     */
    private String operDesc;

    /**
     * 请求参数
     */
    private String operRequParam;

    /**
     * 返回参数
     */
    private String operReqspParam;

    /**
     * 操作员ID
     */
    private byte[] operUserId;

    /**
     * 操作员名称
     */
    private String operUserName;

    /**
     * 操作方法
     */
    private String operMethod;

    /**
     * 请求URI
     */
    private String operUri;

    /**
     * 请求IP
     */
    private String operIp;

    /**
     * 操作时间
     */
    private LocalDateTime operCreateTime;

    /**
     * 操作版本号
     */
    private String operVer;


}
