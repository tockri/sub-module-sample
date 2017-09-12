package proj2

import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder

object Proj2Content {
  val message = "This is sub project 2."
  def test():String = {
    val c = HttpClientBuilder.create().build()
    val get = new HttpGet("https://www.nulab-inc.com")
    val response = c.execute(get)
    "get https://www.nulab-inc.com:  \n" + response.toString

  }
}
