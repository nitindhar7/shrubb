package com.nitindhar.shrubb.model

import org.apache.commons.lang3.builder.ReflectionToStringBuilder

abstract class AbstractData {

  override def toString: String = {
    ReflectionToStringBuilder.toString(this)
  }

}