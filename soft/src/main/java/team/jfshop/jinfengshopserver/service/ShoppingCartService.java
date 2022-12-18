package team.jfshop.jinfengshopserver.service;

import team.jfshop.jinfengshopserver.vo.ResultVO;
import team.jfshop.jinfengshopserver.entity.ShoppingCart;

public interface ShoppingCartService {

    public ResultVO addShoppingCart(ShoppingCart cart);

    public ResultVO listShoppingCartsByUserId(int userId);

    public ResultVO updateCartNum(int cartId,int cartNum);

    public ResultVO listShoppingCartsByCids(String cids);
}
