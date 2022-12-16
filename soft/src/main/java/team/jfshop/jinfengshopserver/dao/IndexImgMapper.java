package team.jfshop.jinfengshopserver.dao;


import team.jfshop.jinfengshopserver.bean.IndexImg;

import java.util.List;

public interface IndexImgMapper extends GeneralDAO<IndexImg> {


    //1.查询轮播图信息 查询statis=1且按照seq进行排序
    public List<IndexImg> listIndexImags();

}