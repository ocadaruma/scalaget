package com.mayreh.scalaget

import akka.actor.Actor

/**
 * Created by hokada on 2/20/15.
 */

class Downloader extends Actor {
  override def receive: Receive = {
    case url: String => {
      scala.io.Source.fromURL(url).mkString
    }
    case _ => println("invalid message")
  }
}
