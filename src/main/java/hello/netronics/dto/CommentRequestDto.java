package hello.netronics.dto;

import lombok.Data;

@Data
public class CommentRequestDto {
    private Long postId;  // 어느 게시물에 댓글을 달 것인지
    private Long parentId;  // 부모 댓글 ID (대댓글일 경우)
    private String content;
}
