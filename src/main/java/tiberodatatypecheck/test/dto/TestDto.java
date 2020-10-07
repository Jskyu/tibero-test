package tiberodatatypecheck.test.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class TestDto {

    private String mrn;
    private String msn;
    private String bl;
//    private String hs;
    private String itemNm;

    private int inCnt;
    private int invAmt;

    @QueryProjection
    public TestDto(String mrn, String msn, String bl, String itemNm, int inCnt, int invAmt) {
        this.mrn = mrn;
        this.msn = msn;
        this.bl = bl;
        this.itemNm = itemNm;
        this.inCnt = inCnt;
        this.invAmt = invAmt;
    }
}