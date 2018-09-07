package topcoder.test.scala

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.scala.SRM534_2_1.getFiles

class SRM534_2_1_TEST extends FunSuite with ShouldMatchers {

  test("Case 0") { getFiles(
    Array("ContestApplet.jnlp", ".", "Image.jpg", "..", "Book.pdf", "Movie.avi")
    ) should equal (Array("ContestApplet.jnlp", "Movie.avi", "Image.jpg", "Book.pdf", "..", "." )) }

  test("Case 1") { getFiles(
    Array("Image.jpg", "..", ".")
    ) should equal (Array("Image.jpg", "..", "." )) }

  test("Case 2") { getFiles(
    Array("..", ".", "Image.jpg")
    ) should equal (Array("Image.jpg", ".", ".." )) }

  test("Case 3") { getFiles(
    Array("No", "..", "Zaphod", ".", "Just", "very", "very...", "Improbable")
    ) should equal (Array("No", "Improbable", "Zaphod", "very...", "Just", "very", ".", ".." )) }

  test("Case 4") { getFiles(
    Array("www.topcoder.com", "Ever.tried", ".", "Ever.failed", "..", "No", "Matter.", "Try", "Again.", "Fail", "Again..", "Fail.Better")
    ) should equal (
    Array("www.topcoder.com",
          "Ever.tried",
          "Fail.Better",
          "Ever.failed",
          "Again..",
          "No",
          "Matter.",
          "Try",
          "Again.",
          "Fail",
          "..",
          "." )) }

  test("Case 5") { getFiles(
    Array("This", ".", "is", "tricky", "test", "..")
    ) should equal (Array("This", "test", "is", "tricky", "..", "." )) }

}