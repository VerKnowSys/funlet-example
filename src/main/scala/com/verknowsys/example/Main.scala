package com.verknowsys.example

import com.verknowsys.funlet._

class Main extends MainEndpoint {
    override def routes(implicit req: Request) = {
        case Get(Nil) => "<h1>Hello funlet!</h1><a href='/hello'>Hello from template</a>"
        case Get("hello" :: Nil) => render("hello", "date" -> new java.util.Date)
    }
}