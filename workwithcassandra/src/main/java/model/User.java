package model;

import lombok.Builder;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder(toBuilder = true)
//@Builder(builderClassName = "customer", builderMethodName = "gett", buildMethodName = "myMethod")
@ToString
public class User {
    private UUID uuid;
    private String name;
    private int age;
    @Builder.Default private LocalDateTime registration = LocalDateTime.now();
}
