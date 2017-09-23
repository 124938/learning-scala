## Collection

* The base package of scala collection API is scala.collection and it provide two type of collections

* **Immutable Collection:** It does not provides API to update the data inside collection

![Alt text](immutable_collection_hierarchy.png?raw=true "Scala mutable collection API")

* **Mutable Collection:** It provides API to update the data inside collection

![Alt text](mutable_collection_hierarchy.png?raw=true "Scala mutable collection API")

* Advantages of scala collections are:
  * Easy to use
  * Concise
  * Safe
  * Fast
  * Universal

## Traversable

* It's a trait containing common functionality required by collection API i.e. the reason why it's on the top of collection hierarchy
* List of useful methods are:

~~~

---------------
Abstract method
---------------
xs foreach f    :  

---------------
Addition
---------------
xs ++ ys        : Add two collection

---------------
Maps
---------------
xs map f        : The collection obtained from applying the function f to every element in xs
xs flatMap f    : The collection obtained from applying the collection values function f to every element in xs and concatenating the result
xs map f        : The collection obtained from applying the partial function f to every element in xs for which it is defined and collecting the result

---------------
Conversions
---------------
xs.toArray      : Converts the collection to an array
xs.toList       : Converts the collection to a list
xs.toIterable   : Converts the collection to an iterable
xs.toSeq        : Converts the collection to a sequence
xs.toIndexedSeq : Converts the collection to an indexed sequence
xs.toStream     : Converts the collection to a lazily computed stream
xs.toSet        : Converts the collection to a set
xs.toMap        : Converts the collection of key/value pair to a map. 

---------------
Size
---------------
xs.isEmpty          : Tests whether collection is empty
xs.nonEmpty         : Tests whether collection contains elements
xs.size             : Returns number of elements in the collection
xs.hasDefiniteSize  : True if xs is known to have finite size

------------------
Element retrieval
------------------
xs.head         : The first element of the collection OR some element, if no order is defined
xs.headOption   : The first element of xs in an option value OR none, if xs is empty
xs.last         : The last element of the collection OR some element, if no order is defined
xs.headOption   : The last element of xs in an option value OR none, if xs is empty

~~~

## Iterable

* Implementation of foreach is provided here

~~~

---------------
Abstract method
---------------
xs iterator    : Iterate through each element of xs

------------------
Implemented method
------------------
xs foreach f    : Executes function f for every element of xs

~~~

## Seq

* Seq has 2 sub traits
  * **IndexedSeq :** Should get used in case of accessing elements in random fashion
  * **LinearSeq  :** Should get used in case of traversing through each elements collection linearly
* Elements in Seq can be accessible using index
  * e.g. scala.Array (Mutable)
  * e.g. scala.collection.immutable.List (Immutable)
* Array is special type of collection in scala (analogous to java Array)
* List of useful methods in Seq

~~~

-------------------
Indexing and length
-------------------

~~~

### **_Note:_** 

* What is trait? - It's a combination of feature provided by interface and abstract class (in terms of java)
