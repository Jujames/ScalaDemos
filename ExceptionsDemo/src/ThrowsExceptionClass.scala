

class ThrowsExceptionClass {
  
  // Using Try Catch block
  
  @throws(classOf[Exception])
  def doThrow {
    throw new Exception("Catch it!")
    
  }
}