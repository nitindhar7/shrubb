package com.nitindhar.shrubb

import com.google.common.base.Optional
import com.nitindhar.shrubb.model._

trait Shrubb {

  def getStats: Stat

  def getNotifications(accessToken: String, opts: Map[String,String]): List[Notification]

  def authenticateUser(emailOrUsername: String, password: String): Optional[Auth]

  def getUser(userInfo: Map[String,String]): User

  def getUserPosts(userInfo: Map[String,String], opts: Map[String,String]): List[Post]

  def getPost(id: Int): Post

  def getPosts(opts: Map[String,String]): List[Post]

  def getPostsByType(postType: String, opts: Map[String,String]): List[Post]

  def getPostComments(accessToken: String, id: Int): List[Comment]

}