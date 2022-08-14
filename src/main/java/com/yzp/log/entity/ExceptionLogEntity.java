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
@TableName("exception_log")
public class ExceptionLogEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId
    private String excId;

    /**
     * 请求参数
     */
    private String excRequParam;

    /**
     * 异常名称
     */
    private String excName;

    /**
     * 异常信息
     */
    private String excMessage;

    /**
     * 操作员ID
     */
    private String operUserId;

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
     * 操作版本号
     */
    private String operVer;

    /**
     * 创建时间
     */
    private LocalDateTime operCreateTime;


}
