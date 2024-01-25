package com.wu.framework.inner.lazy.example.domain.domain.model.sys.user;

import com.wu.framework.response.Result;
import com.wu.framework.response.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.wu.framework.inner.lazy.example.domain.domain.model.sys.user.SysUser;
import java.util.List;
import com.wu.framework.inner.lazy.database.expand.database.persistence.domain.LazyPage;
/**
 * describe 用户 
 *
 * @author Jia wei Wu
 * @date 2024/01/25 11:28 晚上
 * @see com.wu.framework.inner.lazy.persistence.reverse.lazy.ddd.DefaultDDDLazyDomainRepository 
 **/

public interface SysUserRepository {


    /**
     * describe 新增用户
     *
     * @param sysUser 新增用户     
     * @return {@link  Result<SysUser>} 用户新增后领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result<SysUser> story(SysUser sysUser);

    /**
     * describe 批量新增用户
     *
     * @param sysUserList 批量新增用户     
     * @return {@link Result<List<SysUser>>} 用户新增后领域对象集合     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result<List<SysUser>> batchStory(List<SysUser> sysUserList);

    /**
     * describe 查询单个用户
     *
     * @param sysUser 查询单个用户     
     * @return {@link Result<SysUser>} 用户DTO对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result<SysUser> findOne(SysUser sysUser);

    /**
     * describe 查询多个用户
     *
     * @param sysUser 查询多个用户     
     * @return {@link Result<List<SysUser>>} 用户DTO对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result<List<SysUser>> findList(SysUser sysUser);

    /**
     * describe 分页查询多个用户
     *
     * @param size 当前页数
     * @param current 当前页
     * @param sysUser 分页查询多个用户     
     * @return {@link Result<LazyPage<SysUser>>} 分页用户领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result<LazyPage<SysUser>> findPage(int size,int current,SysUser sysUser);

    /**
     * describe 删除用户
     *
     * @param sysUser 删除用户     
     * @return {@link Result<SysUser>} 用户     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result<SysUser> remove(SysUser sysUser);

    /**
     * describe 是否存在用户
     *
     * @param sysUser 是否存在用户     
     * @return {@link Result<Boolean>} 用户是否存在     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    Result<Boolean> exists(SysUser sysUser);

}