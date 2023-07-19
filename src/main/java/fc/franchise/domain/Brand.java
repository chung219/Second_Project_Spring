package fc.franchise.domain;

import lombok.Data;

@Data
public class Brand {

    private long year;
    private String industryCategory;
    private String industryClassification;
    private String industryName;
    private String brandName;
    private long franchisesNumber;
    private long newBrandNum;
    private long endCount;
    private long cancelCount;
    private long avgSales;

    public Brand() {
    }

    public Brand(long year, String industryCategory, String industryClassification, String industryName, String brandName, long franchisesNumber, long newBrandNum, long endCount, long cancelCount, long avgSales) {
        this.year = year;
        this.industryCategory = industryCategory;
        this.industryClassification = industryClassification;
        this.industryName = industryName;
        this.brandName = brandName;
        this.franchisesNumber = franchisesNumber;
        this.newBrandNum = newBrandNum;
        this.endCount = endCount;
        this.cancelCount = cancelCount;
        this.avgSales = avgSales;
    }
}
