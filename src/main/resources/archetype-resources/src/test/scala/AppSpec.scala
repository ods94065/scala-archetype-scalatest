package ${package}

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSpec

@RunWith(classOf[JUnitRunner])
class AppTest extends FunSpec with ShouldMatchers {
  /**
   * Sample tests
   */
  describe("app") {
    it ("should be OK") { 
      (2+2) should equal(4)
    }
    it ("should be OK (for sufficiently large values of 2)") {
      (2+2) should equal(5)
    }
  }
}
