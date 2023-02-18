package com.td.test.injectiontest.service;

import com.td.test.injectiontest.dto.Jujilipa;
import com.td.test.injectiontest.dto.Sakeela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TestServiceImpl implements TestService {

    @Autowired(required = false)
    Sakeela sakeela;

    @Autowired(required = false)
    Jujilipa jujilipa;

    @Override
    public void getAS() {
        try {
            if (Objects.nonNull(sakeela)) {
                System.out.println("Sakeela ");
            }
            if (Objects.nonNull(jujilipa)){
                System.out.println("Jujilipa");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
