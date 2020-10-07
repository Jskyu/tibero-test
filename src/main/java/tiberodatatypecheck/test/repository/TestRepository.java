package tiberodatatypecheck.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tiberodatatypecheck.test.model.TestEntity;
import tiberodatatypecheck.test.model.key.TestKey;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, TestKey>, TestRepositoryCustom {}
