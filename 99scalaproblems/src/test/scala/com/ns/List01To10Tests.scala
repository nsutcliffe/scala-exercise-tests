package com.ns

import org.scalatest.{FlatSpec, Matchers}
import com.ns.List01To10._

object List01To10Tests extends FlatSpec with Matchers{

  "last" should "return last element of the list" in {
    last(List(1, 1, 2, 3, 5, 8)) shouldBe 8
  }

  "penultimate" should "return the second last element of a list" in {
    penultimate(List(1, 1, 2, 3, 5, 8)) shouldBe 5
    penultimate(List("A","B","d","E")) shouldBe "d"
  }

  "nth" should "return the nth element of the list" in {
    nth(2, List(1, 1, 2, 3, 5, 8)) shouldBe 2
  }

  "length" should "return the number of elements of a list" in {
    List01To10.length(List(1, 1, 2, 3, 5, 8)) shouldBe 6
    List01To10.length(List.empty[Double]) shouldBe 0
  }

  "reverse" should "return a list with the elements in reverse order" in {
    reverse(List(1, 1, 2, 3, 5, 8)) shouldBe List(8, 5, 3, 2, 1, 1)
  }

  "isPalindrome" should "return true if a list is a palindrome" in {
    isPalindrome(List(1, 2, 3, 2, 1)) shouldBe true
  }

  "isPalindrome" should "return false if a list is not a palindrome" in {
    isPalindrome(List(1, 2, 3, 5, 2, 1)) shouldBe false
  }

  "flatten" should "flatten a nested list structure" in {
    flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldBe List(1, 1, 2, 3, 5, 8)
  }

  "compress" should "remove consecutive duplicates of list elements" in {
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List('a, 'b, 'c, 'a, 'd, 'e)
  }

  "pack" should "put consecutive duplicates of list elements into sublists" in {
    pack(
      List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    ) shouldBe
      List(
        List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)
      )
  }

  "encode" should "run length encoding of a list" in {
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }

}