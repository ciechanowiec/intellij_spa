# IntelliJ IDEA - Static Program Analysis

### Overview
The purpose of this project is to practice static program analysis with the usage of IntelliJ IDEA _Inspect Code..._ tool (the _"Inspector"_).

### Project structure
There is one class in this project called `IntelliJ.java`, which has 5 methods:
1. One `main` method.
2. Four methods to be changed during the task (the _"Additional Methods"_).

### Deactivate SonarLint
Prior to completing the task deactivate SonarLint IntelliJ IDEA plugin if installed:
1. _Tools Bar ➔ File ➔ Settings ➔ Tools ➔ SonarLint ➔ Uncheck 'Automatically trigger analysis' ➔ OK_.
2. Restart IntelliJ IDEA.

### Task description
1. Prior to completing the task run `main` method and study `IntelliJ.java` mechanism. You will see that the code works, but it has some non-critical mistakes. Your task is to correct them. 
2. Every Additional Method:
   - has a mistake that can be caught by the Inspector,
   - has some clues on how it can be corrected.
3. Correct every mistake in the Additional Methods that can be caught by the Inspector. You should correct at least **four** mistakes, one mistake per method.
4. Prior to the correction of every mistake in the Additional Methods, run the Inspector and identify the mistake to be corrected in the Inspector's suggestions. Run the Inspector the following way:<br>
_Tools Bar ➔ Code ➔ Inspect Code ➔ Inspection Scope: file `IntelliJ.java` ➔ OK_
5. Do not change anything in the `main` method.
6. After the correction of all the mistakes, run the Inspector and make sure that it shows no mistakes which are required to be corrected. 
