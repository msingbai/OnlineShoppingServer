package team.jfshop.jinfengshopserver.dao;


import org.apache.ibatis.annotations.Param;
import team.jfshop.jinfengshopserver.bean.ProductComments;
import team.jfshop.jinfengshopserver.bean.ProductCommentsVO;

import java.util.List;

public interface ProductCommentsMapper extends GeneralDAO<ProductComments> {
    /**
     *
     * @param productId  商品id
     * @param start  起始索引
     * @param limit  查询条数
     * @return
     */
    public List<ProductCommentsVO> selectCommentsVo(@Param("productId") String productId, @Param("start") int start, @Param("limit") int limit);
}