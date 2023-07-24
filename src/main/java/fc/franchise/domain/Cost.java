package fc.franchise.domain;

import lombok.Data;

@Data
public class Cost {

    // 전 프랜차이즈 기본 정보, 창업비용
    // 오라클 comparison

    private String year; // 기준년도
    private String brandName; // 브랜드명
    private String industryCategory; // 업종대분류명
    private String industryClassification; // 업종중분류명
    private long memberAmount; // 가맹금액
    private long trainingAmount; // 교육금액
    private long guaranteedAmount; // 보증금액
    private long totalAmount; // 합계금액
    private long interiorAmount; // 인테리어금액
    private long initialContractYears; // 최초계약년수
    private long extendedContract; // 연장계약년수

    public Cost() {
    }

    public Cost(String year, String brandName, String industryCategory, String industryClassification, long memberAmount, long trainingAmount, long guaranteedAmount, long totalAmount, long interiorAmount, long initialContractYears, long extendedContract) {
        this.year = year;
        this.brandName = brandName;
        this.industryCategory = industryCategory;
        this.industryClassification = industryClassification;
        this.memberAmount = memberAmount;
        this.trainingAmount = trainingAmount;
        this.guaranteedAmount = guaranteedAmount;
        this.totalAmount = totalAmount;
        this.interiorAmount = interiorAmount;
        this.initialContractYears = initialContractYears;
        this.extendedContract = extendedContract;
    }
}
