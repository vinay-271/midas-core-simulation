package com.jpmc.midascore.service;

import com.jpmc.midascore.foundation.Incentive;
import com.jpmc.midascore.foundation.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IncentiveService {

    private static final String INCENTIVE_URL = "http://localhost:8080/incentive";
    private final RestTemplate restTemplate = new RestTemplate();

    public float fetchIncentive(Transaction transaction) {
        Incentive incentive = restTemplate.postForObject(INCENTIVE_URL, transaction, Incentive.class);
        return incentive != null ? incentive.getAmount() : 0f;
    }
}
