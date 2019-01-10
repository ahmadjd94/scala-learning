package controllers

import javax.inject._
import play.api._
import play.api.mvc._


import com.google.inject.Guice
import com.google.inject.AbstractModule

import impls.Student

import human.Human


class HumanModule extends AbstractModule {
  @Override
  protected def configure() {
    bind(classOf[Human]).to(classOf[Student])
  }
}



/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */


@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */


  def index() = Action { implicit request: Request[AnyContent] =>
    var students = new Student()
    val injector = Guice.createInjector(new HumanModule)
    val component = injector.getInstance(classOf[Human])
    print(component.computeAge())
    print(students.computeAge)
    Ok(views.html.index())
  }
}
