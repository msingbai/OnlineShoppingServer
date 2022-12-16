package team.jfshop.jinfengshopserver.dao;


import team.jfshop.jinfengshopserver.bean.OrderItem;

import java.util.List;

public interface OrderItemMapper extends GeneralDAO<OrderItem> {

    public List<OrderItem> listOrderItemsByOrderId(String orderId);
}