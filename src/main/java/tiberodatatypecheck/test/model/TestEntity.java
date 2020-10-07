package tiberodatatypecheck.test.model;

import lombok.Getter;
import lombok.Setter;
import tiberodatatypecheck.test.model.key.TestKey;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.time.LocalTime;

@Entity(name = "TEST_SEC")
@Getter @Setter
public class TestEntity {

    /**
     * MRN, MSN, HSN
     */
    @EmbeddedId
    private TestKey id;

    @Column(name = "MRN", length = 11)
    private String mrn;

    @Column(name = "BL", length = 20)
    private String bl;

    @Column(name = "PART", length = 5)
    private String part;

    @Column(name = "IN_NO1", length = 4)
    private String in_no1;

    @Column(name = "IN_NO2", length = 8)
    private String in_no2;

    @Column(name = "PKG_GBN", length = 2)
    private String pkg_gbn;

    @Column(name = "IN_DT", length = 14)
    private String in_dt;

    @Column(name = "IN_PORT", length = 3)
    private String in_port;

    @Column(name = "FWD_CODE", length = 4)
    private String fwd_code;

    @Column(name = "FWD_FIRM", length = 100)
    private String fwd_firm;

    @Column(name = "OWNER_CD", length = 4)
    private String owner_cd;

    @Column(name = "OWNER_NM", length = 100)
    private String owner_nm;

    @Column(name = "ITEM_CD", length = 2)
    private String item_cd;

    @Column(name = "ITEM_NM", length = 200)
    private String item_nm;

    @Column(name = "SHIP_NO", length = 35)
    private String ship_no;

    //반입구분코드
    @Column(name = "IN_GBN", length = 2)
    private String in_gbn;

    //보세운송기간(from)
    @Column(name = "BOND_FM", length = 8)
    private String bond_fm;

    //보세운송기간(to)
    @Column(name = "BOND_TO", length = 8)
    private String bond_to;

    //보세운송 면허번호
    @Column(name = "BOND_LIC_NO", length = 20)
    private String bond_lic_no;

    //보세운송회사
    @Column(name = "BOND_CMP", length = 20)
    private String bond_cmp;

    //포장종류
    @Column(name = "PACK_KIND", length = 3)
    private String pack_kind;

    //반입사고 구분 코드
    @Column(name = "IN_ACD_CD", length = 3)
    private String in_acd_cd;

    //반입 수량
    @Column(name = "IN_CNT")
    private int in_cnt;

    //반출 수량
    @Column(name = "OUT_CNT")
    private int out_cnt;

    //재고 수량
    @Column(name = "STK_CNT")
    private int stk_cnt;

    //반입 중량
    @Column(name = "IN_WGT")
    private int in_wgt;

    //반출 중량
    @Column(name = "OUT_WGT")
    private int out_wgt;

    //재고 중량
    @Column(name = "STK_WGT")
    private int stk_wgt;

    //반입용적
    @Column(name = "IN_CBM")
    private int in_cbm;

    //반출용적
    @Column(name = "OUT_CBM")
    private int out_cbm;

    //재고용적
    @Column(name = "STK_CBM")
    private int stk_cbm;

    //장치위치
    @Column(name = "PLC_LOC", length = 10)
    private String plc_loc;

    //장치확인일자
    @Column(name = "PLC_CONF_DT", length = 8)
    private String plc_conf_dt;

    //장치확인자
    @Column(name = "PLC_CONF_ID", length = 8)
    private String plc_conf_id;

    //체화여부
    @Column(name = "OVER_YN", length = 1)
    private String over_yn;

    //체화번호
    @Column(name = "OVER_NO", length = 10)
    private String over_no;

    //체화일자
    @Column(name = "OVER_DT", length = 8)
    private String over_dt;

    //데이터 생성 구분
    @Column(name = "DATA_CREAT_GBN", length = 1)
    private String data_creat_gbn;

    //사용자 ID
    @Column(name = "USR_ID", length = 10)
    private String usr_id;

    //사용자 비밀번호
    @Column(name = "USR_PWD", length = 10)
    private String usr_pwd;

    //작업일자
    @Column(name = "WORK_DT", length = 8)
    private String work_dt;

    //단말기 번호
    @Column(name = "TERM_ID", length = 5)
    private String term_id;

    //전자상거래 여부
    @Column(name = "ELEC_YN", length = 1)
    private String elec_yn;

    //화물 속성
    @Column(name = "IN_TYPE", length = 2)
    private String in_type;

    //검사지정 이유 (예정정보)
    @Column(name = "PASS_REASON", length = 1)
    private String pass_reason;

    //특수화물 구분
    @Column(name = "SPC_PKG_GBN", length = 1)
    private String spc_pkg_gbn;

    //조업일자
    @Column(name = "OPR_WORK_DT", length = 14)
    private String opr_work_dt;

    //입항일자
    @Column(name = "IN_PORT_DT", length = 14)
    private String in_port_dt;

    //감가
    @Column(name = "VAL")
    private double val;

    //관세
    @Column(name = "DUTY")
    private double duty;

    //적재항
    @Column(name = "UNLD_PORT_CD", length = 5)
    private String unld_port_cd;

    //발송국
    @Column(name = "SEND_NAT_CD", length = 2)
    private String send_nat_cd;

    //송하인 명
    @Column(name = "SEND_NM", length = 100)
    private String send_nm;

    //송하인 주소1
    @Column(name = "SEND_ADDR1", length = 50)
    private String send_addr1;

    //송하인 주소2
    @Column(name = "SEND_ADDR2", length = 50)
    private String send_addr2;

    //송하인 주소3
    @Column(name = "SEND_ADDR3", length = 50)
    private String send_addr3;

    //수하인 전화번호
    @Column(name = "RECV_TEL", length = 40)
    private String recv_tel;

    //수하인 명
    @Column(name = "RECV_NM", length = 100)
    private String recv_nm;

    //수하인 주소1
    @Column(name = "RECV_ADDR1", length = 50)
    private String recv_addr1;

    //수하인 주소2
    @Column(name = "RECV_ADDR2", length = 50)
    private String recv_addr2;

    //수하인 주소3
    @Column(name = "RECV_ADDR3", length = 50)
    private String recv_addr3;

    //수하인 우편번호
    @Column(name = "RECV_POST_NO", length = 5)
    private String recv_post_no;

    //전자상거래 사이트 주소
    @Column(name = "ELECT_DOMAIN", length = 100)
    private String elect_domain;

    //물품가격
    @Column(name = "INV_AMT")
    private int inv_amt;

    //물품가격 단위
    @Column(name = "INV_AMT_UNIT", length = 2)
    private String inv_amt_unit;

    //지정 번호
    @Column(name = "DIRECT_NO", length = 10)
    private String direct_no;

    //거래 유형 코드
    @Column(name = "TRADE_TYPE", length = 1)
    private String trade_type;

    //용도 구분
    @Column(name = "USE_GBN", length = 1)
    private String use_gbn;

    //컨테이너 번호1
    @Column(name = "CONTR_NO1", length = 11)
    private String contr_no1;

    //컨테이너 번호2
    @Column(name = "CONTR_NO2", length = 11)
    private String contr_no2;

    //택배사번호 [EMS:우체국, CJ:CJ대한통운(향후 추가)]
    @Column(name = "TAKBAE_NO", length = 10)
    private String takbae_no;

    //택배집하장번호 [택배사별 코드 참조]
    @Column(name = "TAKBAE_LOC", length = 10)
    private String takbae_loc;

    //특이사항 [55:징수]
    @Column(name = "UNI_MATT", length = 2)
    private String uni_matt;

    //특이사항 [55:징수]
    @Column(name = "REG_DATE")
    private LocalTime reg_date;

    //-
    @Column(name = "FLAG", length = 1)
    private String flag;

    //-
    @Column(name = "KCTDI_SEND_YN", length = 1)
    private String kctdi_send_yn;

}