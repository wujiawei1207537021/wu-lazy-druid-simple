package com.wu.framework.inner.lazy.example.domain.application.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.String;
/**
 * describe 用户 
 *
 * @author Jia wei Wu
 * @date 2024/01/25 11:28 晚上
 * @see com.wu.framework.inner.lazy.persistence.reverse.lazy.ddd.DefaultDDDLazyDTO 
 **/
@Data
@Accessors(chain = true)
@Schema(title = "sys_user_command_dto",description = "用户")
public class SysUserDTO {


    /**
     * 
     * 创建时间
     */
    @Schema(description ="创建时间",name ="createTime",example = "")
    private LocalDateTime createTime;

    /**
     * 
     * 用户ID
     */
    @Schema(description ="用户ID",name ="id",example = "")
    private Long id;

    /**
     * 
     * null
     */
    @Schema(description ="null",name ="isDeleted",example = "")
    private Boolean isDeleted;

    /**
     * 
     * 密码
     */
    @Schema(description ="密码",name ="password",example = "")
    private String password;

    /**
     * 
     * null
     */
    @Schema(description ="null",name ="scope",example = "")
    private String scope;

    /**
     * 
     * 状态
     */
    @Schema(description ="状态",name ="status",example = "")
    private Boolean status;

    /**
     * 
     * 更新时间
     */
    @Schema(description ="更新时间",name ="updateTime",example = "")
    private LocalDateTime updateTime;

    /**
     * 
     * 用户名
     */
    @Schema(description ="用户名",name ="username",example = "")
    private String username;

}