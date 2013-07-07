package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonProperty, JsonIgnoreProperties}
import scala.reflect.BeanProperty
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown=true)
case class ForrstData[M] @JsonCreator() (
  @JsonProperty("resp") @BeanProperty @NotNull resp: M,
  @JsonProperty("stat") @BeanProperty @NotNull stat: String,
  @JsonProperty("in") @BeanProperty @NotNull in: Float,
  @JsonProperty("authed") @BeanProperty @NotNull authed: Boolean,
  @JsonProperty("env") @BeanProperty @NotNull env: String
) extends AbstractData