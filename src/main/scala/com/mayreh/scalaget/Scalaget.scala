package com.mayreh.scalaget

/**
 * Created by hokada on 2/20/15.
 */

class Scalaget(val rootUrl: String) {
//  def download(maxDepth: Int) = {
//    @tailrec
//    def download_iter(queue: Queue[(String, Int)],
//                      visited: Set[String],
//                      result: List[String]): List[String] = {
//      val ((url, depth), dequeued) = queue.dequeue
//
//      if(depth > maxDepth) {
//        result
//      } else {
//        val response = Http(url).execute()
//        val (urls, text) = response.headers.get("Content-Type") match {
//          case Some(t) if t.startsWith("text") => {
//            val body = response.textBody
//            (List[String]().zip(Stream.continually(depth + 1)), Some(body))
//          }
//          case _ => (Nil, None)
//        }
//        download_iter(dequeued.enqueue(urls),
//          visited + url,
//          text match {
//            case Some(t) => t::result
//            case _ => result
//          })
//      }
//    }
//    download_iter(Queue((rootUrl, 0)), Set[String](), List[String]())
//  }
}

object Scalaget {
  def apply(url: String) = {
    new Scalaget(url)
  }
}
