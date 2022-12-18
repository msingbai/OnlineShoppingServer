package team.jfshop.jinfengshopserver.service;

import team.jfshop.jinfengshopserver.bean.ShoppingCart;
import team.jfshop.jinfengshopserver.vo.ResultVO;

import java.util.List;

public interface ShoppingCartService {

    public ResultVO addShoppingCart(ShoppingCart cart);

    public ResultVO listShoppingCartsByUserId(int userId);

    public ResultVO updateCartNum(int cartId,int cartNum);

    public ResultVO listShoppingCartsByCids(String cids);

}
