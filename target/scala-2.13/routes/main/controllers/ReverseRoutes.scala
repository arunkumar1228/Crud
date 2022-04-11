// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers {

  // @LINE:8
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseAppController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def getAll: Call = {
    
      () match {
      
        // @LINE:11
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "user")
      
      }
    
    }
  
    // @LINE:16
    def add: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/todos/add")
    }
  
    // @LINE:15
    def getById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/todos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:18
    def delete(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/todos/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:17
    def update(id:String, fname:String, lname:String, mobile:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/todos/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("fname", fname)) + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("lname", lname)) + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("mobile", mobile)))
    }
  
  }


}
