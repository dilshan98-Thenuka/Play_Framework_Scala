package controllers

import javax.inject._

import play.api.mvc._

import views.html.Home._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index: Action[AnyContent] = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def about: Action[AnyContent] = Action {
    Ok(views.html.index("Hello My new Try..."))

  }
  def welcome(name : String, lastname : String): Action[AnyContent] = Action {
    Ok(views.html.Home.welcome.render(name, lastname))

  }

}
