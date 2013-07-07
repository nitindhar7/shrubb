Shrubb
======
shrubb is a Scala library for the Forrst API(v2). This library will provide basic support for reading posts, has minimal dependencies and is aimed to be easy to use.

Android
-------
Android platform to be tested soon!

Download Latest
---------------
A latest jar download link will be added soon.

Build & Use
-----------
Each API method in this library is heavily commented. The descriptions are taken directly from Forrst. Please check the official [Forrst API documentation](http://forrst.com/api) for up to date API definitions and descriptions.
To begin, build Shrubb and import it in your code.

    $ sbt compile

    import com.nitindhar.shrubb

    // Defaults to the async-http-client http implementation from Sonatype
    val shrubb: Shrubb = ShrubbFactory.instance

    // API stats
    shrubb.getStats

    // Authentication
    shrubb.authenticateUser("EMAIL_OR_USERNAME", "PASSWORD")

    // Notifications
    shrubb.getNotifications("ACCESS_TOKEN", options)

    // User information
    shrubb.getUser("USERNAME")

    // User posts
    shrubb.getUserPosts("USERNAME", options)

Note that each library API endpoint returns a JSONObject. For more information on JSONObject visit [json.org/java](http://json.org/java/). The dependency json-java jar file is also included in the `lib` folder.
Also, at the moment the rate limit threshold is soft, which means that it is up to the client application to ensure that it sticks close to the 150 calls/hour limit. This limit may become strictly
enforced eventually.

Details for the rest of the available API endpoints are given inline.

Contribute
------------
Submit well documented code with unit tests and I will merge your changes in
as long as your code does not break the build.

API Endpoints
-------------
This library is built around the Forrst API version 2. At the moment there are 9 API endpoints available and each of them uses `https://forrst.com/api/v2/` as the base URI. Also at the moment, API calls are rate limited to 150
calls per hour, so keep that in mind when designing your applications. Here's the list:

- `getStats`
- `getNotifications(accessToken: String, opts: Map[String,String])`
- `authenticateUser(emailOrUsername: String, password: String)`
- `getUser(userInfo: Map[String,String])`
- `getUserPosts(userInfo: Map[String,String], opts: Map[String,String])`
- `getPost(id: Int)`
- `getPosts(opts: Map[String,String])`
- `getPostsByType(postType: String, opts: Map[String,String])`
- `getPostComments(accessToken: String, id: Int)`

TODO
----

- Improve deserialization for Notifications
- Create enum : PostType instead of using String
- Upload to the [maven repository](http://maven.apache.org/guides/mini/guide-central-repository-upload.html)

Copyright
---------
Copyright (c) 2013 Nitin Dhar. See MIT-LICENSE for details.

Author
------

My aim is to make Forrst integration into Scala/Java applications as easy as possible. I have tried my best to provide in-code documentation for each method.

- Nitin Dhar

  - Forrst: https://forrst.com/people/nitindhar7
  - Site: http://softwarebynitin.com
  - Twitter: @nitin_dhar