package team.jfshop.jinfengshopserver.dao;

import org.apache.ibatis.annotations.Param;
import team.jfshop.jinfengshopserver.bean.ShoppingCart;
import team.jfshop.jinfengshopserver.bean.ShoppingCartVo;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ShoppingCartMapper extends GeneralDAO<ShoppingCart> {
    public List<ShoppingCartVo> selectShopcartByUserId(int userId);


    int upadateShoppingCartByCartid(@Param("cartId") int cartId,@Param("cartNum") int cartNum);

    /**
     * 查询我们的订单
     * @param lists
     * @return
     */
    List<ShoppingCartVo> selectShopcartByCids(List<Integer> lists);



    List<ShoppingCartVo> selectShopcartByCids_Sku(List<Integer> lists);

}