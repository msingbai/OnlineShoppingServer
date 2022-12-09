package team.jfshop.jinfengshopserver.dao;


import com.github.pagehelper.Page;
import team.jfshop.jinfengshopserver.bean.AdminBean;

import java.util.Map;

//@Mapper
public interface AdminDao {

    Page<AdminBean> selectAllUserInfo();

    int selectUserCount();

    String getPassword(String userName);

    String getUserRole(String userName);

    int addUser(Map<String,Object> paramMap);

    int delUserById(String id);

    Page<AdminBean> slectUserByName(String userName);

    int auditUserName(String userName);

    int modifyPwdByUserName(Map<String,Object> paramMap);

    int modifyAuthorById(Map<String,Object> paramMap);

}
