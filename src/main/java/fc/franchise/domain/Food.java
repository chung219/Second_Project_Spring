package fc.franchise.domain;

import lombok.Data;

@Data
public class Food {
    private String name;
    private String foodType;
    private String add1;
    private String add2;

    public Food(){
    }

    public Food(String name, String foodType, String add1, String add2) {
        this.name = name;
        this.foodType = foodType;
        this.add1 = add1;
        this.add2 = add2;
    }
}
