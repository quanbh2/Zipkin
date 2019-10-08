package net.friend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipkinClientApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ZipkinClientApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {}
}
