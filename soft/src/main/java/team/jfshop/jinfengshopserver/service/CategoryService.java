package team.jfshop.jinfengshopserver.service;

import team.jfshop.jinfengshopserver.vo.ResultVO;

public interface CategoryService {

    public ResultVO listCategories();

    public ResultVO listFirstLevelCategories();

}
