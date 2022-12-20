package team.jfshop.jinfengshopserver.impl;


import team.jfshop.jinfengshopserver.dao.CategoryMapper;
import team.jfshop.jinfengshopserver.bean.CategoryVo;
import team.jfshop.jinfengshopserver.service.CategoryService;
import team.jfshop.jinfengshopserver.util.vo.ResStatus;
import team.jfshop.jinfengshopserver.util.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 查询分类列表（包含三个级别的分类）
     * @return
     */
    public ResultVO listCategories() {
        List<CategoryVo> categoryVOS = categoryMapper.selectAllCategories();
        ResultVO resultVO = new ResultVO(ResStatus.OK, "success", categoryVOS);
        return resultVO;
    }

    /**
     * 查询所有一级分类，同时查询当前一级分类下销量最高的6个商品
     * @return
     */
    public ResultVO listFirstLevelCategories() {
        List<CategoryVo> categoryVOS = categoryMapper.selectFirstLevelCategories();
        ResultVO resultVO = new ResultVO(ResStatus.OK, "success", categoryVOS);
        return resultVO;
    }

}
