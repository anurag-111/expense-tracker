package org.expensetrackerapi.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @Value("${logging.file.name:app.log}")
    private String logFile;

    @GetMapping("/logs")
    public ResponseEntity<String> getLogs() throws IOException {
        Path path = Paths.get(logFile);
        if (Files.exists(path)) {
            String content = new String(Files.readAllBytes(path));
            return ResponseEntity.ok(content);
        }
        return ResponseEntity.notFound().build();
    }
}
