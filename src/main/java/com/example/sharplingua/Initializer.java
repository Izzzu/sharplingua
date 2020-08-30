package com.example.sharplingua;

import com.example.sharplingua.fileupload.service.FilesStorageService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
class Initializer implements CommandLineRunner {

    @Resource
    FilesStorageService storageService;

    public Initializer() {

    }

    @Override
    public void run(String... strings) {

        System.out.println("Spring boot test app");
        storageService.init();

    }
}