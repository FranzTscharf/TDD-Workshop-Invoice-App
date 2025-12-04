# TDD-Workshop-Invoice-App

This are the files for the **TDD-Workshop-Invoice-App** practice app. This project is designed to teach clean code, refactoring techniques, and testing strategies by comparing messy "legacy-style" code with a clean, refactored architecture.

---

## Project Overview

This repository contains two parallel implementations of a customer and invoice processing system:

### RAW (Legacy Simulation)
Located in:
/invoice-app/src/main/java/com/example/raw

Perfect for refactoring practice.

---

### REFACTORED
Located in:
/invoice-app/src/main/java/com/example/refactored

Use this version to:
- Compare architectures
- Validate your refactoring
- Build additional features

---

## API Endpoints

The application exposes simple REST endpoints:

| Endpoint | Version | Description |
|---------|---------|-------------|
| `/api/customers` | RAW | Processes customers using messy legacy logic |
| `/api/customers/refactored` | REFACTORED | Clean implementation |
| `/api/invoices` | RAW | Legacy invoice logic |
| `/api/invoices/refactored` | REFACTORED | Clean architecture version |

Run using:
```
mvn spring-boot:run
```

The default app is deployed on port 8080 of localhost. 

---

## Features Included

### EU Tax Logic  
Automatically assigns an EU or non-EU country and applies.

### Age Validation  
Customers under 18 are not allowed to have invoices processed.

### Product Selling Logic  
Each customer is randomly sold a product. Each with a random price to refactor logically.

---

## Testing

Tests are located under:
/invoice-app/src/test/java/com/example


---

## Workshop Goals

You will:

1. Identify code smells  
2. Apply refactoring techniques  
3. Improve naming and structure  
4. Extract classes and methods  
5. Increase test coverage  
6. Discuss trade-offs of legacy vs clean architecture  



## Conclusion

This project is intentionally designed to look bad in RAW and clean in REFACTORED.  

Have fun refactoring.
