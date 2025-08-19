# SauceDemo Automation Framework 🧪🚀

This is an end-to-end automation testing framework for [SauceDemo](https://www.saucedemo.com/) built using **Selenium WebDriver**, **JUnit**, **Cucumber (BDD)**, and **Maven**. The framework covers core functionalities like login, product selection, cart validation, and checkout process.

## 📁 Project Structure

```
saucedemo-automation/
├── features/               # Cucumber feature files
│   └── login.feature
├── runners/                # Cucumber test runner
│   └── TestRunner.java
├── stepDefinitions/        # Step definitions
├── pages/                  # Page Object Model classes
├── utils/                  # Excel reader, helper classes
├── testData/               # Excel test data
├── pom.xml                 # Maven configuration file
```

## ✅ Features Covered

- Valid login with standard user
- Add product to cart
- Verify cart contents
- Complete checkout process
- Data-driven testing with Excel (Apache POI)

## 🧰 Tech Stack

- **Java 17**
- **Selenium WebDriver 4.21**
- **JUnit 4.13.2**
- **Cucumber 7.14**
- **Apache POI 5.2.5** (for Excel reading)
- **Maven** (for build and dependency management)
- **WebDriverManager 5.8** (for managing drivers)

## 🧪 How to Run the Tests

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/saucedemo-automation.git
   ```

2. Navigate to the project directory:
   ```bash
   cd saucedemo-automation
   ```

3. Run tests using Maven:
   ```bash
   mvn test
   ```

## 📄 Reporting

Cucumber generates test results in the console. HTML/JSON reports can be configured in the `TestRunner` class using plugin options.

## 📌 Prerequisites

- Java JDK 17
- Maven
- Chrome browser (or modify for other browsers)
- Internet access (SauceDemo is a live test site)

## 📚 Learnings

This project helped me gain hands-on experience with:
- Building a test automation framework from scratch
- Writing reusable POM classes
- Implementing Cucumber BDD scenarios
- Running tests using JUnit
- Reading test data from Excel
- Managing dependencies and plugins via Maven

## 📬 Contact

**Pavankalyan Akasam**  
📧 apavanpkalyan@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/pavankalyan-akasamm-1a5668216)  
🐙 [GitHub](https://github.com/AKASAMPAVANKALYAN)