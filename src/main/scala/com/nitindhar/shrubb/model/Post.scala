package com.nitindhar.shrubb.model

import org.codehaus.jackson.annotate.{JsonCreator, JsonIgnoreProperties, JsonProperty}
import scala.reflect.BeanProperty
import javax.validation.constraints.NotNull

@JsonIgnoreProperties(ignoreUnknown=true)
case class Post @JsonCreator() (
  @JsonProperty("id") @BeanProperty @NotNull id: Int,
  @JsonProperty("tiny_id") @BeanProperty @NotNull tinyId: String,
  @JsonProperty("post_type") @BeanProperty @NotNull postType: String,
  @JsonProperty("post_url") @BeanProperty @NotNull postUrl: String,
  @JsonProperty("created_at") @BeanProperty @NotNull createdAt: String,
  @JsonProperty("updated_at") @BeanProperty @NotNull updatedAt: String,
  @JsonProperty("user") @BeanProperty @NotNull user: User,
  @JsonProperty("published") @BeanProperty @NotNull published: Boolean,
  @JsonProperty("public") @BeanProperty @NotNull public: Boolean,
  @JsonProperty("title") @BeanProperty @NotNull title: String,
  @JsonProperty("url") @BeanProperty @NotNull url: String,
  @JsonProperty("content") @BeanProperty @NotNull content: String,
  @JsonProperty("description") @BeanProperty @NotNull description: String,
  @JsonProperty("view_count") @BeanProperty @NotNull viewCount: Int,
  @JsonProperty("like_count") @BeanProperty @NotNull likeCount: Int,
  @JsonProperty("comment_count") @BeanProperty @NotNull commentCount: Int,
  @JsonProperty("tag_string") @BeanProperty @NotNull tagString: String,
  @JsonProperty("snaps") @BeanProperty @NotNull snaps: Snap,
  @JsonProperty("multiposts") @BeanProperty @NotNull multiposts: List[Multipost]
) extends AbstractData