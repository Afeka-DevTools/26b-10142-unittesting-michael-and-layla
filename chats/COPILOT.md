**Purpose:** AI Assistant conversation for generating unit tests for HW2 Part 3.

**User:**
Here is the code for our `App.java` class which contains various utility methods. Please generate comprehensive JUnit 5 tests for all methods. Ensure we use different assertions like `assertEquals`, `assertTrue`, and `assertThrows`. 
[Provided App.java code]

**Gemini:**
I have generated the `AppTest.java` file for you. It includes tests for all methods, checking both standard inputs and edge cases to ensure full coverage.
[Provided AppTest.java code]

**User:**
Thanks. According to the assignment requirements, how do we know if these tests are sufficient and if all paths are covered?

**Gemini:**
We know the tests provide solid coverage because we explicitly targeted different execution paths for each function:
1. **Valid Inputs (Happy Path):** We tested standard cases like `add(2, 3)` or `factorial(5)` to ensure the core logic works.
2. **Edge Cases:** We tested boundary conditions. For example, testing `factorial(0)`, passing an empty string to `reverse()`, and checking numbers less than 2 in `isPrime()`.
3. **Exception Handling:** We used `assertThrows` to ensure the code correctly rejects invalid inputs, covering the exception paths in the code (e.g., negative numbers in `factorial()` and `fibonacciUpTo()`, or empty arrays in `average()`).

To mathematically prove 100% coverage, you can run the Gradle `test` task with a coverage tool like JaCoCo, which will generate an HTML report showing exactly which lines and branches were executed during the tests.
