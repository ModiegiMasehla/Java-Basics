# Java Basics

## Learning Outcomes Assessed
- Basic Java syntax, methods, parameters, and return values
- Conditional statements and boolean logic
- Loops and iteration
- String handling and simple algorithms
- Unit testing with JUnit 5

## Assessment Structure
This assessment has two sections:
- **Coding Assessment** — complete four methods in `src/main/java/za/co/mocoder/Fundamentals.java`
- **Comprehension Questions** — write answers in `answers.txt`

## Scoring & Weighting
| Component | Weight |
|---|---:|
| Coding Section (unit tests) | **40%** |
| Comprehension Section | **60%** |

Coding Score = (tests passed / total tests) × 40%  
Comprehension Score = (marks earned / marks available) × 60%  
Final Score = Coding Score + Comprehension Score  
Pass mark: 60%

## How to Run the Tests
From the project root, run:

```bash
mvn clean compile test
```

Java 17 and Maven are required.

## Project Structure
```text
oop-000-fun-v3-alternate-solved/
├── src/main/java/za/co/mocoder/Fundamentals.java
├── src/test/java/za/co/mocoder/FundamentalsTest.java
├── answers.txt
└── README.md
```

## Coding Assessment

### Question 1 — `countVowels(String s)`
Return the number of vowels (`a`, `e`, `i`, `o`, `u`) in a string, ignoring case. Return `0` for `null` or an empty string. Numbers, punctuation, and consonants are not vowels.

### Question 2 — `areAnagrams(String first, String second)`
Return `true` if both non-empty strings contain the same letters in a different or identical order, ignoring case and whitespace. Return `false` if either input is `null`, empty/whitespace-only, or the strings do not contain the same letters.

### Question 3 — `classifyNumber(int number)`
Return `"Positive"` when the number is greater than zero, `"Negative"` when it is less than zero, or `"Zero"` when it equals zero.

### Question 4 — `sumDigits(int number)`
Return the sum of all digits in an integer. Ignore a negative sign. For example, `sumDigits(-248)` returns `14`; `sumDigits(0)` returns `0`.

## Comprehension Question Section

### Question 1 — Variables and Data Types (5 marks)
A teammate stores a person's age, name, and account balance using the same data type and cannot explain why this might cause problems. Explain what a variable is, why Java uses data types, and when you would use `int`, `double`, `boolean`, and `String`. Include a short Java example.

### Question 2 — Conditions and Boolean Logic (10 marks)
A program must decide whether a user may enter a restricted area. Explain how `if`, `else if`, and `else` work, how comparison operators and logical operators such as `&&` and `||` affect a condition, and why condition order matters. Include a Java example with at least two conditions.

### Question 3 — Loops (10 marks)
A developer needs to process a list of scores and also repeat a task until a user enters a valid value. Explain the difference between a standard `for` loop, an enhanced `for` loop, and a `while` loop. Give correct Java syntax for each and explain when each is most suitable.

### Question 4 — Methods and Return Values (10 marks)
A beginner has written the same calculation in several places in a program. Explain how methods help avoid repetition, describe the roles of parameters and return types, and distinguish a method that returns a value from one declared `void`. Include a simple Java example showing a method call.
