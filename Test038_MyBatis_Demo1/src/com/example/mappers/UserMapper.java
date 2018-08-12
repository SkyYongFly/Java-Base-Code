package com.example.mappers;

import com.example.pojo.User;

/**
 *	用户Mapper接口
 * 
 * @author zhu
 */
public interface UserMapper {
	/**
	 * 新增用户
	 * @param user
	 */
	public void addUser(User user);
	
	/**
	 * 删除用户
	 * @param userId
	 */
	public void deleteUser(int userId);
	
	/**
	 * 更新用户信息
	 * 
	 * @param User
	 */
	public void updateUser(User user);
	
	/**
	 * 获取用户
	 * 
	 * @param 	userId 用户ID
	 * @return	用户信息
	 */
	public User getUser(int userId);
	
}
