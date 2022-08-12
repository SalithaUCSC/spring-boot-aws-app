package com.example.demoapp.configs;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements HealthIndicator {
    @Override
    public Health health() {
        if (isLoggingEnabled()) return Health.up().withDetail("logging", "Loggers are enabled").build();
        return Health.down().withDetail("logging", "Loggers are disabled").build();
    }

    private boolean isLoggingEnabled() {
        return false; // this is the place we need a proper implementation
    }
}
