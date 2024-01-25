package com.wu.framework.inner.lazy.example.domain.infrastructure.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import com.wu.framework.inner.lazy.stereotype.LazyTableIndex;
import com.wu.framework.inner.layer.stereotype.LayerField;
import com.wu.framework.inner.layer.stereotype.LayerField.LayerFieldType;
import com.wu.framework.inner.lazy.stereotype.LazyTable;
import com.wu.framework.inner.lazy.stereotype.LazyTableField;
import com.wu.framework.inner.lazy.stereotype.*;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import com.wu.framework.inner.lazy.stereotype.LazyTableFieldId;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.String;
/**
 * describe 用户 
 *
 * @author Jia wei Wu
 * @date 2024/01/25 11:28 晚上
 * @see com.wu.framework.inner.lazy.persistence.reverse.lazy.ddd.DefaultDDDLazyInfrastructureEntity 
 **/
@Data
@Accessors(chain = true)
@LazyTable(tableName = "sys_user",schema = "wu_druid_demo",comment = "用户")
@Schema(title = "sys_user",description = "用户")
public class SysUserDO {


    /**
     * 
     * 创建时间
     */
    @Schema(description ="创建时间",name ="createTime",example = "")
    @LazyTableField(name="create_time",comment="创建时间",defaultValue="CURRENT_TIMESTAMP",upsertStrategy = LazyFieldStrategy.NEVER,columnType="datetime",extra=" on update CURRENT_TIMESTAMP")
    private LocalDateTime createTime;

    /**
     * 
     * 用户ID
     */
    @Schema(description ="用户ID",name ="id",example = "")
    @LazyTableFieldId(name = "id", comment = "用户ID")
    private Long id;

    /**
     * 
     * null
     */
    @Schema(description ="null",name ="isDeleted",example = "")
    @LazyTableField(name="is_deleted",comment="null",columnType="tinyint(1)")
    private Boolean isDeleted;

    /**
     * 
     * 密码
     */
    @Schema(description ="密码",name ="password",example = "")
    @LazyTableField(name="password",comment="密码",columnType="varchar(255)")
    private String password;

    /**
     * 
     * null
     */
    @Schema(description ="null",name ="scope",example = "")
    @LazyTableField(name="scope",comment="null",columnType="varchar(255)")
    private String scope;

    /**
     * 
     * 状态
     */
    @Schema(description ="状态",name ="status",example = "")
    @LazyTableField(name="status",comment="状态",columnType="tinyint(1)")
    private Boolean status;

    /**
     * 
     * 更新时间
     */
    @Schema(description ="更新时间",name ="updateTime",example = "")
    @LazyTableField(name="update_time",comment="更新时间",defaultValue="CURRENT_TIMESTAMP",upsertStrategy = LazyFieldStrategy.NEVER,columnType="datetime",extra=" on update CURRENT_TIMESTAMP")
    private LocalDateTime updateTime;

    /**
     * 
     * 用户名
     */
    @Schema(description ="用户名",name ="username",example = "")
    @LazyTableField(name="username",comment="用户名",lazyTableIndexs = {@LazyTableIndex(indexName = "u", indexType = LayerField.LayerFieldType.UNIQUE)},columnType="varchar(255)")
    private String username;

}