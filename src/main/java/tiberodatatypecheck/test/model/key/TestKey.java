package tiberodatatypecheck.test.model.key;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class TestKey implements Serializable {

    @Column(name = "MSN", length = 4)
    private String msn;

    @Column(name = "HSN", length = 4)
    private String hsn;

    @Column(name = "MBL", length = 20)
    private String mbl;

    public TestKey(String msn, String hsn, String mbl) {
        this.msn = msn;
        this.hsn = hsn;
        this.mbl = mbl;
    }

    protected TestKey(){}
}
