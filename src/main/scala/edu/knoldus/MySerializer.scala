package edu.knoldus

import java.util

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.apache.kafka.common.serialization.Serializer

class MySerializer extends Serializer[UserMessage] {

  override def configure(configs: util.Map[String, _], isKey: Boolean): Unit = {
  }

  override def serialize(topic: String, data: UserMessage): Array[Byte] = {
    try {
      val mapper = new ObjectMapper()
      mapper.registerModule(DefaultScalaModule)
      println(mapper.writeValueAsString(data))
      val result = mapper.writeValueAsString(data).getBytes()
      result
    }
    catch {
      case ex: JsonProcessingException => throw new IllegalArgumentException(ex);
    }
  }

  override def close(): Unit = {

  }
}
