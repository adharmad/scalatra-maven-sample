import org.scalatra.LifeCycle
import javax.servlet.ServletContext
import cook.HerbApi

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext) {

    context mount (new HerbApi, "/myherbs/*")
  }
}