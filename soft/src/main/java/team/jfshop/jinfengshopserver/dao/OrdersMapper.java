package team.jfshop.jinfengshopserver.dao;


import org.apache.ibatis.annotations.Param;
import team.jfshop.jinfengshopserver.bean.Orders;
import team.jfshop.jinfengshopserver.bean.OrdersVo;

import java.util.List;

public interface OrdersMapper extends GeneralDAO<Orders> {
    List<OrdersVo> selectOrders(@Param("userId") String userId, @Param("status") String status, @Param("start") int start, @Param("limit")int limit);
}