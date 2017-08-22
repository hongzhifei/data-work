/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.bineng.dataWork.modules.cms.dao;

import com.bineng.dataWork.common.persistence.CrudDao;
import com.bineng.dataWork.common.persistence.annotation.MyBatisDao;
import com.bineng.dataWork.modules.cms.entity.Comment;

/**
 * 评论DAO接口
 * @author ThinkGem
 * @version 2013-8-23
 */
@MyBatisDao
public interface CommentDao extends CrudDao<Comment> {

}
