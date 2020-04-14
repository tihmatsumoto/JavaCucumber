# Java Cucumber Study Project


---
###### What is BDD?
Behavior Driven Development is a process to work in a collaborative fashion and to bridge the gap between business and technical people.
They are derived as multiple chunks with limited number of features for the development team. It is also important for documentation.

In BDD, requirements are called Acceptance Criteria. This are the SCENARIOS, and it is written in Gherkin language.

**Key concepts of Gherkin:**

- **Step Annotations:**
    - **Given:** initial context of the system
    - **When:** event or an action
    - **Then:** expected outcome or result
    - **And:** combine more than one event or outcome
    - **But:** negative outcome (rarely used)   
- **Feature:** any functionality is a feature
- **Feature File:** different features require separate feature files. Such are written in such style: _UserLogin.feature_
- **Scenario:** test for a functionality  
- **Scenario Outline:** replaces variables or keywords for a value in the table

**Key concepts of Cucumber:**

- **Step Definitions:** an expression that links it to one or more Gherkin steps
- **Tags:** organize features and scenarios
- **Hooks:** blocks of code that run at various points in execution cycle
    - **@Before:** runs after every before each scenario
    - **@After:** runs after every after each scenario
    - **@BeforeStep:** runs before every step
    - **@AfterStep:** runs after every step

**Usage:**
- Allows to use same Gherkin Statement to avoid writing same step definition method over and over
> @Given ("I am in the login page")
> @Given ("Im am in the login page for SauceDemo Labs webpage")
- Scenario Outline for testing using multiple variables (mult-test data) in a table
    - Remember to use '' and "" in those <variables> to avoid errors and skipped steps
        > When I enter valid '<username>' and '<password>'
    