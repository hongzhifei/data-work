/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.bineng.dataWork.test.dao;

import com.bineng.dataWork.common.persistence.CrudDao;
import com.bineng.dataWork.common.persistence.annotation.MyBatisDao;
import com.bineng.dataWork.test.entity.TestDataChild;

/**
 * 主子表生成DAO接口
 * @author ThinkGem
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestDataChildDao extends CrudDao<TestDataChild> {
	
}