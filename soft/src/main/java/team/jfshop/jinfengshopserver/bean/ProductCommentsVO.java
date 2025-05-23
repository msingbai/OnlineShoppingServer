package team.jfshop.jinfengshopserver.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCommentsVO {
    private String commId;

    private String productId;

    private String productName;

    private String orderItemId;

    private Integer isAnonymous;

    private Integer commType;

    private Integer commLevel;

    private String commContent;

    private String commImgs;

    private Date sepcName;

    private Integer replyStatus;

    private String replyContent;

    private Date replyTime;

    private Integer isShow;
    private String userId;
    private String username;
    private String nickname;
    private String userImg;
}