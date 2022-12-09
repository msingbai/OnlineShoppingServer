package team.jfshop.jinfengshopserver.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product4ES {

    private String productId;

    private String productName;

    private int soldNum;

    private String productImg;

    private String productSkuName;

    private double productSkuPrice;

}
