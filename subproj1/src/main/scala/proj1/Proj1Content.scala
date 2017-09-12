package proj1

import org.apache.commons.codec.Decoder
import org.apache.commons.codec.binary.Base64

object Proj1Content {
  val message = "This is sub project 1."
  def test():Unit = {
    val d:Decoder = new Base64()
    println(d.decode(message))
  }
}