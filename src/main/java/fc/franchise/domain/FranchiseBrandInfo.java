package fc.franchise.domain;

import lombok.Data;

@Data
public class FranchiseBrandInfo {

    private Long registrationNumber; // 가맹정보등록번호
    private String brandName; // 브랜드명
    private String industryCategory; // 업종대분류명
    private String industryClassification; // 업종중분류명
    private String year; // 연도
    private String areaName; // 지역명
    private long franchisesNumber; // 가맹점수
    private long directStoreNumber; // 직영점포수
    private long totalNumberStores; // 전체점포수

    public FranchiseBrandInfo() {
    }

    public FranchiseBrandInfo(Long registrationNumber, String brandName, String industryCategory, String industryClassification, String year, String areaName, long franchisesNumber, long directStoreNumber, long totalNumberStores) {
        this.registrationNumber = registrationNumber;
        this.brandName = brandName;
        this.industryCategory = industryCategory;
        this.industryClassification = industryClassification;
        this.year = year;
        this.areaName = areaName;
        this.franchisesNumber = franchisesNumber;
        this.directStoreNumber = directStoreNumber;
        this.totalNumberStores = totalNumberStores;
    }
}
