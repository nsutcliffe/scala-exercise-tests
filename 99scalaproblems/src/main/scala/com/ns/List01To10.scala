package com.ns

object List01To10 {

  /**
    * P01 (*) Find the last element of a list.
    * Example:
    * scala> last(List(1, 1, 2, 3, 5, 8))
    * res0: Int = 8
    */
  def last[T](l:List[T]):T = ???

  /**
    * P02 (*) Find the last but one element of a list.
    * Example:
    * scala> penultimate(List(1, 1, 2, 3, 5, 8))
    * res0: Int = 5
    */
  def penultimate[T](l:List[T]): T = ???

  /**
    * P03 (*) Find the Kth element of a list.
    * By convention, the first element in the list is element 0.
    * Example:
    *
    * scala> nth(2, List(1, 1, 2, 3, 5, 8))
    * res0: Int = 2
    */
  def nth[T](n:Int, l:List[T]):T = ???

  /**
    * P04 (*) Find the number of elements of a list.
    * Example:
    * scala> length(List(1, 1, 2, 3, 5, 8))
    * res0: Int = 6
    */
  def length[T](l:List[T]): Int = ???

  /**
    * P05 (*) Reverse a list.
    * Example:
    * scala> reverse(List(1, 1, 2, 3, 5, 8))
    * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
    */
  def reverse[T](l:List[T]): List[T] = ???

  /**
    * P06 (*) Find out whether a list is a palindrome.
    * Example:
    * scala> isPalindrome(List(1, 2, 3, 2, 1))
    * res0: Boolean = true
    */
  def isPalindrome[T](l:List[T]): Boolean = ???

  /**
    * P07 (**) Flatten a nested list structure.
    * Example:
    * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
    */
  def flatten[T](l:List[Any]):List[T] = ???

  /**
    * P08 (**) Eliminate consecutive duplicates of list elements.
    * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
    * Example:
    *
    * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
    */
  def compress[T](l:List[T]):List[T] = ???

  /**
    * P09 (**) Pack consecutive duplicates of list elements into sublists.
    * If a list contains repeated elements they should be placed in separate sublists.
    * Example:
    *
    * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    */
  def pack[T](l:List[T]):List[List[T]] = ???

  /**
    * P10 (*) Run-length encoding of a list.
    * Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
    * Example:
    *
    * scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    */
  def encode[T](l:List[T]):List[(Int, T)] = ???

}