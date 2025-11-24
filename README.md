# Java Naming Conventions

## 1. Maven Project Coordinates

### Group ID
Lowercase, reverse domain name.

**Examples:**
- `com.companyname`
- `org.example`
- `io.github.username`

### Artifact ID (Project Name)
Lowercase, hyphen-separated.

**Examples:**
- `user-service`
- `order-management`
- `inventory-api`

### Version
Format: `MAJOR.MINOR.PATCH`

**Examples:**
- `1.0.0`
- `2.1.3`
- `1.0.0-SNAPSHOT`

---

## 2. Recommended Maven Project Structure
```
src
├── main/
│ ├── java/
│ │ └── com/company/project/
│ │ ├── controller/
│ │ ├── service/
│ │ ├── repository/
│ │ ├── model/
│ │ ├── dto/
│ │ ├── config/
│ │ └── exception/
│ └── resources/
│ ├── application.properties
│ └── logback.xml
└── test/
└── java/
└── com/company/project/
```

--------------------------------------------------

## 3. Package Naming
All lowercase, reverse domain.

**Examples:**
- `com.mycompany.usermanagement.controller`
- `com.mycompany.usermanagement.service`
- `com.mycompany.usermanagement.repository`
- `com.mycompany.usermanagement.model`

---

## 4. Class Naming
PascalCase, nouns, no underscores.

**Examples:**
- `UserService`
- `OrderController`
- `ProductRepository`
- `PaymentConfig`
- `UserDto`

---

## 5. Interface Naming

**Preferred (modern):**
- `UserService`
- `PaymentGateway`
- `OrderRepository`

**Optional (older):**
- `IUserService`
- `IPaymentGateway`

---

## 6. Enum Naming
- **Enum name:** PascalCase
- **Enum constants:** UPPER_SNAKE_CASE

Example:
```java
public enum OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}
```

--------------------------------------------------
## 7. Method Naming
camelCase, start with verbs.

**Examples:**
- `getUserById()`
- `createOrder()`
- `updateProfile()`
- `calculateTotal()`
- `isActive()`
- `hasPermission()`

---

## 8. Variable Naming
camelCase, meaningful names.

**Examples:**
- `userName`
- `orderTotal`
- `itemCount`
- `isActive`
- `hasError`

---

## 9. Constant Naming (static final)
UPPER_SNAKE_CASE

Examples:
```Java
public static final int MAX_RETRY_COUNT = 3;  
public static final String DEFAULT_ROLE = "USER";
```

--------------------------------------------------

## 10. Maven Multi-Module Naming
Lowercase, hyphen-separated.

**Examples:**
- `user-service`
- `order-service`
- `common-lib`
- `api-gateway`

---

## 11. Test Class Naming

**Location:**
`src/test/java`

**Naming patterns:**
- `ClassNameTest`
- `ClassNameTests`
- `ClassNameIT`

**Examples:**
- `UserServiceTest`
- `OrderControllerTest`
- `PaymentServiceIT`

---

## 12. Quick Reference Table

| Element      | Convention               | Example                     |
|--------------|--------------------------|-----------------------------|
| Group ID     | lowercase reverse domain | com.company.project         |
| Artifact ID  | lowercase with hyphens   | user-service                |
| Package      | all lowercase            | com.company.project.service |
| Class        | PascalCase               | UserService                 |
| Interface    | PascalCase               | UserRepository              |
| Enum Type    | PascalCase               | OrderStatus                 |
| Enum Value   | UPPER_SNAKE_CASE         | PAYMENT_FAILED              |
| Method       | camelCase                | calculateTotal()            |
| Variable     | camelCase                | orderTotal                  |
| Constant     | UPPER_SNAKE_CASE         | MAX_USER_COUNT              |
| Test Class   | PascalCase + Test        | UserServiceTest             |
| Maven Module | lowercase + hyphens      | payment-service             |
