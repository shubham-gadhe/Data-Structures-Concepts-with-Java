# 🔗 Linked List Implementations in Java

This repository contains implementations of four fundamental types of **Linked Lists using Java**. Each implementation supports basic insertion, deletion, traversal, and node-counting operations.

The project is designed to strengthen understanding of **Data Structures and Algorithms (DSA)** and pointer/reference-based data structures in Java.

---

## 📚 Linked List Implementations

### 1️⃣ Singly Linear Linked List

A linked list where every node contains:

* Data
* Reference to the next node

The last node points to `null`.

**Operations implemented:**

* InsertFirst()
* InsertLast()
* InsertAtPos()
* DeleteFirst()
* DeleteLast()
* DeleteAtPos()
* Display()
* Count()

---

### 2️⃣ Singly Circular Linked List

A linked list where the last node points back to the first node, forming a circular structure.

**Operations implemented:**

* InsertFirst()
* InsertLast()
* InsertAtPos()
* DeleteFirst()
* DeleteLast()
* DeleteAtPos()
* Display()
* Count()

---

### 3️⃣ Doubly Linear Linked List

A linked list where every node contains:

* Data
* Reference to the next node
* Reference to the previous node

The first node's previous reference and the last node's next reference point to `null`.

**Operations implemented:**

* InsertFirst()
* InsertLast()
* InsertAtPos()
* DeleteFirst()
* DeleteLast()
* DeleteAtPos()
* Display()
* Count()

---

### 4️⃣ Doubly Circular Linked List

A circular linked list where every node maintains both:

* Next reference
* Previous reference

The last node points to the first node, and the first node points back to the last node.

**Operations implemented:**

* InsertFirst()
* InsertLast()
* InsertAtPos()
* DeleteFirst()
* DeleteLast()
* DeleteAtPos()
* Display()
* Count()

---

## 📂 Project Structure

```text
Linked-List/
│
├── SinglyLinearLinkedList.java
│
├── SinglyCircularLinkedList.java
│
├── DoublyLinearLinkedList.java
│
└── DoublyCircularLinkedList.java
```

---

## 🛠️ Technologies Used

* Java
* Core Java
* Object-Oriented Programming
* Data Structures

---

## ⚙️ Operations Overview

| Operation       | Description                                |
| --------------- | ------------------------------------------ |
| `InsertFirst()` | Inserts a new node at the beginning        |
| `InsertLast()`  | Inserts a new node at the end              |
| `InsertAtPos()` | Inserts a new node at a specified position |
| `DeleteFirst()` | Deletes the first node                     |
| `DeleteLast()`  | Deletes the last node                      |
| `DeleteAtPos()` | Deletes a node from a specified position   |
| `Display()`     | Displays all nodes in the linked list      |
| `Count()`       | Returns the total number of nodes          |

---

## 🧠 Concepts Covered

* Node Creation
* Dynamic Memory Representation Using Objects
* Object References
* Linked List Traversal
* Linear Linked Lists
* Circular Linked Lists
* Singly Linked Lists
* Doubly Linked Lists
* Insertion Operations
* Deletion Operations
* Position-Based Operations
* Edge Case Handling

---

## ▶️ How to Run

Compile the required Java file:

```bash
javac SinglyLinearLinkedList.java
```

Run the program:

```bash
java SinglyLinearLinkedList
```

Similarly, you can compile and execute the other implementations:

```bash
javac SinglyCircularLinkedList.java
java SinglyCircularLinkedList
```

```bash
javac DoublyLinearLinkedList.java
java DoublyLinearLinkedList
```

```bash
javac DoublyCircularLinkedList.java
java DoublyCircularLinkedList
```

---

## 🎯 Learning Objective

The purpose of this project is to develop a strong understanding of how linked lists work internally and how different linked list structures handle:

* Node connections
* Forward and backward traversal
* Circular references
* Insertion at different positions
* Deletion of nodes
* Boundary conditions

These implementations provide a foundation for understanding more advanced data structures such as **Stacks, Queues, Trees, and Graphs**.

---

## 👨‍💻 Author

**Shubham Gadhe**

* GitHub: https://github.com/shubham-gadhe
* LinkedIn: https://www.linkedin.com/in/shubham-gadhe

---

⭐ If you found this repository useful, consider giving it a star!

