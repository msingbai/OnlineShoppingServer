package team.fengmishop.demo.service;

import com.github.pagehelper.Page;
import team.fengmishop.demo.bean.AdminBean;

import java.util.Map;

public interface AdminService {

    Page<AdminBean> selectAllUserInfo(Integer page, Integer limit);

    int selectUserCount();

    String getPassword(String userName);

    String getUserRole(String userName);

    int addUser(Map<String,Object> paramMap);

    int delUserById(String id);

    Page<AdminBean> slectUserByName(String userName, Integer page, Integer limit);

    int auditUserName(String userName);

    int modifyPwdByUserName(Map<String,Object> paramMap);

    int modifyAuthorById(Map<String,Object> paramMap);

}
