## Functions
* Functional programming is a paradigm (like imperative and logical), which has following properties:
    * Functions are expressions (not statements)
    * Functions can be nested
    * Functions can be recursive
    * Functions can be assigned to variable
    * Functions can be passed to argument
    * Functions can be returned
* Advantages of functional programming
    * Simple reasoning principles
    * Better modularity
    * Good for leveraging multicore for parallelism and cloud computing
    
## Higher order functions
* Function can be called as higher order function under which logic can be send to another function 
* Higher order function can be invoked in following ways:
    * Using named function
    * Using function assigned to variable
    * Using anonymous function

## Anonymous functions
* Function without name called as anonymous function

## Operators
* In scala operators are all function:
    * Numeric operators such as +, -, *, / etc. are functions
    * Boolean operators such as && (and), || (or) and ! (negation) are functions
    * == is a function to invoke equals operator (i.e. equals OR == can be used to compare 2 object)
    * eq is a function to compare whether 2 objects pointing to same reference (i.e. similar to == in Java)
    
**_Note:_**
* Argument to function - Data type is mandatory
* Return from function - Data type is optional (it will be inferred automatically by scala compiler)
* Function can be invoked without using ., () etc. with some restrictions