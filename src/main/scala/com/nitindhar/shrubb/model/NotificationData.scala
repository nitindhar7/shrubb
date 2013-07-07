package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonProperty, JsonIgnoreProperties}
import scala.reflect.BeanProperty
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown=true)
case class NotificationData @JsonCreator() (
  @JsonProperty("actor") @BeanProperty @NotNull actor: String,
  @JsonProperty("actor_url") @BeanProperty @NotNull actorUrl: String,
  @JsonProperty("object_url") @BeanProperty @NotNull objectUrl: String,
  @JsonProperty("post_type") @BeanProperty @NotNull postType: String,
  @JsonProperty("post_title") @BeanProperty @NotNull postTitle: String,
  @JsonProperty("photo") @BeanProperty @NotNull photo: String
) extends AbstractData