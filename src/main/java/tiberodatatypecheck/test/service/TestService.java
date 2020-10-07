package tiberodatatypecheck.test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tiberodatatypecheck.test.repository.TestRepository;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository secRepository;

}
