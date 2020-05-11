/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除gemframe官方保留所有法律责任追究！
 * 本软件受国家版权局知识产权以及国家计算机软件著作权保护（登记号：2018SR503328）
 * 不得恶意分享产品源代码、二次转售等，违者必究。
 * Copyright (c) 2020 gemframework all rights reserved.
 * http://www.gemframework.com
 * 版权所有，侵权必究！
 */
package com.gemframework.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gemframework.model.entity.po.RoleRights;
import com.gemframework.model.entity.vo.RoleRightsVo;

public interface RoleRightsService extends IService<RoleRights> {

    /**
     * 保存角色功能权限
     * @param vo
     * @return
     */
    boolean save(RoleRightsVo vo);

    /**
     * 通过角色ID删除
     * @param roleId
     * @return
     */
    boolean deleteByRoleId(Long roleId);
}