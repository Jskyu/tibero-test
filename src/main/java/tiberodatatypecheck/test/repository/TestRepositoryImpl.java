package tiberodatatypecheck.test.repository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import tiberodatatypecheck.test.dto.TestDto;

import java.util.List;

import static tiberodatatypecheck.test.model.QTestEntity.testEntity;

@Repository
@RequiredArgsConstructor
public class TestRepositoryImpl implements TestRepositoryCustom {

    private final JPAQueryFactory query;

    @Override
    public List<TestDto> _1test() {
        return query.select(Projections.constructor(TestDto.class,
                testEntity.mrn, testEntity.id.msn, testEntity.bl,
                testEntity.item_nm, testEntity.in_cnt, testEntity.inv_amt))
                .from(testEntity)
                .fetch();
    }
}