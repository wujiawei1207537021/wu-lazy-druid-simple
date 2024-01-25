package com.wu.framework.inner.lazy.example.domain.application.impl;

import com.wu.framework.database.lazy.web.plus.stereotype.LazyApplication;
import com.wu.framework.inner.lazy.example.domain.application.SysUserApplication;
import org.springframework.web.bind.annotation.*;
import com.wu.framework.response.Result;
import com.wu.framework.response.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.wu.framework.inner.lazy.example.domain.domain.model.sys.user.SysUser;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserRemoveCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserStoryCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserUpdateCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserQueryListCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserQueryOneCommand;
import com.wu.framework.inner.lazy.example.domain.application.assembler.SysUserDTOAssembler;
import com.wu.framework.inner.lazy.example.domain.application.dto.SysUserDTO;
import java.util.stream.Collectors;
import jakarta.annotation.Resource;
import com.wu.framework.inner.lazy.example.domain.domain.model.sys.user.SysUserRepository;
import java.util.List;
import com.wu.framework.inner.lazy.database.expand.database.persistence.domain.LazyPage;
/**
 * describe 用户 
 *
 * @author Jia wei Wu
 * @date 2024/01/25 11:28 晚上
 * @see com.wu.framework.inner.lazy.persistence.reverse.lazy.ddd.DefaultDDDLazyApplicationImpl 
 **/
@LazyApplication
public class SysUserApplicationImpl implements SysUserApplication {

    @Resource
    SysUserRepository sysUserRepository;
    /**
     * describe 新增用户
     *
     * @param sysUserStoryCommand 新增用户     
     * @return {@link Result<SysUser>} 用户新增后领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<SysUser> story(SysUserStoryCommand sysUserStoryCommand) {
        SysUser sysUser = SysUserDTOAssembler.INSTANCE.toSysUser(sysUserStoryCommand);
        return sysUserRepository.story(sysUser);
    }
    /**
     * describe 批量新增用户
     *
     * @param sysUserStoryCommandList 批量新增用户     
     * @return {@link Result<List<SysUser>>} 用户新增后领域对象集合     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<List<SysUser>> batchStory(List<SysUserStoryCommand> sysUserStoryCommandList) {
        List<SysUser> sysUserList = sysUserStoryCommandList.stream().map( SysUserDTOAssembler.INSTANCE::toSysUser).collect(Collectors.toList());
        return sysUserRepository.batchStory(sysUserList);
    }
    /**
     * describe 更新用户
     *
     * @param sysUserUpdateCommand 更新用户     
     * @return {@link Result<SysUser>} 用户领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<SysUser> updateOne(SysUserUpdateCommand sysUserUpdateCommand) {
        SysUser sysUser = SysUserDTOAssembler.INSTANCE.toSysUser(sysUserUpdateCommand);
        return sysUserRepository.story(sysUser);
    }

    /**
     * describe 查询单个用户
     *
     * @param sysUserQueryOneCommand 查询单个用户     
     * @return {@link Result<SysUserDTO>} 用户DTO对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<SysUserDTO> findOne(SysUserQueryOneCommand sysUserQueryOneCommand) {
        SysUser sysUser = SysUserDTOAssembler.INSTANCE.toSysUser(sysUserQueryOneCommand);
        return sysUserRepository.findOne(sysUser).convert(SysUserDTOAssembler.INSTANCE::fromSysUser);
    }

    /**
     * describe 查询多个用户
     *
     * @param sysUserQueryListCommand 查询多个用户     
     * @return {@link Result<List<SysUserDTO>>} 用户DTO对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<List<SysUserDTO>> findList(SysUserQueryListCommand sysUserQueryListCommand) {
        SysUser sysUser = SysUserDTOAssembler.INSTANCE.toSysUser(sysUserQueryListCommand);
        return sysUserRepository.findList(sysUser)        .convert(sysUsers -> sysUsers.stream().map(SysUserDTOAssembler.INSTANCE::fromSysUser).collect(Collectors.toList())) ;
    }

    /**
     * describe 分页查询多个用户
     *
     * @param sysUserQueryListCommand 分页查询多个用户     
     * @return {@link Result<LazyPage<SysUserDTO>>} 分页用户DTO对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<LazyPage<SysUserDTO>> findPage(int size,int current,SysUserQueryListCommand sysUserQueryListCommand) {
        SysUser sysUser = SysUserDTOAssembler.INSTANCE.toSysUser(sysUserQueryListCommand);
        return sysUserRepository.findPage(size,current,sysUser)        .convert(page -> page.convert(SysUserDTOAssembler.INSTANCE::fromSysUser))            ;
    }

    /**
     * describe 删除用户
     *
     * @param sysUserRemoveCommand 删除用户     
     * @return {@link Result<SysUser>} 用户     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<SysUser> remove(SysUserRemoveCommand sysUserRemoveCommand) {
     SysUser sysUser = SysUserDTOAssembler.INSTANCE.toSysUser(sysUserRemoveCommand);
     return sysUserRepository.remove(sysUser);
    }

}