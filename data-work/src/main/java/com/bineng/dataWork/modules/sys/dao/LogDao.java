/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.bineng.dataWork.modules.sys.dao;

import com.bineng.dataWork.common.persistence.CrudDao;
import com.bineng.dataWork.common.persistence.annotation.MyBatisDao;
import com.bineng.dataWork.modules.sys.entity.Log;

/**
 * 日志DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
