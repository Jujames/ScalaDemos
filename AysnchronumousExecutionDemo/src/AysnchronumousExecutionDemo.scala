
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


object AysnchronumousExecutionDemo extends App {
  val fVal = Future {
     Thread.sleep(2000);
     "Hello, from the future."
     // 1/0 for failure
  }
  println(fVal.isCompleted)
  println(fVal.value)
  Thread.sleep(2500)
  println(fVal.isCompleted)
  println(fVal.value)
}