package proj1

import org.apache.commons.codec.{Decoder, Encoder}
import org.apache.commons.codec.binary.Base64

object Proj1Content {
  val message = "This is sub project 1."
  def test():String = {
    val d:Encoder = new Base64()
    d.encode(message).toString
  }
}