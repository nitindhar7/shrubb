package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonProperty, JsonIgnoreProperties}
import scala.reflect.BeanProperty
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown=true)
case class Multipost @JsonCreator() (
  @JsonProperty("position") @BeanProperty @NotNull position: Int,
  @JsonProperty("type") @BeanProperty @NotNull `type`: String,
  @JsonProperty("content") @BeanProperty content: String,
  @JsonProperty("formatted_content") @BeanProperty formattedContent: String,
  @JsonProperty("title") @BeanProperty title: String,
  @JsonProperty("url") @BeanProperty url: String,
  @JsonProperty("snaps") @BeanProperty snap: Snap
) extends AbstractData