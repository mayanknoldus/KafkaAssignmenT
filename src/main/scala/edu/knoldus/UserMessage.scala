package edu.knoldus

//{"id":"1","name":"some_name","age":"24","course":"BTech."}
 abstract class UserMessage {

  var id : Int
  var name : String
  var age : Int
  var course : String

  def this(id : Int, name : String, age : Int, course : String){
    this()
    this.id = id
    this.name = name
    this.age = age
    this.course = course
  }

}
