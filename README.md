# assignment_2019_wamique_ansari

**Restaurant ordering application**:

Language - **JAVA**

**Assumptions:**

1. The client will ensure that proper validation of all mandatory and correct options(eg: Meat is mandatory and correct option is either Chicken or Vegetable but not both).
2. The client will take care of the spell checks for all the available options.
3. The client will keep track of the Order Id and pass it to the module.
4. The client always sends valid order details to the createOrder() function.
5. Assuming that this is a client - server model, all validations needs to be done on frontend itself, for instance, the order should contain all the available options for rice bowl like meat and sauce. Furthermore, the suboption should be validated by the client itself, for instance, Chicken option in Meat etc. The client passes the order details and the server processes the order.



**Design:**

1. The client (main method) will send all the order details with all selected options for the rice bowl.
2. The client will call the createOrder() method implemented by the Order class in order to create the order.
3. I have used the **Composite design pattern** in the implementation to keep the design for the item Rice Bowl and options simple, readable and to enforce the key OOP design principle **‘Single Responsibility Principle’**.
4. When printing the order details, the composite design pattern will take care of aggregating multiple results into a single result.
5. Composite design pattern will also allow reusability and expansion. For example, if in the future some option like beans needs to be added, we just need to add an extra subclass of the class Leaf and no other changes in the code will be needed.
6. I have demonstrated various OOP key concepts like Inheritance, Polymorphism, Abstraction and Encapsulation in the implementation. 
7. Also, demonstrated the usage of Java in built data structures like HashMap and ArrayList.
8. For reports, I have considered appending individual order objects to the List of objects which can be referred to print report summary.
9. I have kept the printReport method open for the client to specify the hours within which the report needs to be generated.
10. The Client takes 7 orders, print details of the created order and then prints the reports.
11. Below is the class diagram and sequence diagram of the implementation. The sequence diagram depicts the message flow between various objects for printing details of an order.



**Class Diagram:**

![Class Diagram](https://raw.github.com/wamiquem/assignment_2019_wamique_ansari/blob/master/Class%20Diagram.png)

**Sequence Diagram:**

![Sequence Diagram](https://raw.github.com/wamiquem/assignment_2019_wamique_ansari/blob/master/Sequence%20Diagram.png)


**Output of Execution:**

![Execution Output - Page1](https://raw.github.com/wamiquem/assignment_2019_wamique_ansari/blob/master/program_output_page1.png)


![Execution Output - Page2](https://raw.github.com/wamiquem/assignment_2019_wamique_ansari/blob/master/program_output_page2.png)

**Unit Test Cases:**

1. I have written JUnit test cases to check for all individual module. As all leaf subclasses are similar, I have written unit tests for 1 leaf subclass.
2. Unit test cases are also included in the git**.**
3. Modules works as expected as all unit test cases are passing. Please find below screenshot of tests run:

![JUnit Tests Screenshot](https://raw.github.com/wamiquem/assignment_2019_wamique_ansari/blob/master/JUnit_Tests_ouput.png)
