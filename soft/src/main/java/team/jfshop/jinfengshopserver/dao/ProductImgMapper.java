package team.jfshop.jinfengshopserver.dao;
import team.jfshop.jinfengshopserver.bean.ProductImg;

import java.util.List;

public interface ProductImgMapper extends GeneralDAO<ProductImg> {



    public List<ProductImg> selectProductImgFind(int product_id);


}