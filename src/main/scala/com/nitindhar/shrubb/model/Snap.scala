package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonIgnoreProperties, JsonProperty}
import scala.reflect.BeanProperty
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown=true)
case class Snap @JsonCreator() (
  @JsonProperty("mega_url") @BeanProperty @NotNull megaUrl: String,
  @JsonProperty("keith_url") @BeanProperty @NotNull keithUrl: String,
  @JsonProperty("large_url") @BeanProperty @NotNull largeUrl: String,
  @JsonProperty("medium_url") @BeanProperty @NotNull mediumUrl: String,
  @JsonProperty("small_url") @BeanProperty @NotNull smallUrl: String,
  @JsonProperty("thumb_url") @BeanProperty @NotNull thumbUrl: String,
  @JsonProperty("original_url") @BeanProperty @NotNull originalUrl: String
) extends AbstractData