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
            )
        val post = WallService.add(addPost)
        val updateResult = WallService.update(post.copy(id = 85))
        assertFalse(updateResult)
    }
}