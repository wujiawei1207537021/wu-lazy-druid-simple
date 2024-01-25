package com.wu.framework.inner.lazy.example.domain.infrastructure.converter;

import com.wu.framework.inner.lazy.example.domain.domain.model.sys.user.SysUser;
import com.wu.framework.inner.lazy.example.domain.infrastructure.entity.SysUserDO;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;
/**
 * describe 用户 
 *
 * @author Jia wei Wu
 * @date 2024/01/25 11:28 晚上
 * @see com.wu.framework.inner.lazy.persistence.reverse.lazy.ddd.DefaultDDDLazyInfrastructureConverter 
 **/
@Mapper
public interface SysUserConverter {


    /**
     * describe MapStruct 创建的代理对象
     *
     
     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/
    SysUserConverter INSTANCE = Mappers.getMapper(SysUserConverter.class);
    /**
     * describe 实体对象 转换成领域对象
     *
     * @param sysUserDO 用户实体对象     
     * @return {@link SysUser} 用户领域对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/
    SysUser toSysUser(SysUserDO sysUserDO);
    /**
     * describe 领域对象 转换成实体对象
     *
     * @param sysUser 用户领域对象     
     * @return {@link SysUserDO} 用户实体对象     
     
     * @author Jia wei Wu
     * @date 2024/01/25 11:28 晚上
     **/
     SysUserDO fromSysUser(SysUser sysUser); 
}