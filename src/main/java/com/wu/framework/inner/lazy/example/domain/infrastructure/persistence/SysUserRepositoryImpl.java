package com.wu.framework.inner.lazy.example.domain.infrastructure.persistence;

import com.wu.framework.inner.lazy.example.domain.infrastructure.entity.SysUserDO;
import com.wu.framework.inner.lazy.example.domain.infrastructure.converter.SysUserConverter;
import com.wu.framework.inner.lazy.example.domain.infrastructure.mapper.SysUserMapper;
import com.wu.framework.inner.lazy.example.domain.domain.model.sys.user.SysUserRepository;
import org.springframework.stereotype.Repository;
import java.util.stream.Collectors;
import com.wu.framework.inner.lazy.database.expand.database.persistence.stream.wrapper.LazyWrappers;
import com.wu.framework.response.Result;
import com.wu.framework.response.ResultFactory;
import jakarta.annotation.Resource;
import com.wu.framework.inner.lazy.example.domain.domain.model.sys.user.SysUser;
import com.wu.framework.inner.lazy.database.expand.database.persistence.stream.lambda.LazyLambdaStream;
import java.util.List;
import com.wu.framework.inner.lazy.database.expand.database.persistence.domain.LazyPage;
/**
 * describe 用户 
 *
 * @author Jia wei Wu
 * @date 2024/01/25 11:28 晚上
 * @see com.wu.framework.inner.lazy.persistence.reverse.lazy.ddd.DefaultDDDLazyInfrastructurePersistence 
 **/
@Repository
public class SysUserRepositoryImpl  implements  SysUserRepository {

    @Resource
    LazyLambdaStream lazyLambdaStream;

    /**
     * describe 新增用户
     *
     * @param sysUser 新增用户     
     * @return {@link Result<SysUser>} 用户新增后领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<SysUser> story(SysUser sysUser) {
        SysUserDO sysUserDO = SysUserConverter.INSTANCE.fromSysUser(sysUser);
        lazyLambdaStream.upsert(sysUserDO);
        return ResultFactory.successOf();
    }

    /**
     * describe 批量新增用户
     *
     * @param sysUserList 批量新增用户     
     * @return {@link Result<List<SysUser>>} 用户新增后领域对象集合     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<List<SysUser>> batchStory(List<SysUser> sysUserList) {
        List<SysUserDO> sysUserDOList = sysUserList.stream().map(SysUserConverter.INSTANCE::fromSysUser).collect(Collectors.toList());
        lazyLambdaStream.upsert(sysUserDOList);
        return ResultFactory.successOf();
    }

    /**
     * describe 查询单个用户
     *
     * @param sysUser 查询单个用户     
     * @return {@link Result<SysUser>} 用户领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<SysUser> findOne(SysUser sysUser) {
        SysUserDO sysUserDO = SysUserConverter.INSTANCE.fromSysUser(sysUser);
        SysUser sysUserOne = lazyLambdaStream.selectOne(LazyWrappers.lambdaWrapperBean(sysUserDO), SysUser.class);
        return ResultFactory.successOf(sysUserOne);
    }

    /**
     * describe 查询多个用户
     *
     * @param sysUser 查询多个用户     
     * @return {@link Result<List<SysUser>>} 用户领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<List<SysUser>> findList(SysUser sysUser) {
        SysUserDO sysUserDO = SysUserConverter.INSTANCE.fromSysUser(sysUser);
        List<SysUser> sysUserList = lazyLambdaStream.selectList(LazyWrappers.lambdaWrapperBean(sysUserDO), SysUser.class);
        return ResultFactory.successOf(sysUserList);
    }

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

    @Override
    public Result<LazyPage<SysUser>> findPage(int size,int current,SysUser sysUser) {
        SysUserDO sysUserDO = SysUserConverter.INSTANCE.fromSysUser(sysUser);
        LazyPage<SysUser> lazyPage = new LazyPage<>(current,size);
        LazyPage<SysUser> sysUserLazyPage = lazyLambdaStream.selectPage(LazyWrappers.lambdaWrapperBean(sysUserDO),lazyPage, SysUser.class);
        return ResultFactory.successOf(sysUserLazyPage);
    }

    /**
     * describe 删除用户
     *
     * @param sysUser 删除用户     
     * @return {@link Result<SysUser>} 用户     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<SysUser> remove(SysUser sysUser) {
        SysUserDO sysUserDO = SysUserConverter.INSTANCE.fromSysUser(sysUser);
        //  lazyLambdaStream.delete(LazyWrappers.lambdaWrapperBean(sysUserDO));
        return ResultFactory.successOf();
    }

    /**
     * describe 是否存在用户
     *
     * @param sysUser 用户领域对象     
     * @return {@link Result<Boolean>} 是否存在 true 存在，false 不存在     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/

    @Override
    public Result<Boolean> exists(SysUser sysUser) {
        SysUserDO sysUserDO = SysUserConverter.INSTANCE.fromSysUser(sysUser);
        Boolean exists=lazyLambdaStream.exists(LazyWrappers.lambdaWrapperBean(sysUserDO));
        return ResultFactory.successOf(exists);
    }

}