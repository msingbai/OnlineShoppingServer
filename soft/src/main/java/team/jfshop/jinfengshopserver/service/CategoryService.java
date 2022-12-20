package team.jfshop.jinfengshopserver.service;

import team.jfshop.jinfengshopserver.util.vo.ResultVO;

public interface CategoryService {

    public ResultVO listCategories();

    public ResultVO listFirstLevelCategories();

}
