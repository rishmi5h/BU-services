package org.rishmi5h.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfig {

    @Value("{USERNAME}")
    private String USERNAME;

    @Value("{PASSWORD}")
    private String PASSWORD;
}
