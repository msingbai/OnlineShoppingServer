package team.jfshop.jinfengshopserver.dao;

import org.apache.ibatis.annotations.Param;
import team.jfshop.jinfengshopserver.bean.ShoppingCart;
import team.jfshop.jinfengshopserver.bean.ShoppingCartVo;

import java.util.List;


public interface ShoppingCartMapper extends GeneralDAO<ShoppingCart> {
    public List<ShoppingCartVo> selectShopcartByUserId(String id);


    int upadateShoppingCartByCartid(@Param("carId") int carId,@Param("cartNum") int cartNum);

    /**
     * 查询我们的订单
     * @param lists
     * @return
     */
    List<ShoppingCartVo> selectShopcartByyCids(List<Integer> lists);



    List<ShoppingCartVo> selectShopcartByyCids_Sku(List<Integer> lists);


}