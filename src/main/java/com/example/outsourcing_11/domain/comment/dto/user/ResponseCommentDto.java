package com.example.outsourcing_11.domain.comment.dto.user;

import com.example.outsourcing_11.domain.comment.entity.Comment;
import lombok.Getter;

@Getter
public class ResponseCommentDto {
    private final Long id;
    private final String content;
    private final int rating;
    private final String imageUrl;
    private final String createdAt;
    private final String modifiedAt;

    public ResponseCommentDto(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
        this.imageUrl = comment.getImageUrl();
        this.rating = comment.getRating();
        this.createdAt = comment.getCreatedAt().toString();
        this.modifiedAt = comment.getUpdatedAt().toString();
    }
}
