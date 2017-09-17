## Declaring variables
* Val or Var (Immutable vs Mutable)
* Implicit data types or Type inference
* Explicit data types can be specified
* There is no distinction such as primitive types and classes for primitive types (In Scala all primitive types are nothing but classes)
* Few basic data types:

| Name      | Description
| ----------| ----------------------------------------------------------------------|
| Byte	    |  8-bit signed two’s complement integer (-2^7 to 2^7 – 1, inclusive)   |
| Short	    | 16-bit signed two’s complement integer (-2^15 to 2^15 – 1, inclusive) |
| Int	    | 32-bit signed two’s complement integer (-2^31 to 2^31 – 1, inclusive) |
| Long	    | 64-bit signed two’s complement integer (-2^63 to 2^63 – 1, inclusive) |
| Char	    | 16-bit unsigned Unicode character (0 to 2^16 – 1, inclusive)          |
| String	| a sequence of Chars                                                   |
| Float	    | 32-bit IEEE 754 single-precision float                                |    
| Double	| 64-bit IEEE 754 double-precision float                                |
| Boolean	| true or false                                                         |


## Basic programming constructs
* Expression
* Nested block
* Condition block (if - else if - else)
* Ternary operator
* While loop
* For loop
* Code blocks
    * Any thing that comes in the middle of { } is considered to be block of code
    * A block of code can be assigned to a variable (Code will be evaluated first and then the value will be returned to variable)
    * Each line of code need not be ended with ; (But in case of writing more than one expression in one line then each expression should be ended with ;)
    * Blocks can be nested as well
    * In code blocks, the last statement of the code-block becomes the return value

_**Note:**_
- Scala is strongly typed programming language & type can be inferred automatically by scala compiler
- Python is weakly typed programming language