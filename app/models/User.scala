package models

import play.api.data.Form
import play.api.data.Forms.{mapping, nonEmptyText}
import slick.jdbc.MySQLProfile.api._
import slick.lifted.{ProvenShape, Tag}

import scala.concurrent.{ExecutionContext, Future}


case class User(id: String, fName: String, lName: String, mobile: String)

object UserForm {
  val form = Form(
    mapping(
      "id" -> nonEmptyText,
      "fName" -> nonEmptyText,
      "lName" -> nonEmptyText,
      "mobile" -> nonEmptyText,
    )(User.apply)(User.unapply)
  )
}

class UserData(tag: Tag) extends Table[User](tag, "persons") {

  override def * : ProvenShape[User] = (id, fName, lName, mobile) <> (User.tupled, User.unapply)

  def id: Rep[String] = column[String]("id")

  def fName: Rep[String] = column[String]("fName")

  def lName: Rep[String] = column[String]("lName")

  def mobile: Rep[String] = column[String]("mobile")
}
