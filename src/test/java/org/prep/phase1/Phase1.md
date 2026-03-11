### Phase 1: String & Java Core (Top 50 Questions)

I have curated these into three categories: **Conceptual**, **Coding (Logic)**, and **Scenario-based**.

#### A. Conceptual (Theoretical Depth)

1. Why is `String` immutable in Java? Explain from a security and multithreading perspective.
2. Difference between `String`, `StringBuilder`, and `StringBuffer` with memory implications.
3. How does the **String Constant Pool (SCP)** work in Java 8 vs. Java 11+?
4. What happens when you use the `new` keyword vs. a String literal? How many objects are created?
5. Explain the `intern()` method. When would you use it in an automation framework?
6. Why is it recommended to store passwords in a `char[]` instead of a `String`?
7. How does the `split()` method work with RegEx? Give an example of splitting by a period `.`.
8. Difference between `==` and `.equals()` and `.equalsIgnoreCase()`.
9. What is **String Deduplication** in G1 Garbage Collector?
10. Can we override the `equals()` method of the String class? Why?

#### B. Coding Logic (Strings & Arrays)

*Solve these assuming you cannot use `reverse()` or `Collections.reverse()` unless asked.*

11. Reverse a string without using built-in functions.
12. Reverse words in a given sentence (e.g., "I love Java" -> "Java love I").
13. Check if a string is a **Palindrome** (handle alphanumeric and case sensitivity).
14. Find the **first non-repeated character** in a string.
15. Count the occurrences of each character in a string using `Map`.
16. Check if two strings are **Anagrams** of each other.
17. Remove all duplicate characters from a string.
18. Find the **longest substring without repeating characters** (Classic FAANG).
19. Count the number of vowels and consonants in a string.
20. Check if a string contains only digits.
21. Find all **permutations** of a string.
22. String Compression: Input `aaabbc`, Output `a3b2c1`.
23. String Decompression: Input `a3b2c1`, Output `aaabbc`.
24. Find the longest common prefix among an array of strings.
25. Convert a Roman Numeral to an Integer.
26. Find the **highest occurring character** in a string.
27. Swap two strings without using a third/temp variable.
28. Check if one string is a **rotation** of another (e.g., "ABCD", "CDAB").
29. Identify if a string follows a specific pattern (e.g., Pattern "abba", String "dog cat cat dog").
30. Find the length of the last word in a string.
31. Given a string, capitalize the first letter of every word.
32. Check if a string is a valid **IP Address** (v4).
33. Group Anagrams from a list of strings.
34. Find the minimum window substring containing all characters of another string.
35. Implement the `atoi` function (String to Integer).
36. Print all possible substrings of a string.
37. Check if a string has all unique characters without using extra Data Structures.
38. Count "Total number of words" in a string (handling multiple spaces).
39. Convert an Integer to a String without `String.valueOf()`.
40. Replace every space in a string with `%20` (URL Encoding).

#### C. SDET Scenario-Based (Java + Automation Context)

41. You have a dynamic WebTable. How do you extract the price (String "$1,200.50") and convert it to a `Double` for comparison?
42. Write a method to verify if a Success Message contains a specific Transaction ID using RegEx.
43. How do you handle a scenario where the UI text has trailing/leading non-breaking spaces (`&nbsp;`)?
44. Given a Log file as a String, extract all Email IDs found within it.
45. How would you compare two JSON responses (as Strings) where the key order might be different?
46. Write a utility to generate a random "Test Data" string of length $N$ (Alphanumeric).
47. How do you mask sensitive data (like Credit Card numbers) in your automation reports?
48. In a CSV-driven test, if a cell value is `"Name, Title"`, how do you prevent the `split(",")` from breaking the name?
49. How do you handle multi-language (UI) strings in a framework? (Resource Bundles).
50. If an element's `attribute` returns a String, how do you verify it's a valid URL format?

---