package top.instafever.javas.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import top.instafever.javas.entity.User;
import top.instafever.javas.mapper.UserMapper;
import top.instafever.javas.service.UserService;

/**
 * 用户数据库服务实现
 */
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
