import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun add() {
        val addPost =
            Post(
                id = 0,
                ownerId = 0,
                fromId = 0,
                canPin = false,
                isFavorite = false,
                text = "text",
                replyPostId = 0,
                canEdit = false,
                isPinned = false,
                comments = Comments(
                    count = 0, canPost = false, groupsCanPost = false
                ),
                canDelete = false,
                copyHistory = null,
                createdBy = 5,
                friendsOnly = false,
                signerId = 5,
                date = 5,
                geo = Geo(
                    type = "type",
                    coordinates = "coordinates",
                    place = Place(
                        id = 1,
                        title = "title",
                        latitude = 1,
                        longitude = 1,
                        created = 1,
                        icon = "icon",
                        country = "country",
                        city = "city",
                    ),

                ),
                likes = Likes(
                    count = 1,
                    userLikes = false,
                    canLike = false,
                    canPublish = false,
                ),
                reposts = Reposts(
                    count = 2,
                    userPeposted = false,
                ),
                postSource = PostSource(
                    type = "type",
                    platform = "platform",
                    data = "01.01.22",
                    url = "url"
                ),
                postType = "postType",
                replyOwnerId = 5,
                attachments = emptyArray()
            )
        val post = WallService.add(addPost)
        assertNotEquals(0, post.id)
    }

    @Test
    fun updateSuccess() {
        val addPost =
            Post(
                id = 0,
                ownerId = 0,
                fromId = 0,
                canPin = false,
                isFavorite = false,
                text = "text",
                replyPostId = 0,
                canEdit = false,
                isPinned = false,
                comments = Comments(
                    count = 0, canPost = false, groupsCanPost = false
                ),
                canDelete = false,
                copyHistory = null,
                createdBy = 5,
                friendsOnly = false,
                signerId = 5,
                date = 5,
                geo = Geo(
                    type = "type",
                    coordinates = "coordinates",
                    place = Place(
                        id = 1,
                        title = "title",
                        latitude = 1,
                        longitude = 1,
                        created = 1,
                        icon = "icon",
                        country = "country",
                        city = "city",
                    ),

                    ),
                likes = Likes(
                    count = 1,
                    userLikes = false,
                    canLike = false,
                    canPublish = false,
                ),
                reposts = Reposts(
                    count = 2,
                    userPeposted = false,
                ),
                postSource = PostSource(
                    type = "type",
                    platform = "platform",
                    data = "01.01.22",
                    url = "url"
                ),
                postType = "postType",
                replyOwnerId = 5,
                attachments = emptyArray()
            )
        val post = WallService.add(addPost)
        val updateResult = WallService.update(post)
        assertTrue(updateResult)
    }

    @Test
    fun updateFail() {
        val addPost =
            Post(
                id = 0,
                ownerId = 0,
                fromId = 0,
                canPin = false,
                isFavorite = false,
                text = "text",
                replyPostId = 0,
                canEdit = false,
                isPinned = false,
                comments = Comments(
                    count = 0, canPost = false, groupsCanPost = false
                ),
                canDelete = false,
                copyHistory = null,
                createdBy = 5,
                friendsOnly = false,
                signerId = 5,
                date = 5,
                geo = Geo(
                    type = "type",
                    coordinates = "coordinates",
                    place = Place(
                        id = 1,
                        title = "title",
                        latitude = 1,
                        longitude = 1,
                        created = 1,
                        icon = "icon",
                        country = "country",
                        city = "city",
                    ),

                    ),
                likes = Likes(
                    count = 1,
                    userLikes = false,
                    canLike = false,
                    canPublish = false,
                ),
                reposts = Reposts(
                    count = 2,
                    userPeposted = false,
                ),
                postSource = PostSource(
                    type = "type",
                    platform = "platform",
                    data = "01.01.22",
                    url = "url"
                ),
                postType = "postType",
                replyOwnerId = 5,
                attachments = emptyArray()
            )
        val post = WallService.add(addPost)
        val updateResult = WallService.update(post.copy(id = 85))
        assertFalse(updateResult)
    }
}