package team.jfshop.jinfengshopserver.impl;


import team.jfshop.jinfengshopserver.dao.IndexImgMapper;
import team.jfshop.jinfengshopserver.bean.IndexImg;
import team.jfshop.jinfengshopserver.service.IndexImgService;
import team.jfshop.jinfengshopserver.util.vo.ResStatus;
import team.jfshop.jinfengshopserver.util.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexImgServiceImpl implements IndexImgService {

    @Autowired
    private IndexImgMapper indexImgMapper;

    public ResultVO listIndexImgs() {
        List<IndexImg> indexImgs = indexImgMapper.listIndexImags();
        if(indexImgs.size()==0){
            return new ResultVO(ResStatus.NO,"fail",null);
        }else{
            return new ResultVO(ResStatus.OK,"success",indexImgs);
        }
    }
}
