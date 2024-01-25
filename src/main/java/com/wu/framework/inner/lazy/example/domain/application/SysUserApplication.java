package com.wu.framework.inner.lazy.example.domain.application;

import com.wu.framework.response.Result;
import com.wu.framework.response.ResultFactory;
import com.wu.framework.inner.lazy.example.domain.domain.model.sys.user.SysUser;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserRemoveCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserStoryCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserUpdateCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserQueryListCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserQueryOneCommand;
import com.wu.framework.inner.lazy.example.domain.application.dto.SysUserDTO;
import java.util.List;
import com.wu.framework.inner.lazy.database.expand.database.persistence.domain.LazyPage;
/**
 * describe 用户 
 *
 * @author Jia wei Wu
 * @date 2024/01/25 11:28 晚上
 * @see com.wu.framework.inner.lazy.persistence.reverse.lazy.ddd.DefaultDDDLazyApplication 
 **/

public interface SysUserApplication {


    /**
     * describe 新增用户
     *
     * @param sysUserStoryCommand 新增用户     
     * @return {@link Result<SysUser>} 用户新增后领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result<SysUser> story(SysUserStoryCommand sysUserStoryCommand);

    /**
     * describe 批量新增用户
     *
     * @param sysUserStoryCommandList 批量新增用户     
     * @return {@link Result<List<SysUser>>} 用户新增后领域对象集合     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result<List<SysUser>> batchStory(List<SysUserStoryCommand> sysUserStoryCommandList);

    /**
     * describe 更新用户
     *
     * @param sysUserUpdateCommand 更新用户     
     * @return {@link Result<SysUser>} 用户领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result<SysUser> updateOne(SysUserUpdateCommand sysUserUpdateCommand);

    /**
     * describe 查询单个用户
     *
     * @param sysUserQueryOneCommand 查询单个用户     
     * @return {@link Result<SysUserDTO>} 用户DTO对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result<SysUserDTO> findOne(SysUserQueryOneCommand sysUserQueryOneCommand);

    /**
     * describe 查询多个用户
     *
     * @param sysUserQueryListCommand 查询多个用户     
     * @return {@link Result <List<SysUserDTO>>} 用户DTO对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result <List<SysUserDTO>> findList(SysUserQueryListCommand sysUserQueryListCommand);

    /**
     * describe 分页查询多个用户
     *
     * @param sysUserQueryListCommand 分页查询多个用户     
     * @return {@link Result <LazyPage<SysUserDTO>>} 分页用户DTO对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result <LazyPage<SysUserDTO>> findPage(int size,int current,SysUserQueryListCommand sysUserQueryListCommand);

    /**
     * describe 删除用户
     *
     * @param sysUserRemoveCommand 删除用户     
     * @return {@link Result<SysUser>} 用户     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result<SysUser> remove(SysUserRemoveCommand sysUserRemoveCommand);

}