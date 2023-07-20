package fc.franchise.domain;

import lombok.Data;

@Data
public class Food {
    private String category;
    private String brandName;
    private String foodType;
    private String add1;
    private String add2;
    private String tel;
    private Float reviewScore;
    private String longitude;
    private String latitude;


    public Food(){
    }

    public Food(String category, String brandName, String foodType, String add1, String add2, String tel, Float reviewScore, String longitude, String latitude) {
        this.category = category;
        this.brandName = brandName;
        this.foodType = foodType;
        this.add1 = add1;
        this.add2 = add2;
        this.tel = tel;
        this.reviewScore = reviewScore;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
