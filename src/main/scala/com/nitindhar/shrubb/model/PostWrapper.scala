package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonIgnoreProperties, JsonProperty}
import scala.reflect.BeanProperty
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown=true)
case class PostWrapper @JsonCreator() (
  @JsonProperty("posts") @BeanProperty @NotNull posts: List[Post]
) extends AbstractData