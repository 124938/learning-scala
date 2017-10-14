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

**Abstract method:**

| Method Name | Description |
|-------------|-------------|
xs foreach f    | -

**Addition:**

| Method Name | Description |
|-------------|-------------|
xs ++ ys    | Add two collection

**Map:**

| Method Name | Description |
|-------------|-------------|
xs map f        | The collection obtained from applying the function f to every element in xs 
xs flatMap f    | The collection obtained from applying the collection values function f to every element in xs and concatenating the result
xs map f        | The collection obtained from applying the partial function f to every element in xs for which it is defined and collecting the result

**Conversion:**

| Method Name | Description |
|-------------|-------------|
xs.toArray      | Converts the collection to an array
xs.toList       | Converts the collection to a list
xs.toIterable   | Converts the collection to an iterable
xs.toSeq        | Converts the collection to a sequence
xs.toIndexedSeq | Converts the collection to an indexed sequence
xs.toStream     | Converts the collection to a lazily computed stream
xs.toSet        | Converts the collection to a set
xs.toMap        | Converts the collection of key/value pair to a map

**Size:**

| Method Name | Description |
|-------------|-------------|
xs.isEmpty          | Tests whether collection is empty
xs.nonEmpty         | Tests whether collection contains elements
xs.size             | Returns number of elements in the collection
xs.hasDefiniteSize  | True if xs is known to have finite size

**Element retrieval:**

| Method Name | Description |
|-------------|-------------|
xs.head         | The first element of the collection OR some element, if no order is defined
xs.headOption   | The first element of xs in an option value OR none, if xs is empty
xs.last         | The last element of the collection OR some element, if no order is defined
xs.headOption   | The last element of xs in an option value OR none, if xs is empty


## Iterable

* Implementation of foreach is provided here

**Abstract method:**

| Method Name | Description |
|-------------|-------------|
xs iterator     | Iterate through each element of xs

**Implemented method:**

| Method Name | Description |
|-------------|-------------|
xs foreach f    | Executes function f for every element of xs


## Seq

* Seq has 2 sub traits
  * **IndexedSeq :** Should get used in case of accessing elements in random fashion
  * **LinearSeq  :** Should get used in case of traversing through each elements in collection linearly
* Elements in Seq can be accessible using index
  * e.g. scala.Array (Mutable)
  * e.g. scala.collection.immutable.List (Immutable)
* Array is special type of collection in scala (analogous to java Array)
* List of useful methods in Seq

**Indexing and length:**

| Method Name | Description |
|-------------|-------------|
xs(i)               | (or, written out, xs apply i). The element of xs at index i
xs isDefinedAt i    | Tests whether i is contained in xs.indices
xs.length           | The length of the sequence (same as size)
xs.indices          | The index range of xs, extending from 0 to xs.length - 1

**Index Search:**

| Method Name | Description |
|-------------|-------------|
xs indexOf x            | The index of the first element in xs equal to x (several variants exist)
xs lastIndexOf x        | The index of the last element in xs equal to x (several variants exist)
xs indexOfSlice ys      | The first index of xs such that successive elements starting from that index form the sequence ys
xs lastIndexOfSlice ys  | The last index of xs such that successive elements starting from that index form the sequence ys
xs indexWhere p         | The index of the first element in xs that satisfies p (several variants exist)
xs prefixLength p       | The length of the longest prefix of elements in xs that all satisfy the predicate p

**Additions:**

| Method Name | Description |
|-------------|-------------|
x +: xs	            | A new sequence that consists of x prepended to xs
xs :+ x             | A new sequence that consists of x appended to xs
xs padTo (len, x)   | The sequence resulting from appending the value x to xs until length len is reached

**Updates:**

| Method Name | Description |
|-------------|-------------|
xs patch (i, ys, r)     | The sequence resulting from replacing r elements of xs starting with i by the patch ys
xs updated (i, x)       | A copy of xs with the element at index i replaced by x
xs(i) = x               | (or, written out, xs.update(i, x), only available for mutable.Seqs). Changes the element of xs at index i to x

**Sorting:**

| Method Name | Description |
|-------------|-------------|
xs.sorted       | A new sequence obtained by sorting the elements of xs using the standard ordering of the element type of xs
xs sortWith lt  | A new sequence obtained by sorting the elements of xs using lt as comparison operation
xs sortBy f     | A new sequence obtained by sorting the elements of xs. Comparison between two elements proceeds by mapping the function f over both and comparing the results

**Reversals:**

| Method Name | Description |
|-------------|-------------|
xs.reverse	        | A sequence with the elements of xs in reverse order
xs.reverseIterator  | An iterator yielding all the elements of xs in reverse order
xs reverseMap f     | A sequence obtained by mapping f over the elements of xs in reverse order

**Comparisons:**

| Method Name | Description |
|-------------|-------------|
xs startsWith ys        | Tests whether xs starts with sequence ys (several variants exist)
xs endsWith ys          | Tests whether xs ends with sequence ys (several variants exist)
xs contains x           | Tests whether xs has an element equal to x
xs containsSlice ys     | Tests whether xs has a contiguous subsequence equal to ys
(xs corresponds ys)(p)  | Tests whether corresponding elements of xs and ys satisfy the binary predicate p

**Multiset Operations:**

| Method Name | Description |
|-------------|-------------|
xs intersect ys     | The multi-set intersection of sequences xs and ys that preserves the order of elements in xs
xs diff ys          | The multi-set difference of sequences xs and ys that preserves the order of elements in xs
xs union ys         | Multiset union; same as xs ++ ys
xs.distinct         | A sub-sequence of xs that contains no duplicated element


## Set

* Set does not allowed duplicate elements
* Element can't be accessible using index
* By default set is immutable, but there is mutable one as well
* SortedSet can be used to sort data (if implicit ordering is defined for element)
* List of useful methods:

**Additions:**

| Method Name | Description |
|-------------|-------------|
+       | Add one element to set, yielding a new set
++      | Add multiple elements to set, yielding a new set

**Removals:**

| Method Name | Description |
|-------------|-------------|
-       | Remove one element from set, yielding a new set
--      | Remove multiple elements from set, yielding a new set

**Test:**

| Method Name | Description |
|-------------|-------------|
contains    | Remove one element from set, yielding a new set
apply       | It is same as contains

**Others:**

| Method Name | Description |
|-------------|-------------|
union       | It will perform union operation on multiple set
intersect   | It will find out common elements from multiple set
diff        | It will find out elements present in first set and not present in second set
pipe        | Same as union
&           | Same as intersect
&~          | Same as diff


## Map

* Map is iterable of key/value pair
* Each element can be defined as key -> value OR (key, value)
* List of useful methods:

**Additions:**

| Method Name | Description |
|-------------|-------------|
+       | Add single key/value pair to a map OR changing existing bindings
+=      | Add single key/value pair to a map OR changing existing bindings (only applicable to mutable map)
++      | Add multiple key/value pair to a map OR changing existing bindings
++=     | Add multiple key/value pair to a map OR changing existing bindings (only applicable to mutable map)

**Removals:**

| Method Name | Description |
|-------------|-------------|
-       | Remove single key/value pair to a map OR changing existing bindings
-=      | Remove single key/value pair to a map OR changing existing bindings (only applicable to mutable map)
--      | Remove multiple key/value pair to a map OR changing existing bindings
--=     | Remove multiple key/value pair to a map OR changing existing bindings (only applicable to mutable map)

**Lookups:**

| Method Name | Description |
|-------------|-------------|
apply       | Lookup value from map
get         | Same as apply
getOrElse   | Lookup value from map, in case of key is not present it will result value provided in

**Test Operations:**

| Method Name | Description |
|-------------|-------------|
contains        | Tests whether key is present in map or not
isDefinedAt     | Same as contains

**Sub-collection Operations:**

| Method Name | Description |
|-------------|-------------|
keys            |
keysIterator    |
keySet          |
values          |
valuesIterator  |

**Transformations:**

| Method Name | Description |
|-------------|-------------|
filter          |
filterKeys      |
mapValues       |


## Tuple

* Tuple can contains heterogeneous type of elements but collection can have same type of elements
  * e.g. `(1, "Hello", 2.0, Order(1, "2017-01-01", 100, "COMPLETE"))`
* Tuple and Map are not same, map can be considered as paired tuple


### **_Note:_** 

* What is trait? - It's a combination of feature provided by interface and abstract class (in terms of java)
* Aggregation : reduce/fold method is parallel in nature to compute output
* Aggregation : reduceLeft/foldLeft & reduceRight/foldRight method is linear in nature to compute output
* Sorting : There is something called implicit ordering function in scala and each value classes (i.e. Int, Float, Double, etc.) have implemented it 