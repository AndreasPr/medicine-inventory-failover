package andreasgroup.medicineinventoryfailover.configuration;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created on 26/Nov/2020 to microservices-medicine-production
 */
@Profile("local-discovery")
@Configuration
@EnableDiscoveryClient
public class LocalDiscovery {
}
