package ru.netology

object WallService {
    private var curId: Int = 1
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        post.id = curId;
        posts += post
        curId ++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var result = false
        for(ps in posts) {
            if(ps.id == post.id) {
                // Id
                // ownerId
                ps.fromId = post.fromId
                ps.createdBy = post.createdBy
                // date
                ps.text = post.text
                ps.replyOwnerId = post.replyOwnerId
                ps.friendsOnly = post.friendsOnly
                ps.comments = post.comments
                ps.copyright = post.copyright
                ps.likes = post.likes
                ps.reposts = post.reposts
                ps.views  = post.views
                ps.postType = post.postType
                ps.signerId = post.signerId
                ps.canPin = post.canPin
                ps.canDelete = post.canDelete
                ps.canEdit = post.canEdit
                ps.isPinned = post.isPinned
                ps.markedAsAds = post.markedAsAds
                ps.isFavorite = post.isFavorite
                ps.postponedId = post.postponedId
                result = true
            }
        }
        return result
    }
}