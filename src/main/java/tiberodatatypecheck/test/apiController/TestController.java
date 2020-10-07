package tiberodatatypecheck.test.apiController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tiberodatatypecheck.test.dto.TestDto;
import tiberodatatypecheck.test.service.TestService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test1")
    public Result test1(){
        List<TestDto> testDtos = testService._1test();
        return new Result(testDtos.size(), testDtos);
    }

    @Data
    @AllArgsConstructor
    static class Result<T>{
        private int count;
        private T data;
    }

}
