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


}
