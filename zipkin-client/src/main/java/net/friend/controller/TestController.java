package net.friend.controller;


import brave.ScopedSpan;
import brave.Tracer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

  @Autowired
  private Tracer tracer;

  @GetMapping("/test1")
  public ResponseEntity test1() {

    log.info("test api 1");
    ScopedSpan span = tracer.startScopedSpan("Test Span");

    return new ResponseEntity("ok 1", HttpStatus.OK);
  }

  @GetMapping("/test2")
  public ResponseEntity tes2t() {

    log.info("test api 2");

    return new ResponseEntity("ok 2", HttpStatus.OK);
  }

}
