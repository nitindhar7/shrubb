package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonIgnoreProperties, JsonProperty}
import scala.reflect.BeanProperty
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown=true)
case class User @JsonCreator() (
  @JsonProperty("id") @BeanProperty @NotNull id: Int,
  @JsonProperty("username") @BeanProperty @NotNull username: String,
  @JsonProperty("name") @BeanProperty @NotNull name: String,
  @JsonProperty("url") @BeanProperty @NotNull url: String,
  @JsonProperty("posts") @BeanProperty @NotNull posts: Int,
  @JsonProperty("comments") @BeanProperty @NotNull comments: Int,
  @JsonProperty("likes") @BeanProperty @NotNull likes: Int,
  @JsonProperty("followers") @BeanProperty @NotNull followers: Int,
  @JsonProperty("following") @BeanProperty @NotNull following: Int,
  @JsonProperty("photos") @BeanProperty @NotNull photo: Photo,
  @JsonProperty("bio") @BeanProperty @NotNull bio: String,
  @JsonProperty("is_a") @BeanProperty @NotNull isA: String,
  @JsonProperty("homepage_url") @BeanProperty @NotNull homepageUrl: String,
  @JsonProperty("twitter") @BeanProperty @NotNull twitter: String,
  @JsonProperty("in_directory") @BeanProperty @NotNull inDirectory: Boolean,
  @JsonProperty("tag_string") @BeanProperty @NotNull tagString: String
) extends AbstractData