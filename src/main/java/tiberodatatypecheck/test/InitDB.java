package tiberodatatypecheck.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tiberodatatypecheck.test.model.TestEntity;
import tiberodatatypecheck.test.model.key.TestKey;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class InitDB {

//    private final InitService initService;

//    @PostConstruct
//    public void init(){
//        initService.dbInit1();
//    }

/*
    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService{

        private final EntityManager em;

        public void dbInit1() {
            TestEntity entity = new TestEntity();

            entity.setId(new TestKey("MSN", "HSN", "MBL"));

            entity.setMrn("D");
            entity.setBl("D");
            entity.setPart("D");
            entity.setIn_no1("D");
            entity.setIn_no2("D");
            entity.setPkg_gbn("D");
            entity.setIn_dt("D");
            entity.setIn_port("D");
            entity.setFwd_code("D");
            entity.setFwd_firm("D");
            entity.setOwner_cd("D");
            entity.setOwner_nm("D");
            entity.setItem_cd("D");
            entity.setItem_nm("D");
            entity.setShip_no("D");
            entity.setIn_gbn("D");
            entity.setBond_fm("D");
            entity.setBond_to("D");
            entity.setBond_lic_no("D");
            entity.setBond_cmp("D");
            entity.setPack_kind("D");
            entity.setIn_acd_cd("D");
            entity.setIn_cnt(10);
            entity.setOut_cnt(10);
            entity.setStk_cnt(10);
            entity.setIn_wgt(10);
            entity.setOut_wgt(10);
            entity.setStk_wgt(10);
            entity.setIn_cbm(10);
            entity.setOut_cbm(10);
            entity.setStk_cbm(10);
            entity.setPlc_loc("D");
            entity.setPlc_conf_dt("D");
            entity.setPlc_conf_id("D");
            entity.setOver_yn("D");
            entity.setOver_no("D");
            entity.setOver_dt("D");
            entity.setData_creat_gbn("D");
            entity.setUsr_id("D");
            entity.setUsr_pwd("D");
            entity.setWork_dt("D");
            entity.setTerm_id("D");
            entity.setElec_yn("D");
            entity.setIn_type("D");
            entity.setPass_reason("D");
            entity.setSpc_pkg_gbn("D");
            entity.setOpr_work_dt("D");
            entity.setIn_port_dt("D");
            entity.setVal(10);
            entity.setDuty(10);
            entity.setUnld_port_cd("D");
            entity.setSend_nat_cd("D");
            entity.setSend_nm("D");
            entity.setSend_addr1("D");
            entity.setSend_addr2("D");
            entity.setSend_addr3("D");
            entity.setRecv_tel("D");
            entity.setRecv_nm("D");
            entity.setRecv_addr1("D");
            entity.setRecv_addr2("D");
            entity.setRecv_addr3("D");
            entity.setRecv_post_no("D");
            entity.setElect_domain("D");
            entity.setInv_amt(10);
            entity.setInv_amt_unit("D");
            entity.setDirect_no("D");
            entity.setTrade_type("D");
            entity.setUse_gbn("D");
            entity.setContr_no1("D");
            entity.setContr_no2("D");
            entity.setTakbae_no("D");
            entity.setTakbae_loc("D");
            entity.setUni_matt("D");
            entity.setReg_date(LocalTime.from(LocalDateTime.now()));
            entity.setFlag("D");
            entity.setKctdi_send_yn("D");

            em.persist(entity);
        }
    }
*/

}
