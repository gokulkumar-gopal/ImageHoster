package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//Comment service handles all methods related to comments
@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    //calls the create Comment method in repository
    public void createComment(Comment comment) {
        commentRepository.createComment(comment);
    }

    //get all comments for a given image
    public List<Comment> getAllComments(Integer imageId) {
        return commentRepository.getAllComments(imageId);
    }
}
