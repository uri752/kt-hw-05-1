package ru.netology

data class Post(
    var id: Int = 0,
    var ownerId: Int = 0,
    var fromId: Int = 0,
    var createdBy: Int = 0,
    var date: Int = 0,
    var text: String = "no-text",
    var replyOwnerId: Int = 0,
    var friendsOnly: Boolean = false,
    var comments: Comments = Comments(),
    var copyright: Copyright = Copyright(),
    var likes: Likes = Likes(),
    var reposts: Reposts = Reposts(),
    var views: Views = Views(),
    var postType: PostType = PostType.POST,
    var signerId: Int = 0,
    var canPin: Boolean = false,
    var canDelete: Boolean = false,
    var canEdit: Boolean = false,
    var isPinned: Boolean = false,
    var markedAsAds: Boolean = false,
    var isFavorite: Boolean = false,
    var postponedId: Int = 0
)

data class Comments(
    var count: Int = 0,
    var canPost: Boolean = false,
    var groupsCanPost: Boolean = false,
    var canClose: Boolean = false,
    var canOpen: Boolean = false
)

data class Likes(
    var count: Int = 0,
    var userLikes: Boolean =false,
    var canLike: Boolean =false,
    var canPublish: Boolean = false
)

data class Reposts(
    var count: Int = 0,
    var userReposted: Boolean = false
)

data class Views(
    var count: Int = 0
)

data class Copyright(
    var id: Int = 0,
    var link: String = "",
    var name: String = "",
    var type: String = ""
)

enum class PostType {
    POST,COPY,REPLY,POSTPONE,SUGGEST
}