package com.platform.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.platform.yuapicommon.model.entity.InterfaceInfo;

/**
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
