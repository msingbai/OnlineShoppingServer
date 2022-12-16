package team.jfshop.jinfengshopserver.dao;

import team.jfshop.jinfengshopserver.bean.ProductSku;

import java.util.List;

public interface ProductSkuMapper extends GeneralDAO<ProductSku> {


    /**
     * 根据商品id 查询当前商品中价格最低的套餐
     * @param productID
     * @return
     */
    public List<ProductSku> selectLowestPriceByProductId(String productID);
}