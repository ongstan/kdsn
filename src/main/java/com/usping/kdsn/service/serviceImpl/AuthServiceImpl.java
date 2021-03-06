package com.usping.kdsn.service.serviceImpl;

import com.usping.kdsn.bean.Source;
import com.usping.kdsn.bean.User;
import com.usping.kdsn.dao.AuthDao;
import com.usping.kdsn.service.AuthService;
import com.usping.kdsn.util.model.ResponseMessage;
import com.usping.kdsn.util.tools.TokenTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class AuthServiceImpl implements AuthService<User>, Serializable {

    private final Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);

    private static final long serialVersionUID = 8265805899632485285L;
    private final AuthDao authDao;

    @Autowired
    public AuthServiceImpl(AuthDao authDao) {
        this.authDao = authDao;
    }

    @Override
    public int delete(User t) {
        return 0;
    }

    @Override
    public int update(User t) {
        return 0;
    }

    @Override
    public int insert(User t) {
        return 0;
    }

    @Override
    public User select(User t) {
        return null;
    }


    /**
     * 判断状态信息
     *
     * @param loginUser 传入登录用户信息
     * @return 返回ResponseMessage, 其中封装了 http状态， 成功与否， 返回信息
     */
    @Override
    public ResponseMessage verifyPassword(User loginUser) {
        if (loginUser.getUserAccount().trim().length() == 0
                || loginUser.getUserAccount() == null
                || loginUser.getUserPassword().trim().length() == 0
                || loginUser.getUserPassword() == null) {
            logger.info("禁止非法登录");
            return ResponseMessage.builder().successStatus(false)
                    .httpStatus(HttpStatus.NOT_ACCEPTABLE).messageContent("返回信息有误").build();
        }
        logger.info("登录信息为" + loginUser.toString());

        try {
            List<User> userList = authDao.selectByAccount(loginUser.getUserAccount());
            if (userList == null || userList.size() != 1) {
                logger.info("未查询到信息");
                return ResponseMessage.builder().successStatus(false).httpStatus(HttpStatus.NOT_ACCEPTABLE).messageContent("无此帐号").build();
            }
            User dbUser = userList.get(0);

            if (dbUser.getUserPassword().equals(loginUser.getUserPassword())) {
                logger.info("用户" + loginUser.getUserAccount() + "完成登录");

                String token = TokenTool.generateToken(loginUser.getUserAccount());
                List<User> dataList = new ArrayList<>();

                dbUser.setAuthorizationToken(token);
                dataList.add(dbUser);

                return ResponseMessage.<User>builder().successStatus(true).responseData(dataList)
                        .messageContent("密码正确，允许登录").httpStatus(HttpStatus.OK).build();
            }
            return ResponseMessage.builder().successStatus(false).httpStatus(HttpStatus.NOT_ACCEPTABLE).messageContent("登录信息有误").build();
        } catch (DataAccessException e) {
            logger.info("登录异常");
            return ResponseMessage.builder().successStatus(false).httpStatus(HttpStatus.NOT_ACCEPTABLE).messageContent("网络异常,请联系管理员").build();
        }

    }


    /**
     * 给定注册用户，判断后返回
     *
     * @param registerUser 传入注册用户信息
     * @return 注册成功信息
     */
    @Override
    public ResponseMessage register(User registerUser) {
        List<User> tmpUserList;

        try {
            tmpUserList = authDao.selectByAccount(registerUser.getUserAccount());
            if (tmpUserList != null && tmpUserList.size() > 0) {
                return ResponseMessage.builder().successStatus(false).httpStatus(HttpStatus.CONFLICT).messageContent("账户已经存在").build();
            }

            tmpUserList = authDao.selectByEmail(registerUser.getUserEmail());

            if (tmpUserList != null && tmpUserList.size() > 0) {
                return ResponseMessage.builder().successStatus(false).httpStatus(HttpStatus.CONFLICT).messageContent("邮箱已经存在").build();
            }

            tmpUserList = authDao.selectByNickname(registerUser.getUserNickname());

            if (tmpUserList != null && tmpUserList.size() > 0) {
                return ResponseMessage.builder().successStatus(false).httpStatus(HttpStatus.CONFLICT).messageContent("昵称已经被使用").build();
            }
            try {
                authDao.insert(registerUser);
                return ResponseMessage.builder().successStatus(true).httpStatus(HttpStatus.OK).messageContent("注册成功").build();
            } catch (DataAccessException e) {
                logger.info("异常记录" + e.getLocalizedMessage());
                return ResponseMessage.builder().successStatus(false).httpStatus(HttpStatus.EXPECTATION_FAILED).messageContent("网络连接异常，请联系管理员").build();
            }
        } catch (DataAccessException e) {
            return ResponseMessage.builder().successStatus(false).httpStatus(HttpStatus.EXPECTATION_FAILED).messageContent("网络连接异常，请联系管理员").build();
        }

    }
}
