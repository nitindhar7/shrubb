package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonIgnoreProperties, JsonProperty}
import scala.reflect.BeanProperty
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown=true)
case class Photo @JsonCreator() (
  @JsonProperty("xl_url") @BeanProperty @NotNull xlUrl: String,
  @JsonProperty("large_url") @BeanProperty @NotNull largeUrl: String,
  @JsonProperty("medium_url") @BeanProperty @NotNull mediumUrl: String,
  @JsonProperty("small_url") @BeanProperty @NotNull smallUrl: String,
  @JsonProperty("thumb_url") @BeanProperty @NotNull thumbUrl: String
) extends AbstractData