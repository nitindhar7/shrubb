package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonIgnoreProperties, JsonProperty}
import scala.reflect.BeanProperty
import javax.annotation.Nonnull
import com.google.common.base.Preconditions

@JsonIgnoreProperties(ignoreUnknown=true)
case class Auth @JsonCreator() (
  @JsonProperty("token") @BeanProperty @Nonnull accessToken: String,
  @JsonProperty("user_id") @BeanProperty @Nonnull userId: Int
) extends AbstractData {
  Preconditions.checkNotNull(accessToken, "accessToken must not be null")
  Preconditions.checkNotNull(userId, "userId must not be null")
}