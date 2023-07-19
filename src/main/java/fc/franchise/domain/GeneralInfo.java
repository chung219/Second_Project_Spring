package fc.franchise.domain;


import lombok.Data;


// 가맹본부_일반정보_상세_제공_서비스
// 오라클 FH_GENERAL_INFO
@Data
public class GeneralInfo {
    private long year;
    private String industryName; // 법인명
    private long businessNumber; // 사업자등록번호
    private long corporationNumber; // 법인등록번호
    private String ceoName; // 대표자명
    private String addressX; // 구우편주소
    private String companyAddress; // 소재지주소
    private String getCompanyAddressDetail; // 소재지상세주소


    public GeneralInfo() {
    }

    public GeneralInfo(long year, String industryName, long businessNumber, long corporationNumber, String ceoName, String addressX, String companyAddress, String getCompanyAddressDetail) {
        this.year = year;
        this.industryName = industryName;
        this.businessNumber = businessNumber;
        this.corporationNumber = corporationNumber;
        this.ceoName = ceoName;
        this.addressX = addressX;
        this.companyAddress = companyAddress;
        this.getCompanyAddressDetail = getCompanyAddressDetail;
    }
}
