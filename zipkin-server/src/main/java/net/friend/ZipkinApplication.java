package net.friend;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ZipkinApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ZipkinApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}
