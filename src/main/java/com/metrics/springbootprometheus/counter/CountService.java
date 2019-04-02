package com.metrics.springbootprometheus.counter;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class CountService {
    private final Counter count;

    public CountService(MeterRegistry registry) {
        count = Counter
                .builder("total_count")
                .description("total count custom metric")
                .register(registry);
    }

    public void increment() {
        count.increment();
    }
}