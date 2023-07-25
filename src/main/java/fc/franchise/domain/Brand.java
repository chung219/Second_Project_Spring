package fc.franchise.domain;

import lombok.Data;

@Data
public class Brand {

    // 가맹정보_브랜드별_가맹점_현황_제공_서비스
    // 오라클 BRAND_FR_PRO
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
    private double departureRate;
    private double figure;

    public Brand() {
    }

    public Brand(long year, String industryCategory, String industryClassification, String industryName, String brandName, long franchisesNumber, long newBrandNum, long endCount, long cancelCount, long avgSales, double departureRate, double figure) {
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
        this.departureRate = departureRate;
        this.figure = figure;
    }
}
