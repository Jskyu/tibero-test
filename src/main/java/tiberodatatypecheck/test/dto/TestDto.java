package tiberodatatypecheck.test.dto;

import lombok.Data;
import tiberodatatypecheck.test.model.TestEntity;

@Data
public class TestDto {

    private String hsm;
    private String mrn;
    private String msn;
    private String bl;
    private String hs;
    private String itemNm;

    private int inCnt;
    private int invAmt;

    public TestDto(TestEntity entity) {
        this.hsm = entity.getId().getHsn();
        this.mrn = entity.getMrn();
        this.msn = entity.getId().getMsn();
        this.bl = entity.getBl();
        this.itemNm = entity.getItem_nm();
        this.inCnt = entity.getIn_cnt();
        this.invAmt = entity.getInv_amt();
    }
}
