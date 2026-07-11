**Purpose:** Self-learning conversation for HW2 Part 2.

**User:**
Hey, we are currently doing a Java homework assignment with Gradle and need to write JUnit unit tests for App.java. Explain briefly and to the point what this is and why it's needed.
To make it easy to read, I require you to answer exactly in the format of a numbered list with 3 short points.

**Gemini:**
1. **What it is:** Small pieces of code that test a specific function (like a single method) in isolation from the rest of the system.
2. **How it works:** You provide predefined input to the function and verify that the output is exactly what you expected.
3. **Why it's needed:** It catches bugs immediately as you write them, and ensures that new changes you add in the future won't break old code.

**User:**
Cool. I saw that we need to use functions called Asserts to check that the result is correct. Can you summarize the 4 most useful ones for me?
Do this in the format of a structured table with a column for the function name and a column for a short explanation.

**Gemini:**
Sure, here is a table with the main JUnit Assert functions:

| Function | Short Explanation |
| :--- | :--- |
| `assertEquals` | Verifies that the value you received is equal to the expected value. |
| `assertTrue` | Verifies that a specific condition returns true. |
| `assertNull` | Verifies that the returned object is null. |
| `assertThrows` | Verifies that the function throws a specific Exception in case of invalid input. |

**User:**
Got it. And regarding Edge Cases and Code Coverage - how do I know I've tested enough and that my tests really cover everything?
Explain this practically, in a bulleted list format.

**Gemini:**
* **Code Coverage:** Means you need to ensure the tests cause every line of code to run. For example, if you have an if/else condition, you must write at least two tests - one that enters the `if` and one that enters the `else`.
* **Edge Cases:** Means always checking what happens with unusual or problematic inputs. You must check what happens when inserting 0, negative numbers, empty strings (""), or null objects.
* **Helpful Tools:** It's recommended to use tools like JaCoCo in a Gradle environment. They can generate an automatic report highlighted in green and red, showing you exactly which paths you missed in percentages.

NOTE: the original conversation was in hebrew but github isnt showing the text correctly in hebrew (we tried many methods to fix this)
