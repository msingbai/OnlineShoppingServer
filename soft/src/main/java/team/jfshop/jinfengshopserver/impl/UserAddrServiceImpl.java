package team.jfshop.jinfengshopserver.impl;


import team.jfshop.jinfengshopserver.dao.UserAddrMapper;
import team.jfshop.jinfengshopserver.bean.UserAddr;
import team.jfshop.jinfengshopserver.service.UserAddrService;
import team.jfshop.jinfengshopserver.util.vo.ResStatus;
import team.jfshop.jinfengshopserver.util.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserAddrServiceImpl implements UserAddrService {

    @Autowired
    private UserAddrMapper userAddrMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    public ResultVO listAddrsByUid(int userId) {
        Example example = new Example(UserAddr.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId",userId);
        criteria.andEqualTo("status",1);

        List<UserAddr> userAddrs = userAddrMapper.selectByExample(example);
        ResultVO resultVO = new ResultVO(ResStatus.OK, "success", userAddrs);
        return resultVO;
    }
}
