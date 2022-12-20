package team.jfshop.jinfengshopserver.service;

import team.jfshop.jinfengshopserver.bean.ShoppingCart;
import team.jfshop.jinfengshopserver.util.vo.ResultVO;

public interface ShoppingCartService {

    public ResultVO addShoppingCart(ShoppingCart cart);

    public ResultVO listShoppingCartsByUserId(int userId);

    public ResultVO updateCartNum(int cartId,int cartNum);

    public ResultVO listShoppingCartsByCids(String cids);

}
