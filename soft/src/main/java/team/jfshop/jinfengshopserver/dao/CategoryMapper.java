package team.jfshop.jinfengshopserver.dao;
import team.jfshop.jinfengshopserver.bean.Category;
import team.jfshop.jinfengshopserver.bean.CategoryVo;

import java.util.List;

public interface CategoryMapper extends GeneralDAO<Category> {
    //这里我们使用连接查询
    List<CategoryVo> selectAllCategories();
    //我们这里使用子查询的方式   根据parent_id 查询菜单
    List<CategoryVo> selectAllCategories_id(int parentId);

    //查询一级类别
    List<CategoryVo> selectFirstLevelCategories();

}