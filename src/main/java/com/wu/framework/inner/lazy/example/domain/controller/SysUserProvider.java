package com.wu.framework.inner.lazy.example.domain.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import com.wu.framework.inner.layer.web.EasyController;
import org.springframework.web.bind.annotation.*;
import com.wu.framework.response.Result;
import com.wu.framework.response.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.annotation.Resource;
import com.wu.framework.inner.lazy.example.domain.domain.model.sys.user.SysUser;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserRemoveCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserStoryCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserUpdateCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserQueryListCommand;
import com.wu.framework.inner.lazy.example.domain.application.command.sys.user.SysUserQueryOneCommand;
import com.wu.framework.inner.lazy.example.domain.application.SysUserApplication;
import com.wu.framework.inner.lazy.example.domain.application.dto.SysUserDTO;
import java.util.List;
import com.wu.framework.inner.lazy.database.expand.database.persistence.domain.LazyPage;
/**
 * describe 用户 
 *
 * @author Jia wei Wu
 * @date 2024/01/25 11:28 晚上
 * @see com.wu.framework.inner.lazy.persistence.reverse.lazy.ddd.DefaultDDDLazyController 
 **/
@Tag(name = "用户提供者")
@EasyController("/sys/user")
public class SysUserProvider  {

    @Resource
    private SysUserApplication sysUserApplication;

    /**
     * describe 新增用户
     *
     * @param sysUserStoryCommand 新增用户     
     * @return {@link Result<SysUser>} 用户新增后领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Operation(summary = "新增用户")
    @PostMapping("/story")
    public Result<SysUser> story(@RequestBody SysUserStoryCommand sysUserStoryCommand){
        return sysUserApplication.story(sysUserStoryCommand);
    }
    /**
     * describe 批量新增用户
     *
     * @param sysUserStoryCommandList 批量新增用户     
     * @return {@link Result<List<SysUser>>} 用户新增后领域对象集合     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Operation(summary = "批量新增用户")
    @PostMapping("/batchStory")
    public Result<List<SysUser>> batchStory(@RequestBody List<SysUserStoryCommand> sysUserStoryCommandList){
        return sysUserApplication.batchStory(sysUserStoryCommandList);
    }
    /**
     * describe 更新用户
     *
     * @param sysUserUpdateCommand 更新用户     
     * @return {@link Result<SysUser>} 用户领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Operation(summary = "更新用户")
    @PutMapping("/updateOne")
    public Result<SysUser> updateOne(@RequestBody SysUserUpdateCommand sysUserUpdateCommand){
        return sysUserApplication.updateOne(sysUserUpdateCommand);
    }
    /**
     * describe 查询单个用户
     *
     * @param sysUserQueryOneCommand 查询单个用户     
     * @return {@link Result<SysUserDTO>} 用户DTO对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Operation(summary = "查询单个用户")
    @GetMapping("/findOne")
    public Result<SysUserDTO> findOne(@ModelAttribute SysUserQueryOneCommand sysUserQueryOneCommand){
        return sysUserApplication.findOne(sysUserQueryOneCommand);
    }
    /**
     * describe 查询多个用户
     *
     * @param sysUserQueryListCommand 查询多个用户     
     * @return {@link Result<List<SysUserDTO>>} 用户DTO对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Operation(summary = "查询多个用户")
    @GetMapping("/findList")
    public Result<List<SysUserDTO>> findList(@ModelAttribute SysUserQueryListCommand sysUserQueryListCommand){
        return sysUserApplication.findList(sysUserQueryListCommand);
    }
    /**
     * describe 分页查询多个用户
     *
     * @param sysUserQueryListCommand 分页查询多个用户     
     * @return {@link Result<LazyPage<SysUserDTO>>} 分页用户DTO对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Operation(summary = "分页查询多个用户")
    @GetMapping("/findPage")
    public Result<LazyPage<SysUserDTO>> findPage(@Parameter(description ="分页大小") @RequestParam(defaultValue = "10", value = "size") int size,
                           @Parameter(description ="当前页数") @RequestParam(defaultValue = "1", value = "current") int current,@ModelAttribute SysUserQueryListCommand sysUserQueryListCommand){
        return sysUserApplication.findPage(size,current,sysUserQueryListCommand);
    }
    /**
     * describe 删除用户
     *
     * @param sysUserRemoveCommand 删除用户     
     * @return {@link Result<SysUser>} 用户     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Operation(summary = "删除用户")
    @DeleteMapping("/remove")
    public Result<SysUser> remove(@ModelAttribute SysUserRemoveCommand sysUserRemoveCommand){
        return sysUserApplication.remove(sysUserRemoveCommand);
    }
}