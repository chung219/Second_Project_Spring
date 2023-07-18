package fc.franchise.domain;

import lombok.Data;

@Data
public class Address {
    private String year;
    private String brandName;
    private String firstAddress;
    private String secondAddress;

    public Address(){
    }

    public Address(String year, String brandName, String firstAddress, String secondAddress) {
        this.year = year;
        this.brandName = brandName;
        this.firstAddress = firstAddress;
        this.secondAddress = secondAddress;
    }
}
