// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  Assets_0: controllers.Assets,
  // @LINE:11
  AppController_1: controllers.AppController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    Assets_0: controllers.Assets,
    // @LINE:11
    AppController_1: controllers.AppController
  ) = this(errorHandler, Assets_0, AppController_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, AppController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.AppController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos""", """controllers.AppController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos/""" + "$" + """id<[^/]+>""", """controllers.AppController.getById(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos/add""", """controllers.AppController.add"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos/update/""" + "$" + """id<[^/]+>""" + "$" + """fname<[^/]+>""" + "$" + """lname<[^/]+>""" + "$" + """mobile<[^/]+>""", """controllers.AppController.update(id:String, fname:String, lname:String, mobile:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/todos/delete/""" + "$" + """id<[^/]+>""", """controllers.AppController.delete(id:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AppController_getAll1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_AppController_getAll1_invoker = createInvoker(
    AppController_1.getAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppController",
      "getAll",
      Nil,
      "GET",
      this.prefix + """user""",
      """controllers mapping""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_AppController_getAll2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos")))
  )
  private[this] lazy val controllers_AppController_getAll2_invoker = createInvoker(
    AppController_1.getAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppController",
      "getAll",
      Nil,
      "GET",
      this.prefix + """api/todos""",
      """controllers mapping""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_AppController_getById3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppController_getById3_invoker = createInvoker(
    AppController_1.getById(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppController",
      "getById",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/todos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AppController_add4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos/add")))
  )
  private[this] lazy val controllers_AppController_add4_invoker = createInvoker(
    AppController_1.add,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppController",
      "add",
      Nil,
      "POST",
      this.prefix + """api/todos/add""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_AppController_update5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos/update/"), DynamicPart("id", """[^/]+""",true), DynamicPart("fname", """[^/]+""",true), DynamicPart("lname", """[^/]+""",true), DynamicPart("mobile", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppController_update5_invoker = createInvoker(
    AppController_1.update(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppController",
      "update",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "PUT",
      this.prefix + """api/todos/update/""" + "$" + """id<[^/]+>""" + "$" + """fname<[^/]+>""" + "$" + """lname<[^/]+>""" + "$" + """mobile<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AppController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/todos/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppController_delete6_invoker = createInvoker(
    AppController_1.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """api/todos/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_AppController_getAll1_route(params@_) =>
      call { 
        controllers_AppController_getAll1_invoker.call(AppController_1.getAll)
      }
  
    // @LINE:14
    case controllers_AppController_getAll2_route(params@_) =>
      call { 
        controllers_AppController_getAll2_invoker.call(AppController_1.getAll)
      }
  
    // @LINE:15
    case controllers_AppController_getById3_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_AppController_getById3_invoker.call(AppController_1.getById(id))
      }
  
    // @LINE:16
    case controllers_AppController_add4_route(params@_) =>
      call { 
        controllers_AppController_add4_invoker.call(AppController_1.add)
      }
  
    // @LINE:17
    case controllers_AppController_update5_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromPath[String]("fname", None), params.fromPath[String]("lname", None), params.fromPath[String]("mobile", None)) { (id, fname, lname, mobile) =>
        controllers_AppController_update5_invoker.call(AppController_1.update(id, fname, lname, mobile))
      }
  
    // @LINE:18
    case controllers_AppController_delete6_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_AppController_delete6_invoker.call(AppController_1.delete(id))
      }
  }
}
