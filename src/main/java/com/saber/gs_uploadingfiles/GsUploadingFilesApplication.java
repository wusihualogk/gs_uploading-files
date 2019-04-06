package com.saber.gs_uploadingfiles;

import com.saber.gs_uploadingfiles.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GsUploadingFilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GsUploadingFilesApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StorageService storageService) {
        return args -> {
            storageService.deleteAll();
            storageService.init();
        };
    }

}
