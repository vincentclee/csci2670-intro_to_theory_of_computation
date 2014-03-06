##CSCI 2670: Introduction to Theory of Computing

####Spring 2013

**Instructor:** Frederick Maier (fmaier@uga.edu)  
**Office:** Boyd 216; **Hours:** TBA  
**Lecture Times and Locations:**  
10:10-11:00 Mon Boyd GSRC, Rm 208
9:30-10:45 Tues & Thurs Boyd GSRC, Rm 208


####Brief Description:
This is a first course on the theory of computing. Fundamental Topics include finite automata, regular
expressions and languages, context-free grammars and languages, push-down automata, pumping lemmas
for regular languages and for context-free grammars, the Chomsky hierarchy of language classes, Turing
machines and computability, undecidability of the halting problem, reducibilities among decision problems
and languages, time complexity, and NP-completeness and tractability.

**Prerequisites:** CSCI/MATH 2610: Discrete Mathematics; or CSCI 2611: Discrete Mathematics for Engi-
neers.

**Course Objectives:** This course introduces fundamental models relevant to most areas of computer science.
At the end of the semester, all students will be able to do the following:
1. Given an NFA M , create a DFA or a regular expression that accepts L(M ).
2. Given a regular language L, create an NFA that accepts L.
3. Use pumping lemmas to prove a language is not regular or not context-free.
4. Given a description of a context-free language L, develop a context-free grammar (CFG) G such that
L(G) = L.
5. Convert a CFG into Chomsky Normal Form (CNF).
6. Given a context-free grammar G in CNF and a string w, use the CYK algorithm to determine if G
generates w.
7. Given an context-free grammar G, create a push-down automaton (PDA) that accepts L(G).
8. Identify if a given language is regular, context-free but not regular, or neither.
9. Given a language L, create a Turing machine L that accepts L.
10. Convert between different variations of the Turing machine model (e.g., multi-tape to single tape).
11. Create a Turing machine that performs a function.
12. Define decidabilty and demonstrate that a language is decidable.
13. Reduce one problem to another one.
14. Use reductions to prove a problem is undecidable.
15. Define P, NP and NP-complete.
16. Show a problem is in P and determine its computational complexity.
17. Write pseudo-code describing a non-deterministic Turing machines steps to solve a problem.
18. Prove a problem is NP-complete.

####Required Text:
Michael Sipser. Introduction to the Theory of Computation (2nd Edition). ISBN-13: 978-0534950972

**Course Website:** Course materials—including grades, reading assignments, and homework—will be posted
to the course’s eLearning Commons (eLC) website: https://www.elc.uga.edu/. Secondary websites might
also be used.

**Lectures:** Lectures will cover material from Chapters 1–7 of the textbook, excluding Chapter 6. Only
limited material from certain chapters will be covered. Lecture readings will be assigned beforehand, and
students should finish these before class begins. Quizzes and other activities will take place during lecture
periods.

**Homework:** Throughout the semester, homework dealing with material covered in the lectures will be
assigned. On the due date of the assignment, students must typeset and submit printed copies of their
solutions during the lecture period. Late submissions will be accepted up to 24 hours after the due date.
However, 15 points will be deducted from the assignment’s grade. After 24 hours, the assignment will be
given a grade of 0.  
At the end of the semester, the lowest homework grade will not be used when calculating students’ final HW
score (that is, the lowest score will be dropped).

**Exams:** There will be 3 in-class exams and a separate final exam. Tentative dates for each are given below.
In-class Exam 1:
In-class Exam 2:
In-class Exam 3:
Final Exam:
February 5th.
March 7th.
April 11th.
May 7th, 2013, 8:00–11:00am (to be confirmed)
Makeup tests will not be given. However, if an in-class exam is missed due to an extreme and verified
emergency, it might be excused by the instructor (students should bring documentation explaining the
circumstances). If the absence is excused, then the average of the two in-class exams and the final exam will
be counted for the missed exam. If the absence is not excused, then a grade of zero will be given.
Grade weights:
Exam 1 (16%), Exam 2 (16%), Exam 3 (16%), Final Exam (25%), Homework (22%), Quizzes and other
work (5%).
Final Letter Grades: Final letter grades will be determined according to the following scale:
A ≥ 90
79 > C+ ≥ 77
90 > A- ≥ 89
77 > C ≥ 70
89 > B+ ≥ 87
70 > C- ≥ 69
87 > B ≥ 80
69 > D ≥ 60
80 > B- ≥ 79
F < 60
The instructor reserves the right to curve grades. Under no circumstances will this lower a student’s grade.
Regrading: With the exception of the final exam, students may request a reevaluation of any test, quiz,
or graded assignment. In order to be considered, however, the request must be made no more than 7 days
after the graded material has been returned to the class.
Electronic Devices: Students may not use personal electronic devices (including laptops, tablets, and
phones) during class unless the instructor or TA has explicitly given them permission to do so.
Email: Students must use their UGA email accounts when corresponding with the instructor and TAs on
course-related matters, and all emails must include “CSCI 2670” in the subject line.
In-Class and Online Behavior: Students are expected to be courteous and respectful in all interaction
with other members of the class (whether this interaction occurs online or in class). Disruptive or disrespectful
behavior might result in the student being asked to leave the classroom. In extreme cases, or if the behavior
persists, a formal report might be filed by the instructor.
Academic Honesty:
As a University of Georgia student, you have agreed to abide by the University’s academic honesty policy, “A
Culture of Honesty,” and the Student Honor Code. All academic work must meet the standards described in
2
“A Culture of Honesty” found at: http://honesty.uga.edu/. Lack of knowledge of the academic honesty
policy is not a reasonable explanation for a violation. Questions related to course assignments and the
academic honesty policy should be directed to the instructor.
In addition, students are expected to abide by the CS Academic Honesty policies below.
Academic honesty means that any work you submit is your own work.
Common forms of academic dishonesty against which students should guard are:
1. copying from another student’s test paper or laboratory report, or allowing another student to copy
from you;
2. fabricating data (computer, statistical) for an assignment;
3. helping another student to write a laboratory report or computer software code that the student will
present as his own work, or accepting such help and presenting the work as your own;
4. turning in material from a public source such as a book or the Internet as your own work.
Three steps to help prevent academic dishonesty are:
1. Familiarize yourself with the regulations.
2. If you have any doubt about what constitutes academic dishonesty, ask your instructor or a staff
member at the Office of Judicial Programs.
3. Refuse to assist students who want to cheat.
All faculty, staff and students are encouraged to report all suspected cases of academic dishonesty.
Class Accommodation: Students with a disability or health-related issue who need a class accommodation
should make an appointment to speak with the instructor as soon as possible.
Syllabus Policy: Students are responsible for learning and following all policies stated in this syllabus.
This course syllabus is a general plan for the course; deviations announced to the class by the instructor
may be necessary.
3
