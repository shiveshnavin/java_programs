# Java Concepts
---

````markdown
# Java 11 to 21 + Spring Boot Concepts and Migration Guide

This guide covers essential **Java features (11 to 21)** and **Spring Boot updates** relevant to modern Spring Boot applications, including REST APIs, microservices, security, and performance optimization.

---

## 🟢 Java 11 to 21: Key Concepts for Spring Boot Projects

### 🔹 Java 11 (LTS)
- `var` in lambda:
  ```java
  list.forEach((var item) -> System.out.println(item));
````

* New `HttpClient` API:

  ```java
  HttpClient client = HttpClient.newHttpClient();
  HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create("https://example.com"))
      .build();
  ```
* String API improvements:

  * `isBlank()`, `lines()`, `strip()`, `repeat()`

---

### 🔹 Java 12–14

* **Switch Expressions (preview):**

  ```java
  var result = switch (day) {
      case MONDAY, FRIDAY -> "Work";
      case SATURDAY, SUNDAY -> "Rest";
      default -> throw new IllegalStateException();
  };
  ```
* **Records (Preview in Java 14)** – Great for DTOs.

---

### 🔹 Java 15–16

* **Records (Stable in Java 16):**

  ```java
  public record UserDto(String name, int age) {}
  ```
* **Pattern Matching for `instanceof`:**

  ```java
  if (obj instanceof String s) {
      System.out.println(s.toLowerCase());
  }
  ```

---

### 🔹 Java 17 (LTS)

* **Sealed Classes**:

  ```java
  public sealed class Shape permits Circle, Square {}
  ```
* GC and performance improvements

---

### 🔹 Java 18–20

* Mostly preview features:

  * Pattern matching for switch
  * Record patterns
  * Virtual Threads (Preview in Java 19/20)

---

### 🔹 Java 21 (LTS)

* **Virtual Threads (Stable):**

  ```java
  try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
      executor.submit(() -> dbCall());
  }
  ```
* Structured Concurrency
* Record Patterns
* Scoped Values (alternative to ThreadLocal)
```
  public final static ScopedValue<User> LOGGED_IN_USER = ScopedValue.newInstance();
  ScopedValue.where(LOGGED_IN_USER, user.get())
                .run(() -> controller.processRequest(request, response));
  User loggedInUser = Server.LOGGED_IN_USER.get();
```
---

## 🟢 Spring Boot Upgrades (2.5 → 3.x)

### 🔸 Spring Boot 3.x + Spring Framework 6

* Java 17+ required
* Migration from `javax.*` → `jakarta.*`
* Native compilation support with GraalVM
* Virtual Thread compatibility
* Observability: Micrometer, tracing
* RFC 7807 support for error responses

---

## 🔸 Spring Boot Relevant Concepts

| Area                   | Key Concepts                                           |
| ---------------------- | ------------------------------------------------------ |
| 🔌 REST APIs           | `@RestController`, `@RequestBody`, `@ControllerAdvice` |
| 💾 Data Layer          | Spring Data JPA, QueryDSL, `@Transactional`            |
| 🛡 Security            | Spring Security (OAuth2, JWT, RBAC), `@PreAuthorize`   |
| 🛠 Dev Tools           | Spring DevTools, Actuator                              |
| 🧪 Testing             | `@SpringBootTest`, MockMVC, Testcontainers             |
| ⚙️ Config              | `application.yml`, Profiles, Config Server             |
| 🌐 HTTP Clients        | WebClient, RestTemplate                                |
| 🧵 Async & Concurrency | `@Async`, Virtual Threads (Java 21)                    |
| ☁️ Deployment          | Docker, K8s, Layered Jars                              |

---

## 🔧 Migration Advice

### ✅ Java 11 → 17 or 21:

* Update build configuration (`sourceCompatibility`)
* Migrate `javax.*` → `jakarta.*`
* Use records for DTOs
* Introduce virtual threads for high I/O workloads

### ✅ Spring Boot 2.x → 3.x:

* Replace all `javax.*` with `jakarta.*`
* Ensure all dependencies are 3.x compatible
* Update to Spring Security 6 (new DSL)
* Review and replace deprecated actuator endpoints

---

## 🧰 Need More?

Want a **migration checklist** or **code upgrade examples**? Just ask.

```

---

Let me know if you want this exported as a file or included in a GitHub README structure.
```
