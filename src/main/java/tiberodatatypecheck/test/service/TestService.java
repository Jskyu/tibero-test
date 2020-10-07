package tiberodatatypecheck.test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tiberodatatypecheck.test.dto.TestDto;
import tiberodatatypecheck.test.repository.TestRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TestService {

    private final TestRepository testRepository;

    public List<TestDto> _1test() {
        return testRepository._1test();
    }
}
