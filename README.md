# Mega Project List Solutions
---
Solutions for https://github.com/karan/Projects

(Part of them. Excluded the projects which has complexity GUI.)

Numbers
---------

- [x] **Fibonacci Sequence** - Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.

- [x] **Prime Factorization** - Have the user enter a number and find all Prime Factors (if there are any) and display them.

- [x] **Next Prime Number** - Have the program find prime numbers until the user chooses to stop asking for the next one.

- [ ] **Find Cost of Tile to Cover W x H Floor** - Calculate the total cost of tile it would take to cover a floor plan of width and height, using a cost entered by the user.

- [ ] **Binary to Decimal and Back Converter** - Develop a converter to convert a decimal number to binary or a binary number to its decimal equivalent.

- [ ] **Distance Between Two Cities** - Calculates the distance between two cities and allows the user to specify a unit of distance. This program may require finding coordinates for the cities like latitude and longitude.

- [x] **Complex Number Algebra** - Show addition, multiplication, negation, and inversion of complex numbers in separate functions. (Subtraction and division operations can be made with pairs of these operations.) Print the results for each operation tested.

Classic Algorithms
-----------------

- [x] **Collatz Conjecture** - Start with a number *n > 1*. Find the number of steps it takes to reach one using the following process: If *n* is even, divide it by 2. If *n* is odd, multiply it by 3 and add 1.

- [x] **Sorting** - Implement two types of sorting algorithms: Merge sort and bubble sort.

- [x] **Closest pair problem** - The closest pair of points problem or closest pair problem is a problem of computational geometry: given *n* points in metric space, find a pair of points with the smallest distance between them.

- [x] **Sieve of Eratosthenes** - The sieve of Eratosthenes is one of the most efficient ways to find all of the smaller primes (below 10 million or so).


Graph
--------

- [ ] **Graph from links** - Create a program that will create a graph or network from a series of links.

- [ ] **Eulerian Path** - Create a program which will take as an input a graph and output either a Eulerian path or a Eulerian cycle, or state that it is not possible.  A Eulerian Path starts at one node and traverses every edge of a graph  through every node and finishes at another node.  A Eulerian cycle is a eulerian Path that starts and finishes at the same node.

- [ ] **Connected Graph** - Create a program which takes a graph as an input and outputs whether every node is connected or not.

- [ ] **Dijkstra’s Algorithm** - Create a program that finds the shortest path through a graph using its edges.

- [ ] **Minimum Spanning Tree** - Create a program which takes a connected, undirected graph with weights and outputs the minimum spanning tree of the graph i.e., a
subgraph that is a tree, contains all the vertices, and the sum of its weights is the least possible.


Data Structures
---------

- [x] **Inverted index** - An [Inverted Index](http://en.wikipedia.org/wiki/Inverted_index) is a data structure used to create full text search. Given a set of text files, implement a program to create an inverted index. Also create a user interface to do a search using that inverted index which returns a list of files that contain the query term / terms. The search index can be in memory.


Text
---------

- [x] **Fizz Buzz** - Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

- [x] **Reverse a String** - Enter a string and the program will reverse it and print it out.

- [x] **Pig Latin** - Pig Latin is a game of alterations played on the English language game. To create the Pig Latin form of an English word the initial consonant sound is transposed to the end of the word and an ay is affixed (Ex.: "banana" would yield anana-bay). Read Wikipedia for more information on rules.

- [x] **Count Vowels** - Enter a string and the program counts the number of vowels in the text. For added complexity have it report a sum of each vowel found.

- [x] **Check if Palindrome** - Checks if the string entered by the user is a palindrome. That is that it reads the same forwards as backwards like “racecar”

- [x] **Count Words in a String** - Counts the number of individual words in a string. For added complexity read these strings in from a text file and generate a summary.

- [x] **Vigenere / Vernam / Ceasar Ciphers** - Functions for encrypting and decrypting data messages. Then send them to a friend.


Classes
---------

- [x] **Product Inventory Project** - Create an application which manages an inventory of products. Create a product class which has a price, id, and quantity on hand. Then create an *inventory* class which keeps track of various products and can sum up the inventory value.

- [ ] **Airline / Hotel Reservation System** - Create a reservation system which books airline seats or hotel rooms. It charges various rates for particular sections of the plane or hotel. Example, first class is going to cost more than coach. Hotel rooms have penthouse suites which cost more. Keep track of when rooms will be available and can be scheduled.

- [ ] **Company Manager** - Create an hierarchy of classes - abstract class Employee and subclasses HourlyEmployee, SalariedEmployee, Manager and Executive. Every one's pay is calculated differently, research a bit about it.
After you've established an employee hierarchy, create a Company class that allows you to manage the employees. You should be able to hire, fire and raise employees. 

- [ ] **Bank Account Manager** - Create a class called Account which will be an abstract class for three other classes called CheckingAccount, SavingsAccount and BusinessAccount. Manage credits and debits from these accounts through an ATM style program.

- [ ] **Patient / Doctor Scheduler** - Create a patient class and a doctor class. Have a doctor that can handle multiple patients and setup a scheduling program where a doctor can only handle 16 patients during an 8 hr work day.

- [ ] **Recipe Creator and Manager** - Create a recipe class with ingredients and a put them in a recipe manager program that organizes them into categories like deserts, main courses or by ingredients like chicken, beef, soups, pies etc.

- [ ] **Image Gallery** - Create an image abstract class and then a class that inherits from it for each image type. Put them in a program which displays them in a gallery style format for viewing.

- [ ] **Shape Area and Perimeter Classes** - Create an abstract class called Shape and then inherit from it other shapes like diamond, rectangle, circle, triangle etc. Then have each class override the area and perimeter functionality to handle each shape type.

- [ ] **Flower Shop Ordering To Go** - Create a flower shop application which deals in flower objects and use those flower objects in a bouquet object which can then be sold. Keep track of the number of objects and when you may need to order more.

- [ ] **Family Tree Creator** - Create a class called Person which will have a name, when they were born and when (and if) they died. Allow the user to create these Person classes and put them into a family tree structure. Print out the tree to the screen.
