package com.wu.framework.inner.lazy.example.domain.application.assembler;

import com.wu.framework.inner.lazy.example.domain.domain.model.sys.user.SysUser;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserRemoveCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserStoryCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserUpdateCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserQueryListCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserQueryOneCommand;
import com.wu.framework.inner.lazy.example.domain.application.dto.SysUserDTO;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;
/**
 * describe 用户 
 *
 * @author Jia wei Wu
 * @date 2024/01/25 11:28 晚上
 * @see com.wu.framework.inner.lazy.persistence.reverse.lazy.ddd.DefaultDDDLazyAssembler 
 **/
@Mapper
public interface SysUserDTOAssembler {


    /**
     * describe MapStruct 创建的代理对象
     *
     
     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/
    SysUserDTOAssembler INSTANCE = Mappers.getMapper(SysUserDTOAssembler.class);
    /**
     * describe 应用层存储入参转换成 领域对象
     *
     * @param sysUserStoryCommand 保存用户对象     
     * @return {@link SysUser} 用户领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/
     SysUser toSysUser(SysUserStoryCommand sysUserStoryCommand);
    /**
     * describe 应用层更新入参转换成 领域对象
     *
     * @param sysUserUpdateCommand 更新用户对象     
     * @return {@link SysUser} 用户领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/
     SysUser toSysUser(SysUserUpdateCommand sysUserUpdateCommand);
    /**
     * describe 应用层查询入参转换成 领域对象
     *
     * @param sysUserQueryOneCommand 查询单个用户对象参数     
     * @return {@link SysUser} 用户领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/
     SysUser toSysUser(SysUserQueryOneCommand sysUserQueryOneCommand);
    /**
     * describe 应用层查询入参转换成 领域对象
     *
     * @param sysUserQueryListCommand 查询集合用户对象参数     
     * @return {@link SysUser} 用户领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/
     SysUser toSysUser(SysUserQueryListCommand sysUserQueryListCommand);
    /**
     * describe 应用层删除入参转换成 领域对象
     *
     * @param sysUserRemoveCommand 删除用户对象参数     
     * @return {@link SysUser} 用户领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/
     SysUser toSysUser(SysUserRemoveCommand sysUserRemoveCommand);
    /**
     * describe 持久层领域对象转换成DTO对象
     *
     * @param sysUser 用户领域对象     
     * @return {@link SysUserDTO} 用户DTO对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/
     SysUserDTO fromSysUser(SysUser sysUser);
}