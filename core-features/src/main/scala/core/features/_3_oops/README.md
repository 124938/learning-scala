## OOPs feature

* Scala supports following OOPs features
  * Polymorphism
  * Abstraction
  * Inheritance
  * Encapsulation
  * Any many more
  
* It uses following structures to implement above features
  * Classes and subclasses
  * Objects (Singleton classes)
  * Traits (Combination of abstract classes and interfaces)
  * And many more
    
## Objects

* Object is special tpe of class which has following characteristics:
  * Object can be considered as singleton class
  * Object can't be instantiated using new keyword i.e. constructor can't be created in object
  * All variables and functions available in object are implicitly static
  * main function must be part of object to run/execute the program

## Classes

* Unlike java, it takes very few lines of code to create classes along with boilerplate code
  * Without val or var, the parameter will act as constructor argument and scala does not provide getter/setter method
    * Syntax: `class Emp(id: Int, name: String)`
  * With val, the parameter will act as constructor argument and scala provides only getter method
    * Syntax: `class Emp(val id: Int, val name: String)`
  * With var, the parameter will act as constructor argument and scala provides getter & setter method
    * Syntax: `class Emp(var id: Int, var name: String)`
* Behaviour for the default constructor can be provided inside block of code between {}
* Multiple constructors can be created using this keyword
* Special functions such as require & apply can be used under classes
* Its not straight forward to override the default getter & setter method
* Functions available under classes can be overridden by keyword override

## Companion objects

* If the class name and object name are same then object is termed as companion object with respect to class with same name
* Companion object can access private method and attribute of respective class
* Following is the best practice to instantiate the object without using new keyword
  * Create class
  * Create companion object by adding apply method

## Case classes

* Case classes are special types of classes in scala, which provides following features
  * Parameters of constructor are by default val
  * Implementation of companion object with apply method
  * Implementation of Serializable interface
  * Implementation of toString() method

**_Note:_**
* Class/Object name and file name need not to be same (In java it must be same)
* Multiple classes/object can be declared in same file (In java it's not possible)
* All core classes extends scala.Any (In java top class is java.lang.Object)
* All core classes like Any, AnyRef etc. are part of scala package
* All custom classes extends scala.AnyRef
* apply is considered to be special method and it can be called without .
* To import all classes available under package, _ should get used (In java it is *)
  * e.g. `import org.commpany.group.util._`
* To import specific class available under package, class name should get used
  * e.g. `import org.commpany.group.util.WebPackUtils`
* scala.util package contains utility classes
* scala.collection package contains collection classes
* Metadata of class can be find out using below command on Scala REPL
  * e.g. `:javap -p org.commpany.group.util.WebPackUtils`
