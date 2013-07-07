package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonIgnoreProperties, JsonProperty}
import scala.reflect.BeanProperty
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown=true)
case class Stat @JsonCreator() (
  @JsonProperty("rate_limit") @BeanProperty @NotNull rateLimit: Int,
  @JsonProperty("calls_made") @BeanProperty @NotNull callsMade: Int
) extends AbstractData