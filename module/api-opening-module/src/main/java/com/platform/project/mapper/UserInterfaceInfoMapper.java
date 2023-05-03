package com.platform.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.platform.yuapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @Entity com.platform.project.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




