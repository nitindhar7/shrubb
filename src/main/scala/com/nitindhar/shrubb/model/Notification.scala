package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonProperty, JsonIgnoreProperties}
import scala.reflect.BeanProperty
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown=true)
case class Notification @JsonCreator() (
  @JsonProperty("id") @BeanProperty @NotNull id: Int,
  @JsonProperty("timestamp") @BeanProperty @NotNull timestamp: Long,
  @JsonProperty("behavior") @BeanProperty @NotNull behavior: String,
  @JsonProperty("for_user_id") @BeanProperty @NotNull forUserId: Int,
  @JsonProperty("object_type") @BeanProperty @NotNull objectType: String,
  @JsonProperty("object_id") @BeanProperty @NotNull objectId: Int,
  @JsonProperty("data") @BeanProperty @NotNull data: NotificationData
) extends AbstractData