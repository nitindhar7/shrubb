package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonIgnoreProperties, JsonProperty}
import scala.reflect.BeanProperty
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown=true)
case class Comment @JsonCreator() (
  @JsonProperty("id") @BeanProperty @NotNull id: Int,
  @JsonProperty("user") @BeanProperty @NotNull user: User,
  @JsonProperty("body") @BeanProperty @NotNull body: String,
  @JsonProperty("created_at") @BeanProperty @NotNull createdAt: String,
  @JsonProperty("updated_at") @BeanProperty @NotNull updatedAt: String,
  @JsonProperty("replies") @BeanProperty replies: List[Comment]
) extends AbstractData