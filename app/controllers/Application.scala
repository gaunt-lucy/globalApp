package controllers

import play.api._
import play.api.mvc._
import slick.jdbc.H2Profile.api._

object Application extends Controller {

  def index = Action {
    Ok("Hello world.")
  }

  def hello(name: String) = Action (
    Ok(views.html.hello(name))
  )

  def page(name: String) = Action (
    Ok(views.html.page(name))
  )

  val db = Database.forConfig("h2mem1")

  val action = sql"select ID, NAME, AGE from PERSON".as[(Int,String,Int)]
  db.run(action)
}