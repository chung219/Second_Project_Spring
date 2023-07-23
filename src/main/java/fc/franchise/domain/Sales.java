package fc.franchise.domain;


import lombok.Data;

// 매출액_가맹본부_상위_순위_통계_제공_서비스
// 오라클 FR_TOP
@Data
public class Sales {
    private String year; // 기준년도
    private String IndustryCategory; // 업종대분류명
    private String industryClassification; // 업종중분류명
    private String industryName; // 법인명
    private long totalOfAssets; // 자산총금액
    private long totalOfCapital; // 자본총금액
    private long totalOfLiabilities; // 부채총금액
    private long amount; // 총매출금액
    private long totalOperating; // 영업이익금액
    private long CurrentProfit; // 당기순이익금액


    public Sales() {
    }

    public Sales(String year, String industryCategory, String industryClassification, String industryName, long totalOfAssets, long totalOfCapital, long totalOfLiabilities, long amount, long totalOperating, long currentProfit) {
        this.year = year;
        IndustryCategory = industryCategory;
        this.industryClassification = industryClassification;
        this.industryName = industryName;
        this.totalOfAssets = totalOfAssets;
        this.totalOfCapital = totalOfCapital;
        this.totalOfLiabilities = totalOfLiabilities;
        this.amount = amount;
        this.totalOperating = totalOperating;
        CurrentProfit = currentProfit;
    }
}
