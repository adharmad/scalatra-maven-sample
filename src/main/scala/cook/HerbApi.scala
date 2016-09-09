package cook

import dataobjects.Herb
import org.json4s.{DefaultFormats, Formats}
import org.scalatra._
import org.scalatra.json.JacksonJsonSupport
import org.scalatra.scalate.ScalateSupport

class HerbApi extends ScalatraServlet with ScalateSupport with JacksonJsonSupport{

  //Automatically converts Scalatra action to Json
  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  get("/") {
      "Hello from the world of Herbs!"

  }
  get("/Herbs") {
    val herbs = Herb.herbList
    herbs
  }

  post("/Herbs") {
    println(parsedBody.extract[Herb])
  }

  // Before every action runs, set the content type to be in JSON format.
  before() {
    contentType = formats("json")
  }
}