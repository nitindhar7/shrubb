package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonProperty, JsonIgnoreProperties}
import scala.reflect.BeanProperty
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown=true)
case class CommentWrapper @JsonCreator() (
  @JsonProperty("count") @BeanProperty @NotNull count: Int,
  @JsonProperty("comments") @BeanProperty @NotNull comments: List[Comment]
) extends AbstractData